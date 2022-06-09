package com.ironhack.practice_1.Classes;

public class StringHelper {

    public static String reverse(String originalString){
        char[] arrayChar = originalString.toCharArray();
        String stringReverse = "";
        for(int i = arrayChar.length-1; i >= 0; i--){
            stringReverse+=arrayChar[i];
        }
        return stringReverse;
    }

    public static String encoder(String originalString){
        char[] arrayChar = originalString.toCharArray();
        String stringEncoder = "";
        for(int i = 0; i < arrayChar.length; i++){
            switch (arrayChar[i]){
                case 'a':
                    arrayChar[i] = '1';
                    break;
                case 'e':
                    arrayChar[i] = '2';
                    break;
                case 'i':
                    arrayChar[i] = '3';
                    break;
                case 'o':
                    arrayChar[i] = '4';
                    break;
                case 'u':
                    arrayChar[i] = '5';
                    break;
            }
            stringEncoder+=arrayChar[i];
        }
        return stringEncoder;
    }

}
