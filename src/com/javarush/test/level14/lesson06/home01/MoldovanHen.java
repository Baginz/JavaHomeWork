package com.javarush.test.level14.lesson06.home01;

public class MoldovanHen extends Hen implements Country
{
    String Country = MOLDOVA;
    @Override
    int getCountOfEggsPerMonth()
    {
        return 2;
    }
    @Override
    String getDescription(){
        return super.getDescription()+" Моя страна - " + Country + ". Я несу " +  getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
