public class Sorter {
    public static Patient[] sortBySeverity (PatientList list){
        Patient[] array = list.toArray();

        // * Bubble sort
        for (int i = 0; i < array.length -1 ; i++){
            for (int j = 0 ; j < array.length -i -1 ; j++){
                if (array[j].severity < array[ j+1 ].severity){
                    // Swaping
                    Patient a = array[j];
                    array[j] = array[j+1];
                    array[j+1] = a;
                }
            }
        }
        return array;
    }
}
