package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution
{
    private static final String ENCODING_WIN1251 = "windows-1251";
    private static final String ENCODING_UTF8 = "UTF-8";
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine()),ENCODING_WIN1251));
        //InputStream inStream = new FileInputStream(reader.readLine());

        /*while (inStream.available() > 0){
            System.out.print((char)inStream.read());

        }*/
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
        reader.close();
    }
}
