package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        int min = Integer.MAX_VALUE;
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
            if(min>i)min=i;
        }
        for(int i = 0;i<255;i++)
        {
            if(bytes[i]==min)System.out.println(i);
        }
        reader.close();
        inputStream.close();
    }
}
