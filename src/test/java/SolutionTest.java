import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {8, 1, 2, 2, 3};
        int[] expected1 = {4, 0, 1, 1, 3};
        int[] actual1 = solution.smallerNumbersThanCurrent(nums1);
        assertArrayEquals(expected1, actual1);

        // Test Case 2
        int[] nums2 = {5, 0, 10, 2, 8};
        int[] expected2 = {2, 0, 4, 1, 3};
        int[] actual2 = solution.smallerNumbersThanCurrent(nums2);
        assertArrayEquals(expected2, actual2);

        // Test Case 3
        int[] nums3 = {1, 1, 1, 1, 1};
        int[] expected3 = {0, 0, 0, 0, 0};
        int[] actual3 = solution.smallerNumbersThanCurrent(nums3);
        assertArrayEquals(expected3, actual3);

        // Test Case 4
        int[] nums4 = {9, 8, 7, 6, 5};
        int[] expected4 = {4, 3, 2, 1, 0};
        int[] actual4 = solution.smallerNumbersThanCurrent(nums4);
        assertArrayEquals(expected4, actual4);

        // Test Case 5
        int[] nums5 = {4, 3, 2, 1, 0};
        int[] expected5 = {4, 3, 2, 1, 0};
        int[] actual5 = solution.smallerNumbersThanCurrent(nums5);
        assertArrayEquals(expected5, actual5);

        // Test Case 6
        int[] nums6 = {100, 100, 100, 100};
        int[] expected6 = {0, 0, 0, 0};
        int[] actual6 = solution.smallerNumbersThanCurrent(nums6);
        assertArrayEquals(expected6, actual6);

        // Test Case 7
        int[] nums7 = {2, 4, 6, 8, 10};
        int[] expected7 = {0, 1, 2, 3, 4};
        int[] actual7 = solution.smallerNumbersThanCurrent(nums7);
        assertArrayEquals(expected7, actual7);

        // Test Case 8
        int[] nums8 = {7, 3, 9, 2, 5};
        int[] expected8 = {3, 1, 4, 0, 2};
        int[] actual8 = solution.smallerNumbersThanCurrent(nums8);
        assertArrayEquals(expected8, actual8);

        // Test Case 9
        int[] nums9 = {0, 0, 0, 0, 0};
        int[] expected9 = {0, 0, 0, 0, 0};
        int[] actual9 = solution.smallerNumbersThanCurrent(nums9);
        assertArrayEquals(expected9, actual9);

        // Test Case 10
        int[] nums10 = {5, 1, 3, 7, 9};
        int[] expected10 = {2, 0, 1, 3, 4};
        int[] actual10 = solution.smallerNumbersThanCurrent(nums10);
        assertArrayEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
