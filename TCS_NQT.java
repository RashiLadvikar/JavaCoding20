class Zeros {
    static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0; // Count of non-zero elements

        
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

         while (count < n) {
            arr[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 3, 0, 5, 0, 7, 9, 0 };
        
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        moveZerosToEnd(arr);

        System.out.println("\nArray after moving zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
