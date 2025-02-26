package sorts;

public class Quick {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Wähle das Pivot-Element
            int pi = partition(arr, low, high);

            // Rekursiv auf die beiden Teillisten anwenden
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition für QuickSort
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Tausche arr[i] und arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Tausche arr[i + 1] und arr[high] (Pivot-Element)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    
}
