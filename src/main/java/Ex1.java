public class Ex1 {
    public static void rotate(int arr[], int d, int n) {
        d = d % n;
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 2;

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        rotate(arr, d, n);

        System.out.println("\nArray after rotation by " + d + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
