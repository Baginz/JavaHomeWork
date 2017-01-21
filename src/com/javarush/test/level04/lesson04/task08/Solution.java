package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a1 = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int a2 = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int a3 = Integer.parseInt(s3);

        if (a1>=a2+a3)
            System.out.println("Треугольник не существует.");
        else if (a2>=a1+a3)
            System.out.println("Треугольник не существует.");
        else if (a3>=a1+a2)
            System.out.println("Треугольник не существует.");
        else
        System.out.println("Треугольник существует.");

    }
}