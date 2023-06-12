import java.util.ArrayList;
import java.util.HashSet;

public class TotalDistinctSubArrays {
    

    public static void main(String[] args)
    {
        int nums[] = {2,1,3,2,3};
        int ans = totalDistinctSubArrays(nums);
       

        System.out.println(ans);


    }


    public static int totalDistinctSubArrays(int[] nums)
    {
        HashSet <Integer> set = new HashSet<>();
        int total = 0;


        for(int i = 0 ; i < nums.length ; ++i)
        {
            arr.add(nums[i]);
        }



        return total;
    }
}
