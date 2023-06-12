import java.util.HashSet;

public class IntersectionOfTwoArrays {
    

    public static void main(String[] args)
    {
       int arr1[] = {1,2,3,4,6,5,4}; // 1 2 3 4 5 6 
       int arr2[] = {1,4,5,16,62,3};   // 1 3 4 5  =4  common
       intersection(arr1,arr2);
    }


    public static void intersection(int arr1[] , int arr2[])
    {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i = 0 ; i < arr1.length ; i++)
        {
            set.add(arr1[i]);
        }

        for(int i = 0 ; i< arr2.length ; i++)
        {
            if(set.contains(arr2[i]))
            {
                count+=1;
            }
        }


        System.out.println(count);
    }
}
