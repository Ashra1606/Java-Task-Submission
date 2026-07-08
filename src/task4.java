import java.util.Scanner;

public class task4 {
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = scanner.nextDouble();

        double f = (c * 9.0 / 5.0) + 32.0;
        System.out.printf("Temperature in Fahrenheit: "+f);
        scanner.close();
    }
}
