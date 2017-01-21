package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandDName = reader.readLine();
        Cat catgrandD = new Cat(grandDName);

        String grandMName = reader.readLine();
        Cat catgrandM = new Cat(grandMName);

        String dadName = reader.readLine();
        Cat catDad = new Cat(dadName,catgrandD,null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,null,catgrandM);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catDad, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catDad, catMother);

        System.out.println(catgrandD);
        System.out.println(catgrandM);
        System.out.println(catDad);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parent;
        private Cat dad;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat dad)
        {
            this.name = name;
            this.dad = dad;
        }

        Cat(String name, Cat dad, Cat parent)
        {
            this.name = name;
            this.dad = dad;
            this.parent=parent;
        }

        @Override
        public String toString()
        {
            return "Cat name is " + name +
                    ((parent != null) ? ", mother is " + parent.name : ", no mother") +
                    ((dad != null) ? ", father is " + dad.name : ", no father");

        }
    }

}
