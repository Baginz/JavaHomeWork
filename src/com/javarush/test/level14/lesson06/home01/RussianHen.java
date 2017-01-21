package com.javarush.test.level14.lesson06.home01;


public class RussianHen extends Hen implements Country
{
    String Country = RUSSIA;
    @Override
    int getCountOfEggsPerMonth()
    {
        return 4;
    }
    @Override
    String getDescription(){
        return super.getDescription()+" Моя страна - " + Country + ". Я несу " +  getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
