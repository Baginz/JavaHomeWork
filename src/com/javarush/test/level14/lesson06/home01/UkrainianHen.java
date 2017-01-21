package com.javarush.test.level14.lesson06.home01;


public class UkrainianHen extends Hen implements Country
{
    String Country = UKRAINE;
    @Override
    int getCountOfEggsPerMonth()
    {
        return 3;
    }
    @Override
    String getDescription(){
        return super.getDescription()+" Моя страна - " + Country + ". Я несу " +  getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
