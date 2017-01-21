package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int need=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        ArrayList<Integer> numA = new ArrayList<>();
        ArrayList<Integer> numB = new ArrayList<>();
        for(int i = 1;i<a+1;i++){
            if(a % i == 0) numA.add(i);
        }
        for(int i = 1;i<b+1;i++){
            if(b % i == 0) numB.add(i);
        }
        for(int i : numA)
        {
            for (int j : numB)
            {
                if (i == j) need = i;
            }
        }
        System.out.println(need);
        /* Эвклид бы не одобрил мой код
        public static void nod(int a, int b) {
        if (b == 0) return a;

        return nod(b, a % b);
}
         */
    }
}
