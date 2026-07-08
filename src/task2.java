import java.util.Scanner;
public class task2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double pi=3.14159;
        double radius = scanner.nextDouble();
        double volume=(4*pi*radius*radius*radius)/3;
        System.out.printf("Volume of the ball:"+volume);

        scanner.close();
    }
}
