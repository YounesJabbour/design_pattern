public class QuickSort implements ISort {
    @Override
    public void sort(int[] arr, int val) {
        System.out.println("Quick Sort");
        if (arr == null || arr.length == 0) {
            return;
        }
        quickSort(arr, 0, arr.length - 1, val);
    }

    private void quickSort(int[] arr, int low, int high, int val) {
        if (low < high) {
            int pi = partition(arr, low, high, val);
            quickSort(arr, low, pi - 1, val);
            quickSort(arr, pi + 1, high, val);
        }
    }

    private int partition(int[] arr, int low, int high, int val) {
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
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
