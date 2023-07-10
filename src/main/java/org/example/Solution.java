package org.example;

public class Solution {
    /**
     * Counts the number of smaller numbers than each element in the given array.
     *
     * @param nums The input array of integers.
     * @return An array where each element represents the count of smaller numbers than the corresponding element in the input array.
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];

        // Count the frequency of each number
        for (int num : nums) {
            count[num]++;
        }

        // Calculate the cumulative sum
        int[] cumulativedVal = new int[101];
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            cumulativedVal[i] = sum;
            sum += count[i];
        }

        // Calculate the number of smaller numbers for each element
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = cumulativedVal[nums[i]];
        }

        return result;
    }

}
