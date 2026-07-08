import java.util.Scanner;
public class task3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double pi=3.14159;
        double radius = scanner.nextDouble();
        double area=pi*radius*radius;
        System.out.printf("Area of the circle: "+area);
        scanner.close();
    }
}
