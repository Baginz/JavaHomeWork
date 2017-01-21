package com.javarush.test.level14.lesson06.home01;


public class BelarusianHen extends Hen implements Country
{
    String Country = BELARUS;
    @Override
    int getCountOfEggsPerMonth()
    {
        return 1;
    }
    @Override
    String getDescription(){
        return super.getDescription()+" Моя страна - " + Country + ". Я несу " +  getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
