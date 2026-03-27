package DivideAndConcur;

public class MergeSort {

    public static void Merge(int[] arr, int si, int li, int mid) {
        int[] temp = new int[li - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        // Merge two sorted halves
        while (i <= mid && j <= li) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        while (j <= li) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        // Copy back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void Divide(int[] arr, int si, int li) {
        if (si >= li) {
            return;
        }

        int mid = si + (li - si) / 2;

        Divide(arr, si, mid);
        Divide(arr, mid + 1, li);
        Merge(arr, si, li, mid);
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 4, 1, 2, 6};

        Divide(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

