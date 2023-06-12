import java.util.HashMap;

public class ItenaryOfTickets {

    
    public static void main(String[] args)
    {
        HashMap <String, String> tick = new HashMap<>();
        tick.put("Chennai","Banluru");
        tick.put("Mumbai","Delhi");
        tick.put("Goa","Chennai");
        tick.put("Delhi","Goa");


        String start = getStart(tick);

        while(tick.containsKey(start))
        {
            System.out.println(start);
            start = tick.get(start);
        }
        System.out.println(start);


    }


    public static String getStart(HashMap<String , String> tick)
    {
        HashMap<String , String > revMap = new HashMap<>();

        for(String key : tick.keySet())
        {
            revMap.put(tick.get(key) , key);
        }

        for(String key : tick.keySet())
        {
            if(!revMap.containsKey(key))
            {
                return key;

            }
        }

        return null;

        
    }

}
