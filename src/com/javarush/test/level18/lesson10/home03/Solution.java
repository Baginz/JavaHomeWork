package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        String file1, file2, file3;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        file1 = reader.readLine();
        file2 = reader.readLine();
        file3 = reader.readLine();
        FileInputStream in2 = new FileInputStream(file2);  //
        FileInputStream in3 = new FileInputStream(file3);  //
        FileOutputStream ou = new FileOutputStream(file1);
        //
        while (in2.available() > 0)
        {
            int data = in2.read(); //читаем один int из потока для чтения
            ou.write(data); //записываем прочитанный int в другой поток.
        }
        while (in3.available() > 0)
        {
            int data = in3.read(); //читаем один int из потока для чтения
            ou.write(data); //записываем прочитанный int в другой поток.
        }
        reader.close();
        in2.close();
        in3.close();
        ou.close();

    }
}
