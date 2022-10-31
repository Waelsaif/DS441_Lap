package lab_1;
import java.util.Arrays;
import java.util.Scanner;

public class revArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements? ");
        int num = scan.nextInt();
        int[] arr = new int[num];
        Scanner In = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = In.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int var = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = var;
        }
        System.out.println(Arrays.toString(arr));
        scan.close();
        In.close();
    }
}
