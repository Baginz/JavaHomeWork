package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Solution
{
    public static void main(String[] args)
    {
        Man max = new Man("vftrc","jyjeyjyj",20);
        Man max1 = new Man("vftrc","jyjeyjyj",20);
        Woman maxim = new Woman("vfnrc","ejyjyjyj",20);
        Woman maxim1 = new Woman("vfnrc","ejyjyjyj",20);
        System.out.println(max.name+" "+max.age+" "+max.address);
        System.out.println(max1.name+" "+max1.age+" "+max1.address);
        System.out.println(maxim.name+" "+maxim.age+" "+maxim.address);
        System.out.println(maxim1.name+" "+maxim1.age+" "+maxim1.address);
    }

    public static class Man{
        String name, address;
        int age;
        public Man(String name, String adress, int age){
        this.name=name;
            this.address = adress;
            this.age = age;
        }
        public Man(String name, String adress){
            this.name=name;
            this.address = adress;
        }
        public Man(String name){
            this.name=name;
        }
    }
    public static class Woman{
        String name, address;
        int age;
        public Woman(String name, String adress, int age){
            this.name=name;
            this.address = adress;
            this.age = age;
        }
        public Woman(String name, String adress){
            this.name=name;
            this.address = adress;
        }
        public Woman(String name){
            this.name=name;
        }
    }
}
