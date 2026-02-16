class Product {
    String productName;  // Instance variable
    double price;        // Instance variable
    static int totalProducts = 0; // Class variable

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: " + price);
    }

    // Class method
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Smartphone", 25000);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
