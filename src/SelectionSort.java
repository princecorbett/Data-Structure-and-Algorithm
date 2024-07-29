public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {11, 2, 34, 45, 4, 7, 33, 23, 9};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;
        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.println(num + " ");
        }

        for(int i = 0; i < size -1; i++) {
            minIndex = i;
            for(int j = i+1; j < size; j++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
                }
                 temp = nums[minIndex];
                 nums[minIndex] = nums[i];
                 nums[i] = temp;
        }


        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.println(num + " ");
        }
    }
}