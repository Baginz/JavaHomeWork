package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {

        SpecialThread thread0 = new SpecialThread();
        Thread th0 = new Thread(thread0);
        list.add(th0);
        SpecialThread thread1 = new SpecialThread();
        Thread th1 = new Thread(thread1);
        list.add(th1);
        SpecialThread thread2 = new SpecialThread();
        Thread th2 = new Thread(thread2);
        list.add(th2);
        SpecialThread thread3 = new SpecialThread();
        Thread th3 = new Thread(thread3);
        list.add(th3);
        SpecialThread thread4 = new SpecialThread();
        Thread th4 = new Thread(thread4);
        list.add(th4);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
