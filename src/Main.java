//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ** Testing Task 1
        PatientList list = new PatientList();

        // * Adding 5 patients
        Patient a = new Patient(1, "Nur Aksoy", 3, 21);
        Patient b = new Patient(2, "Ahmet Mutlu", 5, 35);
        Patient c = new Patient(3, "Ayşe Yılmaz", 7, 47);
        Patient d = new Patient(4, "Yusuf Atılgan", 1, 13);
        Patient e = new Patient(5, "Zeynep Korkmaz", 9, 61);

        list.addPatient(a);
        list.addPatient(b);
        list.addPatient(c);
        list.addPatient(d);
        list.addPatient(e);

        System.out.println("After adding 5 patients:");
        list.printList();
        System.out.println("Size: " + list.size());
        System.out.println();

        System.out.println("*************************************\n");

        // * Removing patient
        boolean removed = list.removePatient(3);
        if (removed) {
            System.out.println("Patient with id = 3 is removed");
        } else {
            System.out.println("Patient with id = 3 is not found");
        }
        list.printList();
        System.out.println();

        System.out.println("*************************************\n");

        // * Finding patient
        Patient found = list.findPatient(5);
        if (found != null) {
            System.out.println("Patient with id = 5 is found.");
            System.out.println(found.printInfo());
        } else {
            System.out.println("Patient with id = 5 is not found");
        }
        System.out.println();
        System.out.println("*************************************\n");

        System.out.println("Final list: ");
        list.printList();
        System.out.println("Final size: " + list.size());

        System.out.println("*************************************\n");
        System.out.println("*************************************\n");

        // ** Testing Task 2
        TreatmentQueue queue = new TreatmentQueue();

        // * Adding 8 requests
        for (int i = 1; i <= 8; i++) {
            queue.enqueue(new TreatmentRequest(i, false));
        }

        System.out.println("After adding 8 requests:");
        queue.printQueue();
        System.out.println("Size: " + queue.size());
        System.out.println();
        System.out.println("*************************************\n");

        // * Removing 3 request
        for (int i = 0; i < 3; i++) {
            TreatmentRequest removedRequest = queue.dequeue();
        }
        System.out.println();
        System.out.println("*************************************\n");

        // * Printing remaining queue
        System.out.println("Remaining queue: ");
        queue.printQueue();
        System.out.println("Size: " + queue.size());

        System.out.println("*************************************\n");
        System.out.println("*************************************\n");

        // ** Testing Task 3
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
        stack.pop();
        System.out.println();
        stack.pop();
        System.out.println();
        System.out.println("*************************************\n");

        // * Remaining stack
        System.out.println("Remaining stack:");
        stack.printStack();
        System.out.println("Final size: " + stack.size());


        // ** Testing Task 4
        HospitalSystem hs = new HospitalSystem();

        // * Adding 10 patients
        for (int i = 0; i <= 9; i++) {
            hs.addPatient(new Patient(1 + i, "Patient " + (i + 1), (i % 10) + 1, 30 + i));
        }

        // * Adding 5 normal + 3 priority treatment requests
        hs.addTreatmentRequest(1, false);
        hs.addTreatmentRequest(2, false);
        hs.addTreatmentRequest(3, false);
        hs.addTreatmentRequest(4, false);
        hs.addTreatmentRequest(5, false);

        hs.addTreatmentRequest(6, true);
        hs.addTreatmentRequest(7, true);
        hs.addTreatmentRequest(8, true);

        // * Adding 2 discharge records
        hs.addDischargeRecord(15);
        hs.addDischargeRecord(16);

        // * Processing 4 treatment requests (priority first)
        System.out.println("* The processed patients: ");
        hs.processNextTreatment();
        hs.processNextTreatment();
        hs.processNextTreatment();
        hs.processNextTreatment();
        System.out.println("*************************************\n");
        System.out.println("*************************************\n");

        // * Printing final system state
        hs.printSystem();

        // * Sorted list by severity
        hs.printSortedBySeverity();

    }
}
