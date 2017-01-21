package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new FileReader(sc.nextLine()));
        BufferedWriter out = new BufferedWriter(new FileWriter(sc.nextLine()));
        sc.close();
        while(in.ready()){
            String str = in.readLine();
            str = str.replaceAll("\\.", "!");
            out.write(str);
            out.newLine();
        }

        in.close();
        out.close();
    }
}
