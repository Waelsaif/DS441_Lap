
public class QueueApp
{
public static void main(String[] args) {
QueueArray theQueue =new QueueArray(10); // make new stack
theQueue.enqueue(20);

theQueue.enqueue(40);
theQueue.enqueue(60);
theQueue.enqueue(80);
while (!theQueue.isEmpty()) { // until
long value = theQueue.dequeue(); //
System.out.print(value); // display
System.out.print(" ");
} // end while
System.out.println(
"");
} // end main()
} // end class StackApp