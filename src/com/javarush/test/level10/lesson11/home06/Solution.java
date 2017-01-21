package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String lastname;
        String firstname;
        String home;
        int age;
        int lol;
        boolean sex;
        Human(String lastname){
            this.lastname=lastname;
        }
        Human(String lastname, String firstname){
            this.lastname=lastname;
            this.firstname=firstname;
        }
        Human(String lastname, String firstname, String home){
            this.lastname=lastname;
            this.firstname=firstname;
            this.home=home;
        }
        Human(String lastname, String firstname, String home, int age){
            this.lastname=lastname;
            this.firstname=firstname;
            this.home=home;
            this.age=age;
        }
        Human(String lastname, String firstname, String home, int age, int lol){
            this.lastname=lastname;
            this.firstname=firstname;
            this.home=home;
            this.age=age;
            this.lol=lol;
        }
        Human(String lastname, String firstname, String home, int age, int lol, boolean sex){
            this.lastname=lastname;
            this.firstname=firstname;
            this.home=home;
            this.age=age;
            this.lol=lol;
            this.sex=sex;
        }
        Human(String lastname, int age){
            this.lastname=lastname;
            this.age=age;
        }
        Human(String lastname, boolean sex){
            this.lastname=lastname;
            this.sex=sex;
        }
        Human(String lastname, int lol, boolean sex){
            this.lastname=lastname;
            this.lol=lol;
            this.sex=sex;
        }
        Human(String lastname, boolean sex, int lol){
            this.lastname=lastname;
            this.lol=lol;
            this.sex=sex;
        }
    }
}
