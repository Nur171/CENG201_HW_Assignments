public class DischargeRecord {
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId){
        this.patientId = patientId;
        this.dischargeTime = System.currentTimeMillis();
    }

    public String printInfo() {
        return "Discharge Record: \nPatient Id= " + patientId + "\nDischarge Time = " + dischargeTime;
    }
}
