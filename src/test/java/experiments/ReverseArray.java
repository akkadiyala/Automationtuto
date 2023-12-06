package experiments;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {9, 3, 6, 8, 4, 7};

        // Print the original array
        System.out.print("Original Array: ");
        printArray(a);

        // Reverse the array in-place
        reverseArray(a);

        // Print the reversed array
        System.out.print("Reversed Array: ");
        printArray(a);
    }

    private static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at positions start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the center
            start++;
            end--;
        }
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
