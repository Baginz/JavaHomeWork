package com.javarush.test.level05.lesson05.task03;

/* Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
*/

public class Dog {
    String name;
    int age;
    public String getName(){
        return name;
    }
    public void setName(String a){
        this.name=a;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        this.age=a;
    }


    //добавьте тут геттеры и сеттеры
}
