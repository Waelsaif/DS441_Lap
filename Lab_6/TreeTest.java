package Lab_6;
public class TreeTest {
    public static void main(String[] args) {
        Tree t = new Tree();

        t.insert(20);
        t.insert(25);
        t.insert(15);
        t.insert(28);
        t.insert(23);

        boolean b = t.find(25);
        boolean c = t.recFind(23,t.root);
        System.out.println(b);
        System.out.println(c);

        int m = t.max();
        System.out.println(m);
        System.out.println(t.min());

        t.inOrder();
        System.out.println("");

        t.preOrder();
        System.out.println("");

        t.postOrder();
        System.out.println("");

        t.isFull();   
    }
}
