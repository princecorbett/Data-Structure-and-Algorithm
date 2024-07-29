public class QuickSort {
    public static void QuickSort(int[] arr, int low, int high) {
        if(low< high){
            int pi = partition(arr,low, high);
            QuickSort(arr, low, pi -1);
            QuickSort(arr, pi+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low; j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {11, 2, 34, 45, 4, 7, 33, 23, 9};

        System.out.println("before Sorted Array");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        QuickSort(arr, 0, arr.length - 1);


        System.out.println();

        System.out.println("After Sorted Array");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
