package org.example;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThisMethod {
    private static String str;

    public static void myMethod(String str) {
        String[] massive = str.split(", .");
        Arrays newArray = Arrays.stream(massive).toArray();
        ArrayList<Integer> integerArrayList = newArray.asList(massive); // вот тут не понятно как сделать уникальными значения??
        for (String s : massive) {
            System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));


        }
    }

}
