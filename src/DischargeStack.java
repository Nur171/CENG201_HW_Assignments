public class DischargeStack {
    private SNode top;
    private int size;

    public DischargeStack() {
        top = null;
        size = 0;
    }

    // Adding new records
    public void push(DischargeRecord record) {
        SNode newNode = new SNode(record);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Removing the top record
    public DischargeRecord pop() {
        if (top == null)
            return null;

        DischargeRecord rec = top.record;
        top = top.next;
        size--;
        return rec;
    }

    // Returning the top element
    public DischargeRecord peek() {
        if (top == null) return null;

        return top.record;
    }

    // Printing the stack
    public void printStack() {
        if (top == null) {
            System.out.println("Discharge stack is empty.");
            return;
        }
        System.out.println("Current Discharge Records (top to bottom):");
        SNode current = top;
        while (current != null) {
            System.out.println("* " + current.record.printInfo());
            current = current.next;
        }
    }

    public int size() {
        return size;
    }
}
