class ProductFilter {

    public String category;
    public double maxprice, minprice;
    public String brand;
    boolean isbrand;

    public void search(String category) {
        System.out.println("Searching for products in category: " + category);
    }

    public void search(double minprice, double maxprice) {
        System.out.println("Searching for products between "
                + minprice + " and " + maxprice);
    }

    public void search(String category, double price) {
        System.out.println("Searching for " + category
                + " products with price: " + price);
    }

    public void search(String category, double price,
                       String brand, boolean isbrand) {

        System.out.println("Searching for products in category: "
                + category + " and brand: " + brand);
    }

    public static void main(String[] args) {
        ProductFilter p = new ProductFilter();
        p.search("Electronics");
        p.search(100.0, 500.0);
        p.search("Apple", 100.0);
        p.search("Fashion", 100.0, "Nike", true);
    }
}
