import java.util.Scanner;
public class reverseSeries {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int series[]=new int[n];
        System.out.println("Original Series: ");
        for(int i=0;i<n;i++)
        {
            series[i]= scanner.nextInt();
        }
        int left=0;
        int right= series.length-1;
        while(left<right)
        {
            int temp=series[left];
            series[left]=series[right];
            series[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reversed Series: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(series[i]+" ");
        }
    }
}
