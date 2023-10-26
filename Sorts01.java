import java.util.Random;

public class BubbleSort(int[] arr) {
    int n = arr.length;
    boolean swapped;

    do {
        swapped = false;
        for (int i = 1; i < n; i++) {
            // Swap if the element found is greater than the next element
            if (arr[i - 1] > arr[1]) {
                int temp = arr[i -1];
                arr[i - 1] = arr[i];

            }
        }
    }
}