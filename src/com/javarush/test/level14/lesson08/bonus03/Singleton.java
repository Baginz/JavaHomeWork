package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Админ on 26.12.2016.
 */
public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance==null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {
    }
}
