package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    String name;
    String sex;
    int age;
    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name, String sex)
    {
        this.name = name;
        this.sex= sex;

    }
    public void initialize(String name, String sex, int age)
    {
        this.name = name;
        this.sex= sex;
        this.age=age;
    }
}
