public class demo
{
    static int change(int n){
        n=5;
        return n;
}
static void change2(int [] number)
{
    number[0]=100;
}
    public static void main(String[] args)
    {
        int a=2;
        int [] arr={1,2,3,4,5};
        change(a);
        change2(arr);
        System.out.println(a);
        System.out.println(arr[0]);

    }
}
