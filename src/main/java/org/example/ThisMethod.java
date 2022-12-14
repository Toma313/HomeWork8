package org.example;

import java.util.*;

public class ThisMethod {
    private static String str;

    public static void myMethod(String str) {
        ArrayList<String> worlds = new ArrayList<>(List.of(str.replace(".","").replaceAll(" ","").split(",")));

        Set<String> set = new HashSet<>(worlds);
        System.out.println(set);

        for (String s : set) {
            System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));


        }
    }

}
