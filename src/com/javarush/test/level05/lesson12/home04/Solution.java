package com.javarush.test.level05.lesson12.home04;
/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Solution
{
    public static void main(String[] args)
    {
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat df=new SimpleDateFormat("dd MM YYYY");
        String output=df.format(cal.getTime());
        System.out.print(output);
    }
}