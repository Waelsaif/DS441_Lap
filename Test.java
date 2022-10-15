public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);
        list.insertLast(6);
        list.insertAt(10,3);
        list.deleteAt(3);
        
        System.out.println(list.size());
        list.print();
        System.out.println(list.find(0));

    }
}
