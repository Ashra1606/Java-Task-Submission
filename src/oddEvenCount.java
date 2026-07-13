import java.util.Scanner;
public class oddEvenCount {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[]=new int[n];
        int odd=0;
        int even=0;
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++)
        {
            arr[i]= scanner.nextInt();
            if(arr[i]%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The number of odd is "+odd);
        System.out.println("The number of even is "+even);
    }
}
