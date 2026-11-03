class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        long count = 0;
        int med = nums.length/2;
        for(int i=0; i<nums.length; i++) {
            count += Math.abs((long)nums[i] - nums[med]);
        }
        return (int)count;
    }
}