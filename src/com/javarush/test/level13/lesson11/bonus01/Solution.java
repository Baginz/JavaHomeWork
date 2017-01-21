package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String outputFile = reader.readLine();
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(outputFile)));
        List<Integer> list = new ArrayList<Integer>();

        while (reader.ready())
        {
            int num = Integer.parseInt(reader.readLine());
            if (num % 2 == 0)
            {
                list.add(num);
            }
        }
        reader.close();
        sort(list);
        for (int x : list)
        {
            System.out.println(x);
        }
    }

    /*public static void sort(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++){
            int min = list.get(i);
            int imin = i;
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(j) < min){
                    min = list.get(j);
                    imin = j;
                }
            }
            if (i != imin){
                int tmp = list.get(i);
                list.set(i, list.get(imin));
                list.set(imin, list.get(i));
            }
        }
    }*/
    public static void sort( List<Integer> numbers )
    {
        for ( int i = 0; i < numbers.size() - 1; i++ )
        {
            for ( int j = 0; j < numbers.size() - i - 1; j++ )
            {
                if ( numbers.get( j ) > numbers.get( j + 1 ) )
                {
                    int tmp = numbers.get( j );
                    numbers.set( j, numbers.get( j + 1 ) );
                    numbers.set( j + 1, tmp );
                }
            }
        }
    }
    ///////////////////////

}