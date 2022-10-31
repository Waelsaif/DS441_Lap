package Lab_5;

public class LLStack {
    public static void main(String[] args) {
        LLStack obj1 = new LLStack();
        obj1.push(0);
        obj1.push(1);
        obj1.push(2);
        obj1.push(3);
        System.out.println(obj1.pop());
        obj1.display();
    }
    LinkList stack = new LinkList();
    void push(int d){
        stack.insertLast(d);
    }
    Node pop(){
        Node temp= stack.deleteLast(); 
        stack.nElems--;
        return temp;

    }
    void display(){
        int top=stack.nElems;
        while (top >=1){
            System.out.print(stack.deleteLast()+" ");
            top--;
        }
        System.out.println(stack.deleteFirst());
    }
}
