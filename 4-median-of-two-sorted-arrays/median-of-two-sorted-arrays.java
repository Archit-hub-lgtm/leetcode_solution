import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] num3 = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            num3[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            num3[nums1.length + i] = nums2[i];
        }

        Arrays.sort(num3);

        int n = num3.length;

        if (n % 2 != 0) {
            return num3[n / 2];
        }

        else {
            return (num3[n / 2 - 1] + num3[n / 2]) / 2.0;
        }
    }
}