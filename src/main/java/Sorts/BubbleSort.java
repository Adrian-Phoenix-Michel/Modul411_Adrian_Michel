package Sorts;

public class BubbleSort {
    private static void bubbleSort(int[] A) {
        boolean unsorted = true;
        int temp;
        int n = A.length;
        int i;

        while (unsorted) {
                unsorted = false;
                for (i = 0; i < n - 1; i++) {
                    if (A[i] > A[i + 1]) {
                        temp = A[i];
                        A[i] = A[i + 1];
                        A[i + 1] = temp;
                        unsorted = true;
                    }
                }
            }
        }

    public static void main(String[] args) {
            int[] A = {0, 9, 4, 6, 2, 8, 5, 1, 7, 3};
            bubbleSort(A);
            for (int value : A) System.out.print(value + " ");
    }
}
