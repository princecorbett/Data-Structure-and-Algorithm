public class LinearSearch {
    public static void main(String[] args){
        int nums[] = {4,2,6,8,11,3,9};
        int target = 8;
        int result = LinearSearch(nums, target);
        if(result != -1)
            System.out.println("The index of the value is :" + result);
        else
            System.out.println("not found");
    }
    public static int LinearSearch(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return  -1;

    }
}
