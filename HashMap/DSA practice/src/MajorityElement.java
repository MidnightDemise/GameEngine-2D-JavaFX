import java.util.HashMap;
import java.util.Map;


//Efficient Time complexity
public class MajorityElement {
    public static void main(String[] args) throws Exception {
        int nums[] = {2,14,5,2,31,4,2,6,4};
        majorityElement(nums);
        
    }


    public static void majorityElement(int nums[])
    {
        HashMap <Integer , Integer> map = new HashMap<>();

        int n = nums.length;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i] + 1));

            }
            else
            {
                map.put(nums[i], 1);
            }
        }


        for(int key : map.keySet())
        {
            if(map.get(key) > n/3)
            {
                System.out.println(key);
            }
        }
    }
}

