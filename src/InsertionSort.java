public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {11, 2, 34, 45, 4, 7, 33, 23, 9};
        System.out.println("Before sorting: ");
        for(int num : arr){
            System.out.println(num + " ");
        }
        for(int i=1; i<arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+ 1] = key;
        }

        System.out.println("After sorting: ");
        for(int num : arr){
            System.out.println(num + " ");
        }

    }
}
