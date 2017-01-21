package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static String getPartOfString(String string) throws Exception {

        if (string == null)
            throw new TooShortStringException();
        int firstT = string.indexOf("\t");
        if (firstT == -1)
            throw new TooShortStringException();
        int lastT = string.indexOf("\t", firstT + 1);
        if (lastT == -1)
            throw new TooShortStringException();
        string.substring(firstT, lastT);
        return string.substring(firstT+1, lastT);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getPartOfString("tab0\ttab\ttab1\t"));       //tab
        System.out.println(getPartOfString("\t\t"));                    //
        System.out.println(getPartOfString("123\t123"));                //Exception
        System.out.println(getPartOfString(null));                      //Exception
    }
}
