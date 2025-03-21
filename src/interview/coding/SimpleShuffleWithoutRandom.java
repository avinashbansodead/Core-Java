package interview.coding;

public class SimpleShuffleWithoutRandom {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        shuffleArray(arr);

        // Print shuffled array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] arr) {
        int n = arr.length;

        // Nested loop for multiple swaps
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j += 2) { // Swap every alternate element
                // Swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
