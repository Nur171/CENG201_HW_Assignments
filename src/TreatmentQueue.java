public class TreatmentQueue {
    private QNode normalFront;
    private QNode normalTail;
    private QNode priorityFront;
    private QNode priorityTail;
    private int size;

    public TreatmentQueue() {
        normalFront = null;
        normalTail = null;
        priorityFront = null;
        priorityTail = null;
        size = 0;
    }

    // Adding element to tail
    public void enqueue(TreatmentRequest request) {
        QNode newNode = new QNode(request);

        if (request.priority) {
            // insert into priority queue
            if (priorityFront == null) {
                priorityFront = newNode;
                priorityTail = newNode;
            } else {
                priorityTail.next = newNode;
                priorityTail = newNode;
            }
        } else {
            // insert into normal queue
            if (normalFront == null) {
                normalFront = newNode;
                normalTail = newNode;
            } else {
                normalTail.next = newNode;
                normalTail = newNode;
            }
            size++;
        }
    }

        // Removing the element from the head
        public TreatmentRequest dequeue () {
            if (priorityFront != null) {
                TreatmentRequest r = priorityFront.request;
                priorityFront = priorityFront.next;

                if (priorityFront == null)
                    priorityTail = null;

                size--;
                return r;
            }
            if (normalFront != null) {
                TreatmentRequest r = normalFront.request;
                normalFront = normalFront.next;

                if (normalFront == null)
                    normalTail = null;

                size--;
                return r;
            }
            return null;
        }

        // The size of the queue
        public int size () {
            return size;
        }

        // Printing the queue
        public void printQueue () {
            System.out.println("Priority Requests:");
            QNode a = priorityFront;
            while (a != null) {
                System.out.println(" " + a.request);
                a = a.next;
            }

            System.out.println("Normal Requests: ");
            a = normalFront;
            while (a != null) {
                System.out.println(" " + a.request);
                a = a.next;
            }
        }
    }
