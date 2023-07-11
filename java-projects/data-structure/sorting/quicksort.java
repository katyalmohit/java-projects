public class quicksort{
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 19, 3, 56, 22, 17, 18, 21, 80, 60};
        int n = arr.length;

        System.out.println("Original array: ");
        printArray(arr);

        // Sorting the array using Quick Sort
        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array: ");
        printArray(arr);

        // Runtime analysis
        int sortedArr[] = new int[n];
        int reverseSortedArr[] = new int[n];
        int randomArr[] = new int[n];

        for (int i = 0; i < n; i++) {
            sortedArr[i] = i + 1;
            reverseSortedArr[i] = n - i;
            randomArr[i] = (int) (Math.random() * n) + 1;
        }

        long startTime, endTime, elapsedTime;

        // Already sorted sequence of length n
        System.out.println("\nRuntime analysis for an already sorted sequence of length " + n);
        startTime = System.nanoTime();
        quickSort(sortedArr, 0, n - 1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time: " + elapsedTime + " nanoseconds");

        // Reverse sorted list of n elements
        System.out.println("\nRuntime analysis for a reverse sorted list of length " + n);
        startTime = System.nanoTime();
        quickSort(reverseSortedArr, 0, n - 1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time: " + elapsedTime + " nanoseconds");

        // Random order sequence of length n
        System.out.println("\nRuntime analysis for a random order sequence of length " + n);
        startTime = System.nanoTime();
        quickSort(randomArr, 0, n - 1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time: " + elapsedTime + " nanoseconds");
    }
}
