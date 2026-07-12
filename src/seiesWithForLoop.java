public class seiesWithForLoop {
    public static void main(String[] args)
    {
        System.out.print("Even series: ");
        int evenSum=0;
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.print(i +" " );
                evenSum+=i;
            }
        }
        System.out.println();
        System.out.println("The sum of even series is: " +evenSum);
        System.out.print("Odd series: ");
        int oddSum=0;
        for(int i=1;i<=20;i++)
        {
            if(i%2==1)
            {
                System.out.print(i +" " );
                oddSum+=i;
            }
        }
        System.out.println();
        System.out.println("The sum of odd series is: " +oddSum);
    }
}
