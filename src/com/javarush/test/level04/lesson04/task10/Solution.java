package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a1 = Integer.parseInt(s);
        String s1 = reader.readLine();
        int a2 = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int a3 = Integer.parseInt(s2);
        if(a1==a2&a1==a3&a2==a3)
            System.out.println(a1+" "+a2+" "+a3);
        else if(a1==a3)
            System.out.println(a1+" "+a3);
            else if(a1==a2)
            System.out.println(a1+" "+a2);
            else if(a2==a3)
            System.out.println(a2+" "+a3);

    }
}