package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        int[] bytes = new int[255];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        byte b;
        while (true) {                   // Создаем массив счетчиков для каждого элемента,
            b = (byte)inputStream.read();//где индексом будет сам элемент, а значением будет количество вхождений элемента.
            if(b == -1) break;
            bytes[b]++;
        }
        for(int i = 0;i<255;i++)
        {
            if(bytes[i]!=0)System.out.println(i);
        }
        reader.close();
        inputStream.close();
    }
}
