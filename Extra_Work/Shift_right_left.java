package Extra_Work;
import java.math.BigInteger;
class Shift_right_left {    
public static void main(String[] args) {
    System.out.println(16>>4);// 16/2^n = n == 4 (>> == /)
    System.out.println(8<<3);// 16*2^n = n == 3 (<< == *)
    BigInteger n = new BigInteger("80000");
    BigInteger o = n.shiftRight(5);
    System.out.println("The sum is "+ o);
}

}