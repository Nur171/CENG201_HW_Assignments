public class TreatmentQueue {
    private QNode front;
    private QNode tail;
    private int size;

    // Adding element to tail
    public void enqueue(TreatmentRequest request){
        QNode newNode = new QNode(request);

        if (tail == null){
            front = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Removing the element from the head
    public TreatmentRequest dequeue(){
        if (front ==null){
            return null;
        }
        if (front == null){
            tail = null;
        }
        TreatmentRequest removed = front.request;
        front = front.next;
        size--;
        return removed;
    }

    // The size of the queue
    public int size(){
        return size;
    }

    // Printing the queue
    public void printQueue(){
        if (front == null){
            System.out.println("Treatment queue is empty.");
            return;
        }
        System.out.println("Current Treatment Requests: ");
        QNode current = front;
        while (current != null) {
            System.out.println("* " + current.request.printInfo());
            current = current.next;
        }
    }

}
