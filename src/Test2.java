public class Test2 {
    public static void main(String[] args) {
// Main task 2

        TreatmentQueue queue = new TreatmentQueue();

        // Adding 8 requests
        for (int i = 1; i <= 8; i++) {
            queue.enqueue(new TreatmentRequest(i, false));
        }

        System.out.println("After adding 8 requests:");
        queue.printQueue();
        System.out.println("Size: " + queue.size());
        System.out.println();
        System.out.println("*************************************\n");

        // Removing 3 request
        for (int i = 0; i < 3; i++) {
            TreatmentRequest removedRequest = queue.dequeue();
            System.out.println("Processed request: " + removedRequest);
        }
        System.out.println();
        System.out.println("*************************************\n");

        // Printing remaining queue
        System.out.println("Remaining queue: ");
        queue.printQueue();
        System.out.println("Size: " + queue.size());

        System.out.println("*************************************\n");
        System.out.println("*************************************\n");

    }
}