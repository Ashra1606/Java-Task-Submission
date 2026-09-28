public class pet {
    String name;
    int age;
    String breed;
    void bark()
    {
        System.out.println("Woof woof");
    }
    void spin()
    {
        System.out.println("Round and Round");
    }
    void run()
    {
        System.out.println("RUNNNNNNNNNNNN");
    }
}
class Dog{
    static void main() {
        pet d1=new pet();
        d1.age=2;
        d1.breed="Bull Dog";
        d1.name="Bully";
        d1.run();
        d1.spin();
        d1.bark();
    }
}
