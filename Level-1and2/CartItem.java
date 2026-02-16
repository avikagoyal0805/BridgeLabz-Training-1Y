class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add quantity
    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added to the cart.");
    }

    // Method to remove quantity
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed from the cart.");
        } else {
            System.out.println("Cannot remove more than existing quantity.");
        }
    }

    // Method to calculate total cost
    double totalCost() {
        return price * quantity;
    }

    // Method to display cart item
    void displayItem() {
        System.out.println(itemName + " | Price: " + price + " | Quantity: " + quantity + " | Total: " + totalCost());
    }

    public static void main(String[] args) {
        CartItem item1 = new CartItem("Book", 150, 2);
        item1.displayItem();
        item1.addItem(1);
        item1.removeItem(1);
        item1.displayItem();
    }
}
