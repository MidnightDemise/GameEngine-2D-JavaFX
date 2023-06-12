import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    
    public static void main(String[] args)
    {
        String first = "anagram";
        char[] s = first.toCharArray();
        String second = "nagaram";
        char[] t = second.toCharArray();
        boolean ans = IsValidAnagram(s, t);


        System.out.println(ans);

    }

    public static boolean IsValidAnagram(char[] s , char[] t)
    {
        Arrays.sort(s);
        Arrays.sort(t);

        return Arrays.equals(s, t);


        
    }
}
