import java.util.HashMap;
import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class UnionOfTwoArrays {
    
    public static void main(String[] args)
    {
        int arr1[] = {12,41,4,51,21,5,6,3};
        int arr2[] = {1,2,4,6,12,41,51,25,6,3};
        union(arr1, arr2);


    }


    public static void union(int arr1[] , int arr2[]) // O(N_ TIME COMPLEXITY)
    {
        HashSet <Integer> set = new HashSet<>();

        for(int i = 0 ; i< arr1.length ; i++)
        {
            set.add(arr1[i]);
        }

        for(int i = 0 ; i< arr2.length ; i++)
        {
            set.add(arr2[i]);
        }


    }
}
