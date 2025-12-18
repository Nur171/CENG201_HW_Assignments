public class TreatmentRequest {
    int patientId;
    long arrivalTime;

    public TreatmentRequest(int patientId) {
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
    }

    public String printInfo() {
        return "Treatment Request { Patient Id: " + patientId + "\n" + "Arrival time: " + arrivalTime + "}";
    }
}
