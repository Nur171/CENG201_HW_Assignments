public class Test3 {
    public static void main(String[] args) {
        // ** Main task 3

        DischargeStack stack = new DischargeStack();

        // * Adding 5 discharge records
        stack.push(new DischargeRecord(11));
        stack.push(new DischargeRecord(12));
        stack.push(new DischargeRecord(13));
        stack.push(new DischargeRecord(14));
        stack.push(new DischargeRecord(15));

        System.out.println("After pushing 5 discharge records:");
        stack.printStack();
        System.out.println("Size: " + stack.size());
        System.out.println();

        System.out.println("*************************************\n");

        // * Popping 2 element
        System.out.println("Pop 1: " + stack.pop());
        System.out.println("Pop 2: " + stack.pop());
        System.out.println();
        System.out.println("*************************************\n");

        // * Remaining stack
        System.out.println("Remaining stack:");
        stack.printStack();
        System.out.println("Final size: " + stack.size());
    }
}

