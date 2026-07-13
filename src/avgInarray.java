import  java.util.Scanner;

public class avgInarray {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("The numbers are ");
        for(int i=0;i<n;i++)
        {
            arr[i]= scanner.nextInt();
            sum+=arr[i];
        }
        double avg=(double)sum/n;
        System.out.println("The average of the sumbers are "+avg);
    }
}
