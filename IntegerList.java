public class IntegerList {

    int[] list; // values in the list
    static int currentSize;

    // -------------------------------------------------------
    // create a list of the given size
    // -------------------------------------------------------
    public IntegerList(int size) {
        list = new int[size];
    }

    // -------------------------------------------------------
    // fill array with integers between 1 and 100, inclusive
    // -------------------------------------------------------
    public void randomize() {
        for (int i = 0; i < list.length; i++)
            list[i] = (int) (Math.random() * 100) + 1;
    }

    // -------------------------------------------------------
    // print array elements with indices
    // -------------------------------------------------------
    public void print() {
        for (int i = 0; i < list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize() {
        if (list[list.length - 1] != 0) {
            int[] lis = new int[list.length + 1];
            int s = 0;
            for (int i = 0; i < lis.length - 1; i++) {
                lis[s] = list[i];
                s++;
            }
            list = lis;
            currentSize = list.length;
        }
    }

    public void addElement(int newVal) {
        // check if the array is full
        increaseSize();
        int s = 0;
        int[] lis = new int[list.length];
        for (int i = 1; i < list.length; i++) {
            lis[i] = list[s];
            s++;
        }
        lis[0] = newVal;
        list = lis;
    }

    public void removefirst(int val) {
        int indexOfVal;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == val) {
                indexOfVal = i;
                for (int a = indexOfVal; a < list.length - 1; a++) {
                    list[a] = list[a + 1];
                }
                list[list.length - 1] = 0;
                currentSize--;
                break;
            }

        }
    }

    public void removeAll(int val) {
        int indexOfVal;
        int z = 0;
        for (int i = 0; i < list.length; i++) {
            
            if (list[i] == val) {
                indexOfVal = i;
                z++;
                i--;
                for (int a = indexOfVal; a < list.length - 1; a++) {
                    list[a] = list[a + 1];
                }
                list[list.length - z] = 0;
                currentSize--;
            }
            

        }
    }
}
// int[] list; // values in the list
// int counter;
// // static int currentSize;

// // -------------------------------------------------------
// // create a list of the given size
// // -------------------------------------------------------
// public IntegerList(int size) {
// list = new int[size];
// counter = 0;
// }

// // -------------------------------------------------------
// // fill array with integers between 1 and 100, inclusive
// // -------------------------------------------------------
// public void randomize() {
// for (int i = 0; i < list.length; i++){
// addElement( (int) (Math.random() * 100) + 1);
// }
// }

// // -------------------------------------------------------
// // print array elements with indices
// // -------------------------------------------------------
// public void print() {
// for (int i = 0; i < counter; i++)
// System.out.print( list[i]+" ");

// System.out.println("");
// }

// public void increaseSize() {
// int[] lis = new int[list.length *2];
// for (int i = 0; i < list.length; i++) {
// lis[i] = list[i];
// }
// list = lis;
// }

// public void addElement(int newVal) {
// // check if the array is full
// if (counter == list.length) {

// increaseSize();
// }
// // int s=0;
// // int [] lis = new int[list.length];
// // for (int i=1;i<list.length;i++){
// // lis[i]=list[s];
// // s++;
// // }
// // lis[0]=newVal;
// // list=lis;
// list[counter] = newVal;
// counter++;
// }

// void addFirst(int v){

// }
// public void removefirst(int val) {
// // int indexOfVal;
// // for (int i = 0; i < list.length; i++) {
// // if (list[i] == val) {
// // indexOfVal = i;
// // for (int a = indexOfVal; a < list.length - 1; a++) {
// // list[a] = list[a + 1];
// // }
// // list[list.length - 1] = 0;
// // currentSize--;
// // break;
// // }

// // }
// }

// public void removeAll(int val) {
// counter =0;
// }
// }
