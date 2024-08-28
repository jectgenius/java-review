package com.sjr.exercise.practice;

public class Ch3_9 {
    public static void main(String[] args) {
        // 선언
        int[][] numbers = new int[4][4];

        // 로직
        // 1. 난수 발생 및 배열에 저장
        // 2. 배열 출력
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                numbers[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
