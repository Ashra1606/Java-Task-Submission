public class Car {
    String brand;
    int serial;
    void start()
    {
        System.out.println("The car is starting...");
    }
    void stop()
    {
        System.out.println("The car has stopped...");
    }
}
class main{
    static void main(String[] args) {
        Car c1=new Car();
        c1.brand="Toyota";
        c1.serial=10001;
        c1.start();
        c1.stop();
    }
}