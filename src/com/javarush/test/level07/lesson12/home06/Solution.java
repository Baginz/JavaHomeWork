package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human granddad = new Human("grabdad", true, 80, null, null );
        Human granddad1 = new Human("grabdad1", true, 80, null, null );
        Human grandmom = new Human("grabmom", false, 80, null, null );
        Human grandmom1 = new Human("grabmom1", false, 80, null, null );
        Human dad = new Human("dad", true, 40, granddad, grandmom );
        Human mom = new Human("mom", false, 40, granddad1, grandmom1 );
        Human son1 = new Human("son Lesha", true, 15, dad, mom );
        Human son2 = new Human("son Misha", true, 10, dad, mom );
        Human daughter = new Human("daughter Masha", false, 5, dad, mom );
        System.out.println(granddad.toString());
        System.out.println(granddad1.toString());
        System.out.println(grandmom.toString());
        System.out.println( grandmom1.toString());
        System.out.println(dad.toString());
        System.out.println(mom.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
