package io.github.guilhermemelo01.mastering_algorithms.greedy_method;

public class FractionalKnapSackProblem {
    public static void main(String[] args) {
        double v = maximumProfit(new int[][]{
                {12, 17, 9, 7, 5, 21, 8},
                {2, 5, 7, 3, 1, 4, 1}
        }, 15);

        System.out.println(v);
    }

    public static double maximumProfit(int[][] matrix, int capacity) {
        double max = 0;
        double[] profits = new double[matrix[0].length];
        boolean[] passedBy = new boolean[profits.length];

        for (int i = 0; i < matrix[0].length; i++) {
            profits[i] = (double) matrix[0][i] / matrix[1][i];
        }

        while (capacity > 0) {
            int lastPosition = 0;
            double maxDivide = 0;
            double profit = 0;
            double weight = 0;

            for (int i = 0; i < profits.length; i++) {
                if (profits[i] > maxDivide && !passedBy[i]) {
                    maxDivide = profits[i];
                    profit = matrix[0][i];
                    weight = matrix[1][i];
                    lastPosition = i;
                }
            }

            if (weight > capacity) {
                profit = (profit * capacity) / weight;
            }

            capacity -= (int) weight;
            max += profit;
            passedBy[lastPosition] = true;
        }

        return max;
    }
}
