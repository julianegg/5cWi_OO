package sorts;

public class Bubble {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        // Wiederhole so lange, bis keine Vertauschungen mehr notwendig sind
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tausche arr[j] und arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Wenn keine Vertauschungen gemacht wurden, ist das Array bereits sortiert
            if (!swapped) break;
        }
    }
    
}
