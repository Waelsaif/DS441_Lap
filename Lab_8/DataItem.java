package Lab_8;

public class DataItem {
    private String key;
    private String info;
  
    public DataItem(String nkey, String ninfo) { 
      key = nkey;
      info = ninfo;
    }

    public boolean equals(Object anObject) {
      if ((anObject != null) && (anObject instanceof DataItem)) {
      DataItem d = (DataItem)anObject;
   return key.equals(d.key);
      }
      return false;
    }
      
    public void setkey(String k){
      key=k;
    }
    public void setinfo(String i){
      info=i;
    }
    public String getkey() {
      return key;
    }
    public String getinfo() {
      return info;
    }
    public String toString() {
      return "(Key: "+key+", Info: "+info + ")";
    }
    
  }
  

