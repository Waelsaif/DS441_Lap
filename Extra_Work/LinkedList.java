package Extra_Work;
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
    int nElmes=0;

    //----------------------------------------------------------------//

    void insertFirst(int value){
        Node node = new Node();
        node.value = value;
        if (nElmes==0){
            head=tail=node;
            node.next=null;
        }
        else{
            node.next=head;
            head=node;
        }
        nElmes++;
    }

    //----------------------------------------------------------------//

    void insertLast(int value){
        Node node = new Node();
        node.value = value;
        if (nElmes==0){
            head=tail=node;
            node.next=null;
        }
        else {
            tail.next=node;
            tail=node;
            tail.next=null;
        }
        nElmes++;
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
        nElmes++;
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
        return nElmes;
    }
    //------------------------------------------------------------//
    boolean isEmpty(){
        return nElmes==0;
    }
    //------------------------------------------------------------//
    int deleteFirst(){
        int temp = head.value;
        head=head.next; // java garbage collector will handle the rest
        nElmes--;
        return temp;
    }
    //------------------------------------------------------------//
    int deleteLast(){
        Node dl = head;
        for (int i=1; i<nElmes-1; i++){
            dl=dl.next;
        }
        int temp=dl.next.value;
        dl.next=null;
        nElmes--;
        return temp;
    }
    //------------------------------------------------------------//
    int deleteAt(int index){
        Node dl = head;
        for(int i=1; i<index; i++){
            dl=dl.next;
        }
        int temp = dl.next.value;
        dl.next=dl.next.next;
        nElmes--;
        return temp;
    }
    //------------------------------------------------------------//
    int find(int value){
        Node fi = head;
        for (int i=0; i<nElmes-1; i++){
            if (fi.value==value){
                return i;
            }
            fi=fi.next;
        }
        return -1;
    }
} 