import java.util.Scanner;

public class task1 {
    public static  void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        double area=.5*base*height;
        System.out.print("Area of the triangle: " + area);
        scanner.close();
    }
}
