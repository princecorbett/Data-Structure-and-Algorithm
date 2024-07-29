public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {2,4,7,9,11,14,24,56,76};
        int target = 56;
        int result = BinarySearch(nums, target);
        if(result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");
    }
    public static int BinarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (high+low)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                low= mid+1;
            }
            else
                high = mid -1;
        }
        return -1;
    }
}
