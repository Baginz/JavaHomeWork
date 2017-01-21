package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
   // static int max ,min ,mid ;
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        String s1 = reader.readLine();
        int b = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int c = Integer.parseInt(s2);

        int max = 0,min = 0,mid = 0 ;
        if ((a > b) && (a > c))
        {
            max = a;
            if (b > c)
            {
                mid = b;
                min = c;
            }
            else
            {
                mid = c;
                min = b;
            }
        }

        if ((b > c) && (b > a))
        {
            max = b;
            if (a > c)
            {
                mid = a;
                min = c;
            }
            else
            {
                mid = c;
                min = a;
            }
        }
        if ((c > b) && (c > a))
        {
            max = c;
            if (b > a)
            {
                mid = b;
                min = a;
            }
            else
            {
                mid = a;
                min = b;
            }
        }
        System.out.println(max+" "+mid+" "+min);
    }
}
