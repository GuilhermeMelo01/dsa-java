package io.github.guilhermemelo01;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int value = in.nextInt();

        if(value % 2 == 0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}