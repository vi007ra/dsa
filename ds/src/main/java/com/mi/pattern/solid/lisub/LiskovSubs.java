package com.mi.pattern.solid.lisub;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Created by vijayrathi on 13/01/18.
 */
public class LiskovSubs
{
    public static void removeAll(Collection<String> stringCollection, String item)
    {
        while (stringCollection.contains(item))
        {
            stringCollection.remove(item);
        }
    }

    public static String getLast(Collection<String> stringCollection)
    {
        List<String> stringsList = (List<String>) stringCollection;
        return stringsList.get(stringsList.size() - 1);
    }

    @Test
    public void testWithArray()
    {
        final String item = "Apple";
        Set<String> stringCollection = new HashSet<String>();
        stringCollection.add(item);
        stringCollection.add(item);


        LiskovSubs.removeAll(stringCollection, item);
        Assert.assertFalse(stringCollection.contains(item));
    }


    @Test
    public void testWithAbstractList()
    {
        final String item = "Apple";
        String[] arrayItem = new String[2];
        arrayItem[0] = item;
        arrayItem[1] = item;

        List<String> stringCollection = Arrays.asList(arrayItem);
        LiskovSubs.removeAll(stringCollection, item);
        Assert.assertFalse(stringCollection.contains(item));
    }

    @Test
    public void testWithDownCasting()
    {
        final String item = "Apple";
        List<String> stringCollection = new ArrayList<String>();
        stringCollection.add(item);

        String s = LiskovSubs.getLast(stringCollection);
        Assert.assertTrue(s.equalsIgnoreCase(item));
    }
}
