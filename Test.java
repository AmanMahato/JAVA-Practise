import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test
{
    public static void main(String args[]) throws InterruptedException
    {
        System.out.println(Thread.currentThread().getName() + " is Started");

        class TestThread extends Thread
        {
            String name;
            public TestThread(String name)
            {
                this.name = name;
            }

            @Override
            public void run()
            {
                try
                {
                    System.out.println(this + " is Started");
                    Thread.sleep(2000);
                    System.out.println(this + " is Completed");
                }
                catch (InterruptedException ex)  {  ex.printStackTrace(); }
            }

            @Override
            public String toString()  { return "Thread " + name; }
        }

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(new TestThread("1"));

        boolean finished = executor.awaitTermination(1, TimeUnit.HOURS);

        if(finished)
        {
           //I should execute thread 2 only after thread 1 has finished
            executor.execute(new TestThread("2"));
        }

        //I should arrive here while process 1 and 2 go on with their execution
        System.out.println("Hello");
    }
}