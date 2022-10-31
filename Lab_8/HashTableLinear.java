package Lab_8;

public class HashTableLinear {
    private DataItem[] hashArray; // array holds hash table
    private int nElems;           // number of elements in hashtable 
   
    private static final int DEFAULT_SIZE = 11; // default size
  
     public HashTableLinear() {
       this(DEFAULT_SIZE);
     }
  
    public HashTableLinear(int size) {
      nElems = 0;
      hashArray = new DataItem[size];
      for (int i=0; i<hashArray.length; i++) {
        hashArray[i] = null;
      }
    }
  
    public int hashFunc(String key, int tableSize) {
      int sum=0;
    
      for(int i=0; i<key.length(); i++) {
        sum = sum + (int)key.charAt(i);
      }
      return sum % tableSize; 
    }
  
    public void insert(DataItem item) {
      int hashVal = hashFunc(item.getkey(),hashArray.length); // hash the key
  
      // loop until empty cell
      while(hashArray[hashVal] != null) {
        hashVal++;                            // go to next cell
        hashVal = hashVal % hashArray.length; // wrap around if necessary
      } 
      hashArray[hashVal] = item;              // insert item
      nElems++;                               // increase element count
    }
    
    public DataItem delete(String target) {
      int hashVal = hashFunc(target,hashArray.length); // hash the key
      
      // loop until empty cell
      while(hashArray[hashVal] != null) {
        if(hashArray[hashVal].getkey().equals(target)) { // if found key
          DataItem temp = hashArray[hashVal];       // save item
          hashArray[hashVal] = null;                // delete item
          nElems--;                       // decrease element count
          return temp;                    // return item
        }
        hashVal++;                        // go to next cell
        hashVal = hashVal % hashArray.length; // wraparound if necessary
      }
      return null;                        // can't find item
    }
    
    
    public DataItem find(String target) {
      int hashVal = hashFunc(target,hashArray.length); // hash the key
    
      // loop until empty cell,
      while(hashArray[hashVal] != null) {
        if (hashArray[hashVal].getkey().equals(target)) { // if found key
          return hashArray[hashVal];
        }
        hashVal++;                             // go to next cell
        hashVal = hashVal % hashArray.length;  // wraparound if necessary
      }
      return null;                             // can't find item
    }
    
    
    public String toString() {
       StringBuffer buffer = new StringBuffer();
       
       for(int i=0; i < hashArray.length; i++) {
         if(hashArray[i] == null) {
           buffer.append("empty\n");
         } else {
           buffer.append(hashArray[i] + "\n");
         }
       }
       return buffer.toString();
    }
  

    public void print() {
      System.out.println(this.toString());
    }
  
}
