package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    static int a=1;
    public static void main(String[] args) throws Exception
    {

        for (int i=0;i<10;i++){
            for (int t=0;t<Solution.a;t++){
                System.out.print(8);
            }
            Solution.a++;
            System.out.println();
        }
    }
}
