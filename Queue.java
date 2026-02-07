public class Queue {
    public static void main(String[] args) {
        QueueLinkedList list = new QueueLinkedList();
        System.out.println(list.isEmpty());
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);
        list.enqueue(50);
        list.enqueue(60);
        list.displayQueue();

        list.dequeue();
        list.dequeue();
        list.displayQueue();

        list.enqueue(70);
        list.enqueue(80);
        list.displayQueue();
    }
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class QueueLinkedList{
    private Node front, rear;

    public QueueLinkedList(){
        this.front=this.rear=null;
    }

    public boolean isEmpty(){
        return front == null && rear == null;
    }

    public void enqueue(int n){
        Node newNode = new Node(n);
        if(isEmpty()){
            front = rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
        System.out.println(n+" is added in the rear of the queue");
    }

    public int dequeue(){
        if(isEmpty())
            return -1;
        int temp = front.data;
        front = front.next;
        if(front == null)
            rear = null;
        return temp;
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        System.out.println(front.data);
    }

    public void displayQueue(){
        if(isEmpty())
            System.out.println("Queue is Empty");

        Node curr = front;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();

    }

}