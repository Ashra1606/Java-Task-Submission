import java.util.Scanner;

public class task5 {
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter the length of the arm: ");
        double arm = scanner.nextDouble();

        double area = (Math.sqrt(3) / 4.0) * Math.pow(arm, 2);
        System.out.printf("Area of the equilateral triangle: "+area);
        scanner.close();
    }
}
