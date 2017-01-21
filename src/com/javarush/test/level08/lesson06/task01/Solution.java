package com.javarush.test.level08.lesson06.task01;

import java.util.*;

/* Создать два списка LinkedList и ArrayList
Нужно создать два списка – LinkedList и ArrayList.
*/

public class Solution
{

    public static Object createArrayList()
    {
        List<Object> map = new ArrayList<Object>();
        return map;
    }

    public static Object createLinkedList()
    {
        List<Object> map1 = new LinkedList<Object>();
        return map1;
    }
    public static void main(String[] args)
    {
        createArrayList();
        createLinkedList();
    }
}
