package com.javarush.test.level08.lesson08.task01;

import java.awt.*;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<String>();
        Collections.addAll(set,"ЛФ","ЛЫ","ЛВ","ЛА","ЛП","ЛР","ЛО","ЛЛ","ЛД","ЛЖ","ЛЭ","ЛЯ","ЛЧ","ЛС","ЛМ","ЛИ","ЛТ","ЛЬ","ЛБ","ЛЮ");
        return set;
    }
}
