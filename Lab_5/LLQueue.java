package Lab_5;

public class LLQueue {
    public static void main(String[] args) {
        LLQueue obj = new LLQueue();
        obj.enqueue(0);
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        System.out.println(obj.dequeue());
        obj.display();

    }
    LinkList queue = new LinkList();

    public void enqueue(int q){
    queue.insertLast(q);
    }
    public Node dequeue(){
        return queue.deleteFirst();
        }
    public void display(){
        int front = queue.nElems;
        int count=0;
        while (count <= front){
            System.out.print(queue.deleteFirst()+" ");
            count++;
        }
    } 

}
