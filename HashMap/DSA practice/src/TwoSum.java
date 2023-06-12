import java.net.SocketTimeoutException;
import java.util.HashMap;

import javax.naming.spi.DirStateFactory.Result;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class TwoSum {
    
    public static void main(String[] args)
    {
        int nums[] = {2,7,11,15};
        int target = 9;
        int[] result = TwoSum(nums,target);


        System.out.println(result);
    }



    public static int[] TwoSum(int[] nums , int target)
    {

        int[] result = new int[2];

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i  < nums.length ; i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                result[1] = i;
                result[0] = map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        

        }
        return result;        
    }
}
