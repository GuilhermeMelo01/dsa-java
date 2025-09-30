package io.github.guilhermemelo01.math;

public class TakeCarryFromSum {
    public static void main(String[] args) {
        int sum = 13; // You can change this value to test other sums
        int carry = 0;

        if (sum >= 10) {
            carry = sum / 10;  // This extracts the tens place as the carry
            sum = sum % 10;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Carry: " + carry);
    }
}
