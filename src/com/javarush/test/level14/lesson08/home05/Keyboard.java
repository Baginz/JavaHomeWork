package com.javarush.test.level14.lesson08.home05;

public class Keyboard implements CompItem
{
    @Override
    public String getName()
    {
        return this.getClass().getSimpleName();  //To change body of implemented methods use File | Settings | File Templates.
    }
}