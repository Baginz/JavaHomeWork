package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        String s1 = reader.readLine();
        int b = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int c = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int d = Integer.parseInt(s3);

        if ((a > b) && (a > c)  && (a>d))
            System.out.println(a);
        else if ((b>c) && (b>d))
        {
            System.out.println(b);
        }
        else if (c>d)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println(d);
        }
    }
}
