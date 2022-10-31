package Lab_3;

import Lab_2.ListArray;

public class prac3 extends ListArray {
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
    void AddFirst(long value){
        long [] list = new long[nElems+1];
        for(int i=1; i<list.length; i++) {
            list[i]=a[i-1];
    }
    list[0]=value;
    a=list;
    nElems++;
}
    long RemoveFirst(){
        long temp=a[0];
        for (int i=1; i<nElems; i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=0;
        nElems--;
    return temp;
    }
    void AddAt(int index,long value ){
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
    long RemoveAt(int index){
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
    void EnsureCapacity() {
        long[] new_a = new long[a.length * 2]; // create the new array

        for (int i = 0; i < a.length; i++) {   // copy from a to new_a
            new_a[i] = a[i];
        }

        a = new_a;                      // make a to reference new_a

    }
    void Set(int index, int value){
        a[index]= value;
    }


    long Get(int index){
        return a[index];
    }


    void Clear(){
    long [] temp = new long [0];
    a=temp;  
    }
}
