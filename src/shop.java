class shop{
    String name;
    double price;
    double quantity_purchased;

    static int itemcount=0;
    double totalPrice=0;
    shop(String name,double price, double quantity_purchased)
    {
        this.name=name;
        this.price=price;
        this.quantity_purchased=quantity_purchased;
        itemcount++;
    }
    void price()
    {
        totalPrice=price*quantity_purchased;
    }

    public double getPrice() {
        return totalPrice;
    }
}
class Lab{
    public static void main(String[] args) {
        shop s1=new shop("Drinks",300,30.2);
        shop s2=new shop("chips",200,12.2);
        shop s3=new shop("Biscuits",100,22.2);
        s1.price();
        s2.price();
        s3.price();
        System.out.println("Drinks: "+s1.getPrice());
        System.out.println("Chips: "+s2.getPrice());
        System.out.println("Biscuits: "+s3.getPrice());

        System.out.println("Total number of product: "+shop.itemcount);
    }
}