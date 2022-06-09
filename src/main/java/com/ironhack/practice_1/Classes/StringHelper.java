package com.ironhack.practice_1.Classes;

public class StringHelper {

    public static String stringHelper(String originalString){
        char[] arrayChar = originalString.toCharArray();
        String stringReverse = "";
        for(int i = arrayChar.length-1; i >= 0; i--){
            stringReverse+=arrayChar[i];
        }
        return stringReverse;
    }

}
