import java.util.*;

class Shopping {
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Shopping center \n");
        Item it;
        ShoppingCart Sh = new ShoppingCart();
        while (true) {
            System.out.println("Enter the item name: ");
            Scanner scan = new Scanner(System.in);
            String name= scan.nextLine();
            System.out.println("Enter the price: ");
            double price = scan.nextDouble();
            System.out.println("Enter the quantity: ");
            int quantity = scan.nextInt();
            it= new Item(name,price,quantity);
            Sh.addToCart(it, price, quantity);
            System.out.println("Items added: ");
            System.out.println(Sh); 
            System.out.println("Do you want to continue?");
            scan.nextLine();
            String cont=scan.nextLine();
            if(cont.equals("no"))
                break;
        }
        Sh.getTotalPrice();
        
    }
}