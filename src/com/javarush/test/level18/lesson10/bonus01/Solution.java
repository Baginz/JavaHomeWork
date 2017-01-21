package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    /* я пытался(
    public static void main(String[] args) throws Exception{
        ArrayList<String> fstrings = new ArrayList<>();
        if (args[0].equals("-e"))
        {
            BufferedReader reader = new BufferedReader(new FileReader(args[1]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[2]));
            String s = null;
            while ((s=reader.readLine())!= null )
            {
                fstrings.add(s);
            }
            fstrings = shifr(fstrings);
            for(String str : fstrings){
                writer.write(str);
                writer.newLine();
            }
            reader.close();
            writer.close();
            fstrings.clear();

        } else if (args[0].equals("-d"))
        {
            BufferedReader reader = new BufferedReader(new FileReader(args[1]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[2]));
            String s = null;
            while ((s=reader.readLine())!= null )
            {
                fstrings.add(s);
            }
            fstrings=unshifr(fstrings);
            for(String str : fstrings){
                writer.write(str);
                writer.newLine();
            }
            reader.close();
            writer.close();
            fstrings.clear();
        }
    }
    public static ArrayList<String> shifr(ArrayList<String> arr){
        for(String s : arr){
            s.replace(" ","_");
            s.replace("1","0");
            s.replace("a","b");
        }
        return arr;
    }
    public static ArrayList<String> unshifr(ArrayList<String> arr){
        for(String s : arr){
            s.replace("_"," ");
            s.replace("0","1");
            s.replace("b","a");
        }
        return arr;
    }
 */
    private static byte key = 10;
    public static void main(String[] args) throws IOException {
        if(args.length < 3) return;

        FileInputStream in = new FileInputStream(args[1]);
        FileOutputStream out = new FileOutputStream(args[2]);

        while (in.available() > 0){
            byte[] data = new byte[in.available()];
            in.read(data);
            System.out.println(Arrays.toString(crypt(data)));
            out.write(crypt(data));
        }

        in.close();
        out.close();

    }

    private static byte[] crypt(byte[] data){
        byte[] res = new byte[data.length];

        for(int i = 0; i < data.length; i++){
            res[i] = (byte)(data[i] ^ key);
            //^ это хор false ^ false == false
            // true ^ false == true
            // false ^ true == true
            // true ^ true == false
        }

        return res;
    }

}
