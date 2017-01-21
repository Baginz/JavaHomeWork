package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        //BufferedReader reader = new "E:\\1.txt"
        FileInputStream in = new FileInputStream(new File(args[0]));  //
        char[] m = new char[26];
        for (int i=0; i< 26; i++) {
            m[i] = (char)('a' + i);
        }
        int count = 0;
        int word;
        while(in.available() > 0)
        {
            word = in.read();
            for(char h : m) {
            if(word == h)
                count ++;
            }
        }
        in.close();
        System.out.println(count);
    }
}
