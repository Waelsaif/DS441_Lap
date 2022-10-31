package Lab_4;
class StackArray
{
private int capacity; // size of stack array
private long[] a;
private int nElems; // top of stack

public StackArray(int s) { // constructor
capacity = s; // set array size
a = new long[capacity]
; // create array
nElems = 0; // no items
}

public void push(long j) { 

a[nElems] = j; // increment top, insert item
nElems++;
}

public long pop() { // take item from top of stack
int top = nElems-1;
long temp = a[top];
nElems--;
return temp; //

}

public long peek() { // peek at top of stack
int top = nElems-1;
return a[top];
}

public boolean isEmpty() { 
if (nElems == 0) {
return true;
} else {
return false;
}
}

public boolean isFull() { // true if stack is full
return (nElems ==
capacity);
}

} 