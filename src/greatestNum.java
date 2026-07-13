import java.util.Scanner;
public class greatestNum {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("The number series is: ");
        for(int i=0;i<n;i++)
        {
            arr[i]= scanner.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("The greatest number is "+max);
    }
}
