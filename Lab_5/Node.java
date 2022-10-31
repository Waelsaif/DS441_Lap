package Lab_5;
class Node {
    private int data;                                 // data item (key)
    private Node next;                                 // next link in list
 // -------------------------------------------------------------
    public Node(int val) {                             // constructor
       data = val;
       next = null;
       }
    
    public Node(int d, Node n) {
         data = d;
         next = n;
     }
 
 // -------------------------------------------------------------
    public String toString()       {                  // display ourself
       return data + "";
       }
// ------------------------------   ------------------------------//
    public void setData(int d){
        data=d;
    }
    public void setNext(Node n){
        next=n;
    }
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    }  // end class Link
 