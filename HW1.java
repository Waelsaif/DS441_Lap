
/*
 Wael saif mohammed abdu
      442018431
 */
import java.util.*;

public class HW1 {
    public static void main(String[] args) {
        int[] k = { 2, 3, 4, 9, 3, 2 };
        int[] e = { 3, 4, 2, 5, 9 };
        HW1 s = new HW1();
        boolean result1 = s.isSorted(k);
        int result2 = s.minimum(k);
        double result3 = s.mean(k);
        int[] result4 = s.withoutDuplicates(k);
        int[] result6 = s.concatenate(k, e);
        int[] result7 = s.shuffle(e);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(Arrays.toString(result4));
        s.reverse(k);
        System.out.println(Arrays.toString(result6));
        System.out.println(Arrays.toString(result7));

    }

    public boolean isSorted(int[] a) {
        boolean s = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                s = false;
                break;
            }
        }
        return s;
    }

    public int minimum(int[] a) {
        int s = a[0];
        for (int i = 0; i < a.length; i++) {
            if (s >= a[i])
                s = a[i];
        }
        return s;
    }

    public double mean(int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public int[] withoutDuplicates(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        int[] s = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            s[i] = (int) it.next();

        }
        return s;
    }

    void reverse(int[] a) {
        int[] s = new int[a.length];
        int z = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            s[z] = a[i];
            z++;
        }
        System.out.println(Arrays.toString(s));
    }

    public int[] concatenate(int[] a, int[] b) {
        int z = a.length + b.length;
        int[] s = new int[z];
        for (int i = 0; i < a.length; i++) {
            s[i] = a[i];
        }
        int p = 0;
        for (int i = a.length; i < z; i++) {
            s[i] = b[p];
            p++;
        }
        return s;
    }

    int[] shuffle(int[] a) {
        Random ran = new Random();
        int s[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            s[i] = a[ran.nextInt(s.length)];
        }
        return s;
    }

}