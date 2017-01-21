package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> cats = new HashMap<String, Cat>();
        Cat cat = new Cat("Dfcmrf");
        cats.put(cat.name, cat);
        Cat cat1 = new Cat("Dfcmr");
        cats.put(cat1.name, cat1);
        Cat cat2 = new Cat("Dfcm");
        cats.put(cat2.name, cat2);
        Cat cat3 = new Cat("Dfc");
        cats.put(cat3.name, cat3);
        Cat cat4 = new Cat("Df");
        cats.put(cat4.name, cat4);
        Cat cat5 = new Cat("D");
        cats.put(cat5.name, cat5);
        Cat cat6 = new Cat("Dfcmurf");
        cats.put(cat6.name, cat6);
        Cat cat7 = new Cat("Dfcmorf");
        cats.put(cat7.name, cat7);
        Cat cat8 = new Cat("Dfpcmrf");
        cats.put(cat8.name, cat8);
        Cat cat9 = new Cat("Dfcmlrf");
        cats.put(cat9.name, cat9);
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> setCat = new HashSet<Cat>();
        for(Cat value : map.values()){
            setCat.add(value);
        }
        return setCat;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
