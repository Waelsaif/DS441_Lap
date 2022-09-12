import java.util.*;

import javax.annotation.processing.SupportedOptions;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("How many questions? ");
        Scanner scan = new Scanner(System.in);
        int numofqs=scan.nextInt();
        int [] arr = new int[numofqs];
        int [] arr1 = new int[numofqs];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key for the questions ");
        for (int i=0;i<numofqs;i++){
            arr[i]=sc.nextInt(); // the ans from the user
        }
        Scanner in = new Scanner(System.in);
        int num =0;
        System.out.println("Enter the answers for the questions ");
        for (int i=0;i<numofqs;i++){
            arr1[i]=in.nextInt(); // the ans from the Dr
            if (arr1[i]==arr[i]){
                num+=1;
            }
        }
        System.out.println("You got "+num +" / "+numofqs);
        System.out.println("Your percent is %"+((num/numofqs)*100));
        
        
    }
}
