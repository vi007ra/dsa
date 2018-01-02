import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by vi007ra on 11/19/2017.
 */
public class HelloDS
{
    public static void main(String[] args)
    {
        Map<Key, String> cityMap = new HashMap<Key, String>();
        cityMap.put(new Key(1, "NY"), "New York City");
        cityMap.put(new Key(2, "ND"), "New Delhi");
        cityMap.put(new Key(3, "NW"), "Newark");
        cityMap.put(new Key(4, "NP"), "Newport");

        System.out.println("size before iteration " + cityMap.size());
        Iterator<Key> itr = cityMap.keySet().iterator();
        while (itr.hasNext())
        {
            System.out.println(cityMap.get(itr.next()));
        }
        System.out.println("size after iteration " + cityMap.size());
    }

    static class Key
    {
        int index;
        String Name;
        Key(int index, String Name)
        {
            this.index = index;
            this.Name = Name;
        }
    }
}
