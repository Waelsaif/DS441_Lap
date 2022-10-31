package Lab_3;

public class ListArrayDynamic {
    private int nElems;
    private long[] a;
    private final int INITIALSIZE = 2;
    
    public ListArrayDynamic()
    {
       a = new long[INITIALSIZE];
       nElems = 0;
    }
    public ListArrayDynamic(int capacity)
    {
       a = new long[capacity];
       nElems = 0;
    }
 
    int capacity =2; // = INITIALSIZE
    public void add(long x)
    {
      if (nElems < capacity){
       a[nElems]=x;
       nElems++;}
       else {
         capacity =capacity*2;
         ListArrayDynamic d = new ListArrayDynamic(capacity);
         for (int i = 0; i < nElems; i++){
            d.a[i]=a[i];}
         a=d.a;   
         a[nElems]=x;
         nElems++;}
   }
    
 
    public String toString()
    {
       String temp = "[" + a[0];
       for (int i = 1; i < nElems; i++)
       {
           temp = temp + "," + a[i];
       }
       temp = temp + "]";
       return temp;
    }
 
}
