public class MergeSort implements ISort {
    @Override
    public void sort(int[] arr, int val) {
        System.out.println("Merge Sort");
        if (arr == null || arr.length == 0) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1, val);

    }

private void mergeSort(int[] arr, int left, int right, int val) {
    if (left < right) {
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid, val);
        mergeSort(arr, mid + 1, right, val);
        merge(arr, left, mid, right, val);
    }
}

private void merge(int[] arr, int left, int mid, int right, int val) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; i++) {
        L[i] = arr[left + i];
    }
    for (int j = 0; j < n2; j++) {
        R[j] = arr[mid + 1 + j];
    }

    int i = 0, j = 0;
    int k = left;
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            if (L[i] == val) {
                System.out.println("Value " + val + " found at index " + k);
            }
            i++;
        } else {
            arr[k] = R[j];
            if (R[j] == val) {
                System.out.println("Value " + val + " found at index " + k);
            }
            j++;
        }
        k++;
    }

    while (i < n1) {
        arr[k] = L[i];
        if (L[i] == val) {
            System.out.println("Value " + val + " found at index " + k);
        }
        i++;
        k++;
    }

    while (j < n2) {
        arr[k] = R[j];
        if (R[j] == val) {
            System.out.println("Value " + val + " found at index " + k);
        }
        j++;
        k++;
    }
}


}
