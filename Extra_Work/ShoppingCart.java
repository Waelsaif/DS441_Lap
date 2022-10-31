package Extra_Work;

public class ShoppingCart {
    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private int capacity; // current cart capacity
    Item[] cart; // current items
    //
    // Creates an empty shopping cart with a capacity of 5 items.
    //

    public ShoppingCart() {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }
    //

    //
    // Adds an item to the shopping cart.
    //
    public void addToCart(Item it, double price, int quantity) {
        if (cart[cart.length - 1] != null) {
            increaseSize();
        }
        cart[itemCount] = it;
        totalPrice += price * quantity;
        itemCount++;
    }

    public void getTotalPrice() {
        System.out.println("\nPlease pay " + totalPrice + "SR at the counter ");
    }

    //
    // Returns the contents of the cart together with
    // summary information.
    //
    public String toString() {

        String contents = "\nShopping Cart\n";
        contents += "\nItem\tUnit Price\tQuantity\tTotal\n";

        for (int i = 0; i < itemCount; i++) {
            contents += cart[i].toString() + "\t" + "\n";
        }
        return contents;
    }

    //
    // Increases the capacity of the shopping cart by 3
    //
    private void increaseSize() {
        Item[] lis = new Item[cart.length + 3];
        for (int i = 0; i < itemCount; i++) {
            lis[i] = cart[i];
        }
        cart = lis;
        capacity = cart.length;
    }
}