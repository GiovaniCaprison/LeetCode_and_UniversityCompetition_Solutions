public class Queue {

    private final int maxSize;
    private final String[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) { // constructor
        maxSize = s;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    public void insert(String j) { // put item at rear of queue
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if(rear == maxSize-1) // deal with wraparound
            rear = -1;
        rear++;
        queArray[rear] = j; // increment rear and insert
        nItems++; // one more item
        System.out.println("Inserting " + j);
    }
    public void remove() { // take item from front of queue
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        String temp = queArray[front];// get value and incr front
        front++;
        if(front == maxSize) // deal with wraparound
            front = 0;
        nItems--; // one less item
        System.out.println("Removing " + temp);
    }
    public String peekFront(){ // peek at front of queue
        return queArray[front];
    }
    public boolean isEmpty() { // true if queue is empty
        return (nItems==0);
    }
    public boolean isFull() { // true if queue is full
        return (nItems==maxSize);
    }
    public int size() { // number of items in queue
        return nItems;
    }
}