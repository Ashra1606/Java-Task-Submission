public class seriesWithWhileLoop {
    public static void main( String[] args)
    {
        System.out.println("Even series: ");
        int i=2;
        int evenSum=0;
        while(i<=20)
        {
            System.out.print(i+" ");
            evenSum+=i;
            i=i+2;
        }
        System.out.println();
        System.out.println("The sum of even series is: " +evenSum);
        System.out.println("Odd Series: ");
        int j=1;
        int oddSum=0;
        while(j<=20)
        {
            System.out.print(j+" ");
            oddSum+=j;
            j=j+2;
        }
        System.out.println();
        System.out.println("The sum of odd series is: " +oddSum);
    }
}
