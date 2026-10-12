
public class ArrayRotation {

    public static void rotate(int[] arr, int d, int n) {

        d = d % n;

        for (int i = 0; i < d; i++) {
            int first = arr[0];

            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[n - 1] = first;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotate(arr, 2, arr.length);

        for (int number : arr) {
            System.out.print(number + " ");
        }

        System.out.println("\n");

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};

        rotate(arr2, 4, arr2.length);

        for (int number : arr2) {
            System.out.print( number + " ");
        }
    }
}
