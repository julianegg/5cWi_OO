package sorts;
import java.util.Random;

public class fast {
   



    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Hilfsmethode zum Erstellen eines Arrays mit Zufallszahlen
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000);  // Zufallszahl zwischen 0 und 100.000
        }
        return arr;
    }

    // Methode zum Messen der Laufzeit eines Sortieralgorithmus
    public static long measureTime(Runnable sortMethod, int[] arr) {
        long startTime = System.nanoTime();
        sortMethod.run();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000; // Zeit in Millisekunden
    }

    public static void main(String[] args) {
        int n = 16000;  // Größe des Arrays (16.000 Elemente)
        
        // Erstelle ein Array mit zufälligen Zahlen
        int[] originalArray = generateRandomArray(n);

        // Erstelle Kopien des Arrays für jeden Algorithmus
        int[] bubbleArray = originalArray.clone();
        int[] selectionArray = originalArray.clone();
        int[] quickArray = originalArray.clone();

        // BubbleSort
        long bubbleSortTime = measureTime(() -> bubbleSort(bubbleArray), bubbleArray);
        System.out.println("Bubble Sort - Zeit: " + bubbleSortTime + " ms");

        // SelectionSort
        long selectionSortTime = measureTime(() -> selectionSort(selectionArray), selectionArray);
        System.out.println("Selection Sort - Zeit: " + selectionSortTime + " ms");

        // QuickSort
        long quickSortTime = measureTime(() -> quickSort(quickArray, 0, quickArray.length - 1), quickArray);
        System.out.println("Quick Sort - Zeit: " + quickSortTime + " ms");
    }
}

    

