import java.util.HashMap;
public class HospitalSystem {

        private PatientList patientList;
        private TreatmentQueue treatmentQueue;
        private DischargeStack dischargeStack;
        private HashMap<Integer, Patient> patientMap;

        public HospitalSystem() {
            patientList = new PatientList();
            treatmentQueue = new TreatmentQueue();
            dischargeStack = new DischargeStack();
            patientMap = new HashMap<>();
        }

        // Adding new patient
        public void addPatient(Patient p) {
            patientList.addPatient(p);
            patientMap.put(p.id, p);
        }

        // Adding treatment request
        public void addTreatmentRequest(int patientId, boolean priority) {
            if (!patientMap.containsKey(patientId)) {
                System.out.println("Patient not found!!!");
                return;
            }
            TreatmentRequest request = new TreatmentRequest(patientId, priority);
            treatmentQueue.enqueue(request);
        }

        // Adding discharge record
        public void addDischargeRecord(int patientId) {
            dischargeStack.push(new DischargeRecord(patientId));
        }

        // Process treatment request → move to discharge stack
        public void processNextTreatment() {
            TreatmentRequest request = treatmentQueue.dequeue();

            if (request == null) {
                System.out.println("No treatment requests to process");
                return;
            }

            dischargeStack.push(new DischargeRecord(request.patientId));
            patientList.removePatient(request.patientId);
            patientMap.remove(request.patientId);

            System.out.println("Processed patient: " + request.patientId);
        }

        // Printing system status
        public void printSystem() {
            System.out.println("\n*** Patient List ***");
            patientList.printList();
            System.out.println("\n*************************************\n");
            System.out.println("*************************************\n");

            System.out.println("\n*** Treatment Queue ***");
            treatmentQueue.printQueue();
            System.out.println("\n*************************************\n");
            System.out.println("*************************************\n");

            System.out.println("\n*** Discharge Stack ***");
            dischargeStack.printStack();
            System.out.println("\n*************************************\n");
            System.out.println("*************************************\n");
        }

        // Printing sorted list by severity
        public void printSortedBySeverity() {
            Patient[] array = Sorter.sortBySeverity(patientList);

            if (array == null || array.length == 0) {
                System.out.println("No patients to sort");
                return;
            }
            System.out.println("\n*** Patients Sorted by Severity ***");
            for (Patient p : array) {
                System.out.println("* " + p);
            }
        }

    }

