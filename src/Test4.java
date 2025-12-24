public class Test4 {
    public static void main(String[] args) {

        // Task 4
        HospitalSystem hs = new HospitalSystem();

        // Adding 10 patients
        for (int i = 0; i <= 9; i++) {
            hs.addPatient(new Patient(1 + i, "Patient " + (i + 1), (i % 10) + 1, 30 + i));
        }

        // Adding 5 normal + 3 priority treatment requests
        hs.addTreatmentRequest(1, false);
        hs.addTreatmentRequest(2, false);
        hs.addTreatmentRequest(3, false);
        hs.addTreatmentRequest(4, false);
        hs.addTreatmentRequest(5, false);

        hs.addTreatmentRequest(6, true);
        hs.addTreatmentRequest(7, true);
        hs.addTreatmentRequest(8, true);

        // Adding 2 discharge records
        hs.addDischargeRecord(15);
        hs.addDischargeRecord(16);

        // Processing 4 treatment requests (priority first)
        hs.processNextTreatment();
        hs.processNextTreatment();
        hs.processNextTreatment();
        hs.processNextTreatment();

        // Printing final system state
        hs.printSystem();

        // Sorted list by severity
        hs.printSortedBySeverity();

    }
}
