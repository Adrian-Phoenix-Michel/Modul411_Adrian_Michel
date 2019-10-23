package Sorts;

public class InsertionSort {

    private static void insertionSort(int[] A) {
        int n = A.length;
        int i;
        int j;
        int value;

        for (i = 1; i < n; ++i) {
            value = A[i];
            j = i - 1;
            while (j >= 0 && A[j] > value) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;

        }
    }

    public static void main(String[] args) {
        int[] A = {0, 9, 4, 6, 2, 8, 5, 1, 7, 3};
        insertionSort(A);
        for (int value : A) System.out.print(value + " ");
    }
}
