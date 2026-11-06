class Solution {
    public int countElements(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
            } 
            if(min > nums[i]) {
                min = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++) {  
            if(nums[i]<max && nums[i] > min) {
                count++;
            }
        }
        return count;
    }
}