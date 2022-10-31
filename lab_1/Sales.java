package lab_1;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        int sum;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("how many Salesperson? ");
        int len = scan1.nextInt();
        int[] sales = new int[len];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < len; i++) {
            System.out.print("Enter sales for sales person " + (i + 1) + " : ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\n Salesperson Sales ");
        System.out.println("--------------------");

        sum = 0;
        int max = sales[0];
        int maxindex = 0;
        int min = sales[0];
        int minindex = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println("    " + (i + 1) + "     " + sales[i]);
            sum += sales[i];
            if (max < sales[i]) {
                max = sales[i];
                maxindex = i;
            }

            if (min > sales[i]) {
                min = sales[i];
                minindex = i;
            }
        }

        System.out.println("--------------------\n");
        System.out.println("Total Sales " + sum);
        System.out.println("average sale " + sum / sales.length);
        System.out.println("Salesperson " + (maxindex + 1) + " had the highest sale with $" + max);
        System.out.println("Salesperson " + (minindex + 1) + " had the highest sale with $" + min);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value ");
        int value = in.nextInt();
        int total = 0;
        int num = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > value) {
                total += sales[i];
                num += 1;
                System.out.println("Salesperson " + (i + 1) + " has exceeded that amount with $" + sales[i]);
            }
        }
        System.out
                .println("The number of Salespersons who has exceeded that amount " + num + " with total of $" + total);
        scan.close();
        scan1.close();
        in.close();
    }
}
