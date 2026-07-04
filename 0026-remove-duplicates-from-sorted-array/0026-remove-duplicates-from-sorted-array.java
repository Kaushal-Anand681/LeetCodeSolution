class Solution {
    public int removeDuplicates(int[] nums) {
        int fixed = 0;
        int mover = 1;
        while(mover < nums.length){
            if(nums[mover] == nums[fixed]){
                mover += 1;
                continue;
            }
            nums[fixed+1] = nums[mover];
            fixed += 1;
            mover += 1;
        }
        return fixed + 1;
    }
}