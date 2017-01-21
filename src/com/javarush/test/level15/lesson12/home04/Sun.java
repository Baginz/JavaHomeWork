package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Админ on 27.12.2016.
 */
public class Sun implements Planet
{
    private static Sun instance;

    private Sun(){}

    public static synchronized Sun getInstance(){
        if(instance == null){
            instance = new Sun();
        }
        return instance;
    }

}
