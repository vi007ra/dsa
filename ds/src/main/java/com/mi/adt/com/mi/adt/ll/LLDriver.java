package com.mi.adt.com.mi.adt.ll;

/**
 * Created by vijayrathi on 27/01/18.
 */
public class LLDriver
{
    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(13);
        linkedList.insert(70);
        linkedList.insert(50);

        linkedList.insertAtFirst(20);
        linkedList.insertAtLocation(2, 55);

        linkedList.show();
    }
}
