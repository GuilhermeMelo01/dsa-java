package io.github.guilhermemelo01;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();
        while(tests >= 0){
            String value = in.nextLine();
            String response = value;

            int size = value.length();
            if(size > 10){
                response = value.charAt(0) +""+ (size - 2) +""+ value.charAt(size - 1);
            }

            System.out.println(response);
            tests--;
        }
    }
}