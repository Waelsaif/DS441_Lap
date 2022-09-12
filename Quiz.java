import java.util.*;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("How many questions? ");
        Scanner scan = new Scanner(System.in);
        int numofqs=scan.nextInt();
        int [] arr = new int[numofqs];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key for the questions ");
        for (int i=0;i<numofqs;i++){
            arr[i]=sc.nextInt(); // the ans from the user
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the answers for the questions ");
        for (int i=0;i<numofqs;i++){
            arr[i]=in.nextInt(); // the ans from the Dr
        }
        
        System.out.print(Arrays.toString(arr));
    }
}
