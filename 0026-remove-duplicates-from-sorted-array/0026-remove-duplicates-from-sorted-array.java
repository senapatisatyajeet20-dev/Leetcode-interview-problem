class Solution {
    int k=1;
    public int removeDuplicates(int[] nums) {
        for(int i=1; i<nums.length ; i++){
            if (nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k+=1;
            }
        }
        return k;
    }
}