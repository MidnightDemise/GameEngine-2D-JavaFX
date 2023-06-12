import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class TopKFrequentElements {
    
    public static void main(String[] args)
    {
        int nums[] = {1,1,1,1,2,2,3,3,4};
        int k = 3;

        int[] ans = TopKFrequentElements(nums, k);

        System.out.println(ans);
        
    }


    public static int[] TopKFrequentElements(int[] nums , int k)
    {
        HashMap<Integer , Integer> map = new HashMap<>();
        int[] temp = new int[nums.length];
        int[] result = new int[k+1];
        int count = 1;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }


        

        for(int i = 0 ; i < nums.length ; i++)
        {
            temp[i] = map.get(nums[i]);
        }

    

        Arrays.sort(temp);
    
        for(int i = 0 ; i < k + 1 ; i++)
        {
            if(map.containsKey(temp[i]))
            {
                result[i] = temp[i];
            }
        }


        return null;
    }
}
