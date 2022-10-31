package Lab_2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// highArray.java
// demonstrates array class with high-level interface

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////////


    //-----------------------------------------------------------

    public class ListArray {
   
        public long[] a;                 // ref to array a
        public int nElems;               // number of data items
    public ListArray(int max) // constructor
    {
        a = new long[max];                 // create the array
        nElems = 0;                        // no items yet
    }
    //-----------------------------------------------------------

    public ListArray() // default constructor
    {
        a = new long[2];                 // create the array
        nElems = 0;                        // no items yet
    }

    public int linearSearch(long searchKey) {                              // find specified value
        int j;
        for (j = 0; j < nElems; j++) {            // for each element,
            if (a[j] == searchKey) // found item?
            {
                return j;                       // exit loop before end
            }
        }
        return -1;
    }  // end find()
    //------------------------------------------------------------

    public boolean find(long searchKey) {                              // find specified value
        int j;
        for (j = 0; j < nElems; j++) // for each element,
        {
            if (a[j] == searchKey) // found item?
            {
              return true;                // exit loop before end
            }
        }
            return false;                   // yes, can't find it
    }  // end find()
    //-----------------------------------------------------------

    public void insert(long value) // put element into array
    {
        if (a.length == nElems) {
            ensureCapacity();
        }
        a[nElems] = value;             // insert it
        nElems++;                      // increment size
    }

    //-----------------------------------------------------------
    void ensureCapacity() {
        long[] new_a = new long[a.length * 2]; // create the new array

        for (int i = 0; i < a.length; i++) {   // copy from a to new_a
            new_a[i] = a[i];
        }

        a = new_a;                      // make a to reference new_a

    }

    public void insertOrdered(long value) // put element into array
    {
        int j;
        for (j = 0; j < nElems; j++) // find where it goes
        {
            if (a[j] > value) // (linear search)
            {
                break;
            }
        }
        for (int k = nElems; k > j; k--) // move bigger ones up
        {
            a[k] = a[k - 1];
        }
        a[j] = value;                  // insert it
        nElems++;                      // increment size
    }  // end insert()
    //-----------------------------------------------------------

    public boolean deleteNew(long value) {
        int j = linearSearch(value);
        if (j == -1) {
            return false;
        }
        shiftLeft(j);
        nElems--;                   // decrement size
        return true;

    }  // end delete()

    public void shiftLeft(int j) {
        for (int k = j; k < nElems - 1; k++) // move higher ones down
        {
            a[k] = a[k + 1];
        }
    }

    //-----------------------------------------------------------
    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) // look for it
        {
            if (value == a[j]) {
                break;
            }
        }
        if (j == nElems) // can't find it
        {
            return false;
        } else // found it
        {
            for (int k = j; k < nElems; k++) // move higher ones down
            {
                a[k] = a[k + 1];
            }
            nElems--;                   // decrement size
            return true;
        }
    }  // end delete()
    //-----------------------------------------------------------

    public void display() // displays array contents
    {//nElems
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(a[j] + " ");  // display it
        }
        System.out.println("");
    }
    //-----------------------------------------------------------

    public int binarySearch(int searchKey) {
        int left = 0, right = nElems - 1;
        int counter=1;
        while (left <= right) {
            int pivot = (left + right) / 2;
            System.out.println("pass "+counter+" left =  "+left+" right = "+right + " pivot = "+pivot);
            if (a[pivot] == searchKey) {
                return pivot;       // found
            } else {
                if (a[pivot] < searchKey) {
                    left = pivot + 1;  // search right
                } else {
                    right = pivot - 1;  // search left
                }
            }
        }
        return -1;
    }

    public int size() {
        return nElems;
    }

    public void insertLast(long value) {
        insert(value);
    }

    public long deleteLast() {

        long t = a[nElems - 1];
        nElems--;
        return t;
    }

    public void readIntFile(String fileName) throws FileNotFoundException {

        Scanner input = new Scanner(new File(fileName));

        while (input.hasNextInt()) {
            long value = input.nextLong();
            insert(value);
        }// end while

    }
    void addFirst(long value){
        long [] list = new long[nElems+1];
        for(int i=1; i<list.length; i++) {
            list[i]=a[i-1];
    }
    list[0]=value;
    a=list;
    nElems++;
}
    long removeFirst(){
        long temp=a[0];
        for (int i=1; i<nElems; i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=0;
        nElems--;
    return temp;
    }
    void addAt(int index,long value ){
        long [] temp=new long[a.length+1];
        for (int i=0,s=0;i<temp.length;i++,s++){
            if (i==index){
                temp[i]=value;
                s--;
            }
            else{
                temp[i]=a[s];
            }
        }
        nElems++;
        a=temp;
    } 
    long removeAt(int index){
        long temp=0;
        for(int i=0; i<nElems; i++){
            if(i==index){
                temp=a[i];
                shiftLeft(i);
                // for (int j=i; j<nElems-1; j++){
                //     a[j]=a[j+1];
                // }
            }
        }
        nElems--;
        return temp;
    }
    void set(int index, int value){
        a[index]= value;
    }


    long get(int index){
        return a[index];
    }


    void clear(){
    long [] temp = new long [0];
    a=temp;  
    }
}  // end class HighArray


