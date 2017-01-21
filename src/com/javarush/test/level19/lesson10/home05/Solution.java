package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)throws Exception {
        ArrayList<String> strList = new ArrayList<>();
        BufferedReader inf = new BufferedReader( new FileReader(args[0]));
        BufferedWriter outf = new BufferedWriter( new FileWriter(args[1]));
        String s;
        while ((s = inf.readLine()) != null)
            strList.add(s);
        inf.close();
        for(String astrList : strList)
        {
            int count = 0;
            String[] wordsarr = astrList.split(" ");
            for(String word : wordsarr){
                if (word.matches(".+[0-9].+")){
                    outf.write(word + " ");
                }
            }

        }
        outf.close();
    }
}
