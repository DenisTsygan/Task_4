package com.company;

public class CorectName {
    public static String CorectName(String str){
        str = str.strip();
        if (Character.isUpperCase(str.charAt(0))) {
            return str;
        } else {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1, str.length());
        }
    }

}
