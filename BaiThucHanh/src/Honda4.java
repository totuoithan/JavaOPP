abstract class Bike {
    abstract void run();
}
class Honda4 extends Bike{
    public void run(){
        System.out.println("running safery..");
    }

    public static void main(String[] args) {
        Bike obj = new Honda4();
        obj.run();
    }
}
