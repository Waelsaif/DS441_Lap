package lab_1;
import java.util.*;

public class IntegerListTest {

    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);

    // -------------------------------------------------------
    // Create a list, then repeatedly print the menu and do what the
    // user asks until they quit
    // -------------------------------------------------------
    public static void main(String[] args) {
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0) {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }

    // -------------------------------------
    // Do what the menu item calls for
    // -------------------------------------
    public static void dispatch(int choice) {
        switch (choice) {
            case 0:
                System.out.println("Bye! ");
                break;
            case 1:
                System.out.println("How big should the list be?");
                int size = scan.nextInt();
                list = new IntegerList(size);
                list.randomize();
                break;
            case 2:
                list.print();
                break;
            case 3:
                System.out.println("what is the value?");
                int value = scan.nextInt();
                list.addElement(value);
                break;
            case 4:
                System.out.println("what is the value?");
                int removevalue = scan.nextInt();
                list.removefirst(removevalue);
                break;
            case 5:
                System.out.println("what is the value?");
                int removeAllvalue = scan.nextInt();
                list.removeAll(removeAllvalue);
                break;
            default:
                System.out.println("Sorry, invalid choice");
        }
    }

    // ----------------------------
    // Print the user's choices
    // ----------------------------
    public static void printMenu() {
        System.out.println("\n Menu	");
        System.out.println("	====");
        System.out.println("0: Quit");
        System.out.println("1: Create a new list (** do this first!! **)");
        System.out.println("2: Print the list");
        System.out.println("3: Add an element at the beginning of the list");
        System.out.println("4: Remove an element in the list");
        System.out.println("5: Remove all the elements of value in the list");
        System.out.print("\nEnter your choice: ");
    }

}
