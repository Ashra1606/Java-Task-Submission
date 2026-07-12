public class seriesWithDoWhileLoop {
    public static void main(String[] args)
    {
        int i=2;
        int evenSum=0;
        System.out.print("Even Serirs: ");
        do{
            System.out.print(i+" ");
            evenSum+=i;
            i=i+2;
        }
        while (i<=20);
        System.out.println();
        System.out.println("The sum of even series is: " +evenSum);
        System.out.println();
        int j=1;
        int oddSum=0;
        System.out.print("Odd Serirs: ");
        do{
            System.out.print(j+" ");
            oddSum+=j;
            j=j+2;
        }
        while (j<=20);
        System.out.println();
        System.out.println("The sum of odd series is: "+oddSum);
    }
}
