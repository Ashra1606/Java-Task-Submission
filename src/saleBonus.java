import java.util.Scanner;
public class saleBonus {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int attendance= scanner.nextInt();
        int sale= scanner.nextInt();
        if(sale==95 && attendance==100)
        {
            System.out.println("You will get 60% bonus.");
        }
        else if(sale==95 && attendance==90)
        {
            System.out.println("You will get 40% bonus.");
        }
        else if(sale==80 && attendance==100)
        {
            System.out.println("You will get 40% bonus.");
        }
        if(sale==80 && attendance==90)
        {
            System.out.println("You will get 20% bonus.");
        }
        else{
            System.out.println("You will get 5% bonus");
        }
    }
}
