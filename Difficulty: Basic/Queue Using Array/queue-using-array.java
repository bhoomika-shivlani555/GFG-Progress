class myQueue {
    int arr[];
    int front;
    int rear;
    int size;
    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        this.front=this.rear=-1;
        arr=new int[n];
        this.size=0;
    }

    public boolean isEmpty() {
        return (size==0);
    }

    public boolean isFull() {
        return (size==arr.length);
    }

    public void enqueue(int x) {
        if(isFull())
            return;
        
        if(rear==-1 && front==-1)
            front++;
        
        rear++;
        arr[rear]=x;
        size++;
        
    }

    public void dequeue() {
       if(isEmpty())
            return ;
        if(front==rear)
            rear=front=-1;
        else
            front++;
        size--;
            
    }

    public int getFront() {
        if(isEmpty())
            return -1;
        else
            return arr[front];
    }

    public int getRear() {
        if(isEmpty())
            return -1;
        else
            return arr[rear];
    }
}
