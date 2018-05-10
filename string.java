package com.lc.lyuye;

public class string{
    public static void main (){
        String s = "Hello World";
//        System.out.println(reversal(s));
    }

    public static String reversal (String s){
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--){
            str += s.charAt(i);
        }
        return str;
    }

}