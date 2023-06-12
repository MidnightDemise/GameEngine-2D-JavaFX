import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LongestConsecutiveSequence {
    
    public static void main(String[] args) {
        int nums2[] = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int ans = longestSequence(nums2);
        System.out.println(ans);
    }

    public static int longestSequence(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) {
            return 0;
        }
        
        int maxLength = 1;
        int length = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            
            if (nums[i] - nums[i - 1] == 1) {
                length++;
            } else {
                maxLength = Math.max(maxLength, length);
                length = 1;
            }
        }
        
        maxLength = Math.max(maxLength, length);
        
        return maxLength;
    }
}