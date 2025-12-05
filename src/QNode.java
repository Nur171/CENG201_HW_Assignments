public class QNode {
    TreatmentRequest request;
    QNode next;

    public QNode(TreatmentRequest request){
        this.request = request;
        this.next = null;
    }
}
