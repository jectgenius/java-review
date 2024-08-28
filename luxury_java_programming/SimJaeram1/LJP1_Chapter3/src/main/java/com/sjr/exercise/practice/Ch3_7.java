package com.sjr.exercise.practice;

import java.util.Scanner;

public class Ch3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 변수 및 상수 선언
        int[] numbers = new int[10];
        int sum = 0;
        double average;


        // 로직
        // 1. 1 ~ 10 범위 정수 10개 랜덤 저장 및 배열 출력
        System.out.print("랜덤한 정수들 : ");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10 + 1);
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }
        System.out.println();
        // 2. 평균 계산
        average = (double) sum / numbers.length;
        // 3. 결과 출력
        System.out.println("평균은 " + average);


        scanner.close();
    }
}
