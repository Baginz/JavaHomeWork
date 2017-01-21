package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(rd.readLine());
        int b = Integer.parseInt(rd.readLine());
        int c = Integer.parseInt(rd.readLine());

        if(a>b&a>c&c>b)System.out.println(c);
        if(c>b&c>a&b>a)System.out.println(b);
        if(b>c&b>a&a>c)System.out.println(a);
    }
}
