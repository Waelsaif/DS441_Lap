package Lab_5;
public class LinkList {
    
private Node first;                            	  // ref to first item on list
int nElems;
public Node getFirst() // get value of first
{
    return first;
}

public void setFirst(Node f) // set first to new link
{
    first = f;
}

public LinkList() // constructor
{
    first = null;
    nElems = 0;
}                           	  // no items on list yet

public LinkList(Node f) {
    first = f;
    nElems = 1;
}

public boolean isEmpty() // true if list is empty
{
    return (first == null);
}

public void insertFirst(int dd) {               	 // insert at start of list
    Node n = new Node(dd);  
    n.getNext();                 	// make new link
    n.setNext(first);        				 // newLink --> old first
    first = n;           				  // first --> newLink

    nElems++;
}
public void insertLast(int dd) {				// insert at start of list
    Node newLink = new Node(dd);                    // make new link
    Node current = first;
    if(first== null){
        first = newLink;
        return;
    }
    while (current.getNext() != null) {
        current = current.getNext();
    }
    current.setNext(newLink); 
    nElems++;
}// end insertLast

public Node deleteFirst() {      // delete first item (assumes list not empty)
    Node n = first;          // save reference to link
    first = first.getNext();         // delete it: first-->old next
    n.setNext(null);
    nElems--;
    return n;          // return deleted link
}
// -------------------------------------------------------------

public ListIterator getIterator() { // return iterator
    return new ListIterator(this);  // initialized with
}                               //    this list
// -------------------------------------------------------------

public String toString() {
    String s = "[";
    Node p = first;       // start at beginning of list
    while (p != null) {     // until end of list,
        s = s + p.toString() + " ";   // print data
        p = p.getNext();  // move to next link
    }
    s = s + "]";
    return s;
}
// -------------------------------------------------------------

public Node find(int key) {
    Node p = first;
    while (p != null) {
        if (p.getData() == key) {
            return p;
        }//if
        p = p.getNext();
    }// while
    return null;
}
public int indexOf(Node n) {
    Node p = first;
    int c = -1;
    while (p != null) {
        c++;
        if (p.getData() == n.getData()) {
            return c;
        }//if
        p = p.getNext();
        
    }// while
    
    return -1;
}

public Node delete(int key) {
    Node prev = first;
    Node current = first;
    while (current != null) {
        if (current.getData() == key) {
            prev.setNext(current.getNext()); 
            current.setNext(null);
            return current;
        }//if
        prev = current;
        current.setNext(current.getNext()); 

    }// while
    return null;
}

public Node deleteLast() {
    Node p = first;
    Node pre = null;
    while (p.getNext() != null) {
        pre = p;
        p = p.getNext();
    }// end while

    pre.setNext(null);
    return p;
}// end deleteLast


public int length(){
    return nElems;

}

 public void displayList() {
    String s = "[";
    Node p = first;       // start at beginning of list
    while (p != null) {     // until end of list,
        s = s + p.toString() + " ";   // print data
        p = p.getNext();  // move to next link
    }
    s = s + "]";
    System.out.println(s); 
} 
} // end class LinkList

