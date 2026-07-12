import java.util.Scanner;
public class leapYear {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter a Year ");
        int y=scanner.nextInt();
        if(y%400==0){
            System.out.println("Leap Year");
        }
        else if(y%4==0 && y%100!=0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }

    }
}
