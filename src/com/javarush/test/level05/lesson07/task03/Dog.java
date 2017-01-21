package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name;
    int weight = 5;
    String color;
    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name,int weight)
    {
        this.name = name;
        this.weight = weight;
    }
    public void initialize(String name,int weight, String color)
    {
    this.name = name;
    this.weight = weight;
        this.color=color;
    }


}
