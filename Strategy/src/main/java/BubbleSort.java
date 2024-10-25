public class BubbleSort implements ISort {
    @Override
    public void sort(int[] arr, int val) {
        System.out.println("Bubble Sort");
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                if (arr[j] == val) {
                    System.out.println("Value " + val + " found at index " + j);
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
