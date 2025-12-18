public class PatientList {
   private Node head;

   public PatientList(){
       this.head = null;
   }

   // adding patient to end of the list
   public void addPatient(Patient p){
       Node newNode = new Node(p);
       if (head == null){
           head = newNode;
           return;
       }
       Node current = head;
       while (current.next != null){
           current = current.next;
       }
       current.next = newNode;
   }
   // removing patient by ID
    public Boolean removePatient(int id){
       if (head == null) {
           return false;
       }
       if (head.patient.id == id){
           head = head.next;
           return true;
       }
       Node current = head ;
       while (current.next != null){
           if (current.next.patient.id == id){
               current.next = current.next.next;
               return true;
           }
           current = current.next;
       }
       return false;
    }

    // finding patient by id
    public Patient findPatient(int id){
       Node current = head;

       while (current != null){
           if (current.patient.id == id){
               return current.patient;
           }
           current = current.next;
       }
       return null;
    }

    public void printList(){
       Node current = head;

       if (head == null){
           System.out.println("Patient list is empty.");
           return;
       }
       System.out.println("Current patients:");
       while (current != null){
           System.out.println("* " + current.patient.printInfo());
           current = current.next;
       }
    }

    public int size(){
       int count = 0;
       Node current = head;
       while (current != null){
           count ++ ;
           current = current.next;
       }
       return count;
    }
}
