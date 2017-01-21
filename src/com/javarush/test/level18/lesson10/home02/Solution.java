package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.File;
import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        //BufferedReader reader = new "E:\\1.txt"
        FileInputStream in = new FileInputStream(new File(args[0]));  //
        int count = 0, countp = 0;
        int word;
        double res;
        while(in.available() > 0)
        {
            count++;
            word = in.read();
                if(word == ' ') countp ++;
        }
        in.close();
        res = (double)countp/count*100;
        System.out.printf("%.2f", res);
    }
}
