class CellPhone {
    public void print() {
        System.out.println("I'm a cellphone");
    }
}

public class Animal extends CellPhone {
    @Override
    public void print() {
        //super.print();
        System.out.println("I'm a touch screen cellphone");
        super.print();
    }
    public static void main (String[] args) {
        Animal p = new Animal();
        p.print();
    }
}