import java.util.HashMap;

public class LargestProductExceptSelf {


    public static void main(String[] args)
    {

        int[] nums  = {1,2,3,4};
        int[] result = productExceptSelf(nums);

        System.out.println(result);

    }


    public static int[] productExceptSelf(int[] nums)
    {
        int result[] = new int[nums.length];

        int prefix = 1;
        int postfix = 1;
        for(int i = 0 ; i < nums.length ; i++)
        {
            result[i] = prefix;
            prefix*= nums[i];
        }

        for(int i = nums.length - 1 ; i >= 0 ; i--)
        {
            result[i]*= postfix;
            postfix *= nums[i];

        }



        return result;

        
    }


    //TECHNIQUE OF BREAKING THROUGH PREFIXING AND POSITFIXING DO MAKE NOTES OF THIS PREFIX IS CONSECUTIVE MULTIPLICATION THROUGH INDEX 0 WHILE POSTIFX IS MULTIPLICATION OF elemetns END INDEX
}