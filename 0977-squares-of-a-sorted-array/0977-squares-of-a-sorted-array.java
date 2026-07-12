class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int insertPointer = nums.length - 1;

        while(left <= right){
            int leftVal = Math.abs(nums[left]);
            int rightVal = Math.abs(nums[right]);
            if(leftVal < rightVal){
                arr[insertPointer] = rightVal * rightVal;
                insertPointer -= 1;
                right -= 1;
                continue;
            }
            arr[insertPointer] = leftVal * leftVal;
            insertPointer -= 1;
            left += 1;
        }
        return arr;

    }
}