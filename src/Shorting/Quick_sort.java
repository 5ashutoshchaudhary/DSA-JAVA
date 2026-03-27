package Shorting;

public class Quick_sort {

    public static void quickSort(int[] arr, int si, int ei) {

        if (si >= ei) return;

        int pi = partition(arr, si, ei);

        quickSort(arr, si, pi - 1);
        quickSort(arr, pi + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei) {

        int p = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {

            if (arr[j] < p) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 8, 9, 3, 7, 1};

        quickSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
