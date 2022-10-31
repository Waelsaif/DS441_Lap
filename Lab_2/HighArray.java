package Lab_2;
class HighArray
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
   //-----------------------------------------------------------
   public HighArray(int max)         // constructor
      {
      a = new long[max];                 // create the array
      nElems = 0;                        // no items yet
      }
   //-----------------------------------------------------------
   public boolean find(long searchKey)
      {                              // find specified value
      int j;
      for(j=0; j<nElems; j++)            // for each element,
         if(a[j] == searchKey)           // found item?
            break;                       // exit loop before end
      if(j == nElems)                    // gone to end?
         return false;                   // yes, can't find it
      else
         return true;                    // no, found it
      }  // end find()
   //-----------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      a[nElems] = value;             // insert it
      nElems++;                      // increment size
      }
   //-----------------------------------------------------------
   public void insertOrdered(long value)    // put element into array
      {
      int j;
      for(j=0; j<nElems; j++)        // find where it goes
         if(a[j] > value)            // (linear search)
            break;
      for(int k=nElems; k>j; k--)    // move bigger ones up
         a[k] = a[k-1];
      a[j] = value;                  // insert it
      nElems++;                      // increment size
      }  // end insert()
   //-----------------------------------------------------------
   public boolean delete(long value)
      {
      int j;
      for(j=0; j<nElems; j++)        // look for it
         if( value == a[j] )
            break;
      if(j==nElems)                  // can't find it
         return false;
      else                           // found it
         {
         for(int k=j; k<nElems; k++) // move higher ones down
            a[k] = a[k+1];
         nElems--;                   // decrement size
         return true;
         }
      }  // end delete()
   //-----------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }
   //-----------------------------------------------------------
public int binarySearch(int searchKey) {
  int left = 0, right = nElems-1;
  int counter=1;
  while (left <= right) {
      int pivot = (left + right) / 2;
      System.out.println("pass "+counter+" left =  "+left+" right = "+right + " pivot = "+pivot);
      if (a[pivot] == searchKey) {
      if (a[pivot] == searchKey) {
          return pivot;       // found
      } else {
          if (a[pivot] < searchKey)
              left = pivot + 1;  // search right
          else 
        right = pivot - 1;  // search left
      }
   }
}
   return -1;

} 
   
   public int size() {
     return nElems;
 } 
 //----------------------------------------------------------------//

long max(){
   long max = a[0];
   for(int i=0; i<nElems; i++)
      if(a[i] > max)
         max = a[i];
   return max;
}

 //----------------------------------------------------------------//
int maxIndex() {  
   long max = a[0];
   int maxIndex=0;
   for(int i=0; i<nElems; i++){
      if(a[i] > max){
         max = a[i];
         maxIndex=i;}
      }

   return maxIndex;  
      
}

 //----------------------------------------------------------------//
 long min(){
   long min = a[0];
   for(int i=0; i<nElems; i++)
      if(a[i] < min)
         min = a[i];
   return min;
}

 //----------------------------------------------------------------//
int minIndex() {  
   long min = a[0];
   int minIndex=0;
   for(int i=0; i<nElems; i++){
      if(a[i] < min){
         min = a[i];
         minIndex=i;}
      
      }
      
   return minIndex;  
      
}

 //----------------------------------------------------------------//
long range(){
return max()-min();
}

 //----------------------------------------------------------------//
long sum(){
long sum=0;
for (int i=0; i<nElems; i++){
   sum += a[i];
}
return sum;
}

//----------------------------------------------------------------/
void addFirst(long value){
nElems++;
int s=0;
long[] lis = new long[nElems];
   for (int i = 1; i < nElems; i++) {
            lis[i] = a[s];
            s++;
        }
        lis[0] = value;
        a = lis;
}

//----------------------------------------------------------------//
long removeFirst(){
   nElems--;
   long temp = a[0];
   for(int i=0; i<nElems; i++){
      a[i]=a[i+1];
   }
return temp;
}
//----------------------------------------------------------------//
double avg(){
return sum()/nElems;
}
//----------------------------------------------------------------//

 int findAll(int foundElement){
    int count=0;
    for (int i = 0; i < nElems; i++) {
        if (a[i] == foundElement) {
            count+=1;
        }
 }
 return count; // the number of elements found.
 }

 //----------------------------------------------------------------//


 int deleteAll(int deletedElement){
    int index=0;
    for (int i = 0; i < nElems; i++) {
        if (a[i] == deletedElement) {
            index=i;
            i--;
            nElems--;
            for (int s = index; s < a.length - 1; s++) {
                a[s] = a[s + 1];
            }
        } 
    }
    return 0;
 }

}  

// end class HighArray


