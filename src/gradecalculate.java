import java.util.Scanner;
public class gradecalculate {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter mark:");
        int a=scanner.nextInt();
        if(a>=90){
            System.out.println("A+");
        }
        else if(a>=80 && a<=89){
            System.out.println("A");
        }
        else if(a>=70 && a<=79){
            System.out.println("A-");
        }
        else if(a>=60 && a<=69){
            System.out.println("B");
        }
        else if(a>=40 && a<=59){
            System.out.println("C+");
        }
        else{
            System.out.println("F");
        }

    }
}
