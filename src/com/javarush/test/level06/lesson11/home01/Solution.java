package com.javarush.test.level06.lesson11.home01;

/* Класс Cat и статическая переменная catCount
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная
catCount увеличивается на 1. Создать 10 объектов Cat и вывести значение переменной catCount на экран.
*/

public class Solution
{

    public static void main(String[] args)
    {
        Cat t1r= new Cat();
        Cat t2r= new Cat();
        Cat t3r= new Cat();
        Cat t4r= new Cat();
        Cat t5r= new Cat();
        Cat t6r= new Cat();
        Cat t7r= new Cat();
        Cat t8r= new Cat();
        Cat t9r= new Cat();
        Cat t10r= new Cat();
        System.out.println(Cat.catCount);
    }

    public static class Cat
    {
        public static int catCount;

        public Cat(){
            catCount++;
        }
    }

}
