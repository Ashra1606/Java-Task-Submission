import java.util.Scanner;
public class primeNum {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= scanner.nextInt();
        boolean prime=true;
        if(n<=1)
        {
            prime=false;
        }
        else {
            for (int i = 2; i < n / 2; i++)
            {
                if(n%i==0)
                {
                    prime=false;
                    break;
                }
            }
        }
        if(prime)
        {
            System.out.println(n+" is a prime number.");
        }
        else{
            System.out.println(n+" is not a prime number.");
        }
    }
}
