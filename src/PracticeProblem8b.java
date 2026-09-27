class Resturant{
    public double calculateTotalBill(double foodBill)
    {
        return foodBill+(foodBill*.1);
    }
    public int estimateDeliveryTime()
    {
        return 40;
    }
}
class FastFoodResturant extends Resturant{
    public double calculateTotalBill(double foodBill)
    {
        return foodBill+(foodBill*.15);
    }
    public int estimateDeliveryTime()
    {
        return 20;
    }
}
class FineDiningResturant extends Resturant{
    public int estimateDeliveryTime()
    {
        return 60;
    }
}
public class PracticeProblem8b {
    static void main() {
        FineDiningResturant FD=new FineDiningResturant();
        System.out.println(FD.estimateDeliveryTime());
        System.out.println(FD.calculateTotalBill(500));
    }
}
