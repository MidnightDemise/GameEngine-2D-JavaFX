import java.util.HashMap;

public class SubarraySum {
    public static void main(String[] args)
    {
        int nums[] = {1,1,1};
        int target = 2;
        int ans = SubarraySum(nums,target);

        System.out.println(ans);
    }


    public static int SubarraySum(int[] nums , int target)
    {
        int result = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            sum += nums[i];

            if(map.containsKey(sum-target))
            {
                result += map.get(sum-target) + 1;
            }

            if(map.containsKey(sum))
            {
                map.put(sum,map.get(sum) + 1);

            }
            else
            {
                map.put(sum , 1);
            }

        }

        return result;
    }
}
