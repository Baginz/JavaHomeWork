package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        int max = Integer.MIN_VALUE;
        int[] bytes = new int[255];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        byte b;
        while (true) {                   // Создаем массив счетчиков для каждого элемента,
            b = (byte)inputStream.read();//где индексом будет сам элемент, а значением будет количество вхождений элемента.
            if(b == -1) break;
            bytes[b]++;
        }
        for(int i : bytes)
        {
            if(max<i)max=i;
        }
        for(int i = 0;i<255;i++)
        {
            if(bytes[i]==max)System.out.println(i);
        }
        reader.close();
        inputStream.close();
    }
}
