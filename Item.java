import java.text.NumberFormat;

// ***************************************************************
//	Item.java
//
//	Represents an item in a shopping cart.
// *************************************************************** import java.text.NumberFormat;
class Item {
    private String name;
    private double price;
    private int quantity;

    //
    // Create a new item with the given attributes.
    //
    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }

    //
    // Return a string with the information about the item
    //
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t\t"
                + fmt.format(price * quantity));
    }

    public double getPrice() {
        return price;
    }

    //
    // Returns the name of the item
    //
    public String getName() {
        return name;
    }

    //
    // Returns the quantity of the item
    //
    public int getQuantity() {
        return quantity;
    }
}
