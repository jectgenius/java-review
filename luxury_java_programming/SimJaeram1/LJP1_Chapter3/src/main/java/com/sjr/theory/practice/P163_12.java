package com.sjr.theory.practice;

public class P163_12 {
    public static void main(String[] args) {
        // 2차원 비정방형 배열

        // 방법 1
        double[][] array = new double[4][];
        array[0] = new double[4];
        array[1] = new double[2];
        array[2] = new double[3];
        array[3] = new double[1];

        array[0][0] = 1.1;
        array[0][1] = 1.2;
        array[0][2] = 1.2;
        array[0][3] = 1.4;

        array[1][0] = 2.1;
        array[1][1] = 2.2;

        array[2][0] = 3.1;
        array[2][1] = 3.2;
        array[2][2] = 1.2;

        array[3][0] = 4.1;

        // 방법 2
        double[][] array2 = new double[][]{
                {1.1, 1.2, 1.2, 1.4},
                {2.1, 2.2},
                {3.1, 3.2, 1.2},
                {4.1}
        };

        // ==
        double[][] array3 = {
                {1.1, 1.2, 1.2, 1.4},
                {2.1, 2.2},
                {3.1, 3.2, 1.2},
                {4.1}
        };

    }
}
