class LinkedList {

    //-------------------------------------------------------------------//
    class Node {
        int value;
        Node next;
        Node (){
            value =0;
            next = null;
        }
        Node (int value){
            this.value =value;
            next = null;
        }
    }
    //-------------------------------------------------------------------//

    Node head;
    Node tail;
    int length=0;

    //----------------------------------------------------------------//

    void insertFirst(int value){
        Node node = new Node();
        node.value = value;
        if (length==0){
            head=tail=node;
            node.next=null;
        }
        else{
            node.next=head;
            head=node;
        }
        length++;
    }

    //----------------------------------------------------------------//

    void insertLast(int value){
        Node node = new Node();
        node.value = value;
        if (length==0){
            head=tail=node;
            node.next=null;
        }
        else {
            tail.next=node;
            tail=node;
            tail.next=null;
        }
        length++;
    }

    //----------------------------------------------------------------//

    void insertAt(int value, int index){
        Node node = new Node();
        node.value = value;
        Node pos = head;
        for (int i=1; i<index;i++){
            pos=pos.next;
        }
        node.next=pos.next;
        pos.next=node;
        length++;
    }

    //------------------------------------------------------------//

    void print(){
        Node pr = head;
        while (pr != null ){
            System.out.print(pr.value + " ");
            pr=pr.next;
        }
    }

    //------------------------------------------------------------//
    int size(){
        return length;
    }
    //------------------------------------------------------------//
    boolean isEmpty(){
        return length==0;
    }
    //------------------------------------------------------------//
    void deleteFirst(){
        head=head.next; // java garbage collector will handle the rest
        length--;
    }
    //------------------------------------------------------------//
    void deleteLast(){
        Node dl = head;
        for (int i=1; i<length-1; i++){
            dl=dl.next;
        }
        dl.next=null;
        length--;
    }
    //------------------------------------------------------------//
    void deleteAt(int index){
        Node dl = head;
        for(int i=1; i<index; i++){
            dl=dl.next;
        }
        dl.next=dl.next.next;
        length--;
    }
    //------------------------------------------------------------//
    int find(int value){
        Node fi = head;
        for (int i=0; i<length-1; i++){
            if (fi.value==value){
                return i;
            }
            fi=fi.next;
        }
        return -1;
    }
}  