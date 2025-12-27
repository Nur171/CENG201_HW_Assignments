public class PatientList {
   private Node head;

   public PatientList(){
       this.head = null;
   }

   // * Adding patient to end of the list
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
   // * Removing patient by ID
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

    // * Finding patient by id
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
           System.out.println("The Patient list is empty.");
           return;
       }
       System.out.println("The current patients:");
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

     // * Array for saving the patients
    public Patient[] toArray(){
        Patient[] array = new Patient[size()];
        Node current = head;
        int i = 0;
        while(current != null){
            array[i++] = current.patient;
            current = current.next;
        }
        return array;
    }
}
