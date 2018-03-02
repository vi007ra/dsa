package com.mi.adt;

/**
 * Created by vijayrathi on 27/01/18.
 */
public class LinkedList
{
    Node head;

    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null)
        {
            head = node;
        } else
        {
            Node n = head;
            while (n.next != null)
            {
                n = n.next;
            }

            n.next = node;
        }
    }

    public void show()
    {
        Node n = head;
        while (n.next != null)
        {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public void insertAtFirst(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAtLocation(int index, int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;
        for (int i = 0; i < (index - 1); i++)
        {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;


    }

}
