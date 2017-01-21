package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1, name2;
        name1 = reader.readLine();
        name2 = reader.readLine();
        reader.close();
        FileReader freader = new FileReader(name1);
        FileWriter fwriter = new FileWriter(name2);
        int count = 0;
        while (freader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            count++;
            int data = freader.read(); //читаем один символ (char будет расширен до int)
            if(count % 2 == 0)
                fwriter.write(data); //пишем один символ (int будет обрезан/сужен до char)

        }
        //закрываем потоки после использования
        freader.close();
        fwriter.close();
    }
}
