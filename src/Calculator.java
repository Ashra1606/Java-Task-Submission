import java.util.Scanner;
public class  Calculator{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        char s= scanner.next().charAt(0);

        if(s=='+') System.out.println(a+b);
        if(s=='-') System.out.println(a-b);
        if(s=='*') System.out.println(a*b);
        if(s=='/') System.out.println(a/b);
        scanner.close();
    }
}