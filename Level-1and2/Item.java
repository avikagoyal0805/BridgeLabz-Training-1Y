class Item {

    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {

        Item item1 = new Item(1001, "Laptop", 45000);

        item1.displayItem();

        int quantity = 3;
        double totalCost = item1.calculateTotalCost(quantity);

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}
