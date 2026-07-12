import java.util.Scanner;
public class task7 {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter a number:");
        int a=scanner.nextInt();
        if(a>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }

    }
}
