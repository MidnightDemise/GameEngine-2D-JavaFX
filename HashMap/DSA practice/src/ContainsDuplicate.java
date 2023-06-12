import java.util.HashMap;
import java.util.LinkedList;

import javax.print.attribute.HashAttributeSet;

public class ContainsDuplicate {
    
    public static void main (String[] args)
    {
        int nums[] = {1,2,3,4,5,1};
        boolean ans = ContainsDuplicate(nums);

        System.out.println(ans);

    }   
    
    

    public static boolean ContainsDuplicate(int[] nums)
    {
        int count = 0;
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(map.containsKey(nums[i]))
            {
                return true;
            }
            map.put(nums[i],0); //value stored K and frequency V so K V pairs for hashmap

        }




        return false;
    }
}
