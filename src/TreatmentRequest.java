public class TreatmentRequest {
    int patientId;
    long arrivalTime;
    boolean priority; // if true -> high priority patient

    public TreatmentRequest(int patientId, boolean priority) {
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
        this.priority = priority;
    }

    public String printInfo() {
        return "Treatment Request { Patient Id: " + patientId + "\n" + "Priority: " + priority + "\n" + "Arrival time: " + arrivalTime + "}";
    }

}
