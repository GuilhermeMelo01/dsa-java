package io.github.guilhermemelo01.array;

public class StringIsPalidrome {

    public static void main(String[] args) {

        String palidrome = "ALOHAAHOLA";

        Boolean is = isPalidrome(palidrome);
        System.out.println(is);
    }

    public static Boolean isPalidrome(String text){

        for(int i = 0, j = text.length()-1; i < j; i++, j--){
            if (text.charAt(i) != text.charAt(j)){
                return false;
            }
        }

        return true;
    }
}
