package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть все потоки ввода-вывода
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*1)Collections.sort не подходит для сортировки строк в данном случае. Пример: C:\tmp\toJoin.txt.part15 , C:\tmp\toJoin.txt.part2 , C:\tmp\toJoin.txt.part1 , но решение проходит :)
Надо писать отдельную функцию
2)Парсить имя файла надо более умно: положим что файл имеет более двух точек: toJoin.new.txt.part3
Но забей)
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        List <String> files= new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = "";
        String simlpeFileName = "";
        String simlpeFileExt = "";
        while(true){
            file = reader.readLine();
            if(!file.equals("end")) {
                files.add(file);
            }
            else{
                break;
            }
        }
        Collections.sort(files);
        String[] nameFile = files.get(0).split("\\.");
        simlpeFileName = nameFile[0];
        simlpeFileExt = nameFile[1];
        FileOutputStream out = new FileOutputStream(simlpeFileName + "." + simlpeFileExt);
        for (String s:files) {
            FileInputStream in = new FileInputStream(new File(s));
            if (in.available() > 0) {

                byte[] buffer = new byte[in.available()];
                int count = in.read(buffer);
                out.write(buffer, 0, count);
            }
            in.close();
        }
        out.close();
        reader.close();

    }
}