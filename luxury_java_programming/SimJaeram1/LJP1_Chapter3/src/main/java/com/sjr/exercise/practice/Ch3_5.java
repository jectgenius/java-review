package com.sjr.exercise.practice;

import java.util.Scanner;

public class Ch3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 변수 및 상수 선언
        int[] positiveNumber = new int[10];

        // 로직
        // 1. 양의 정수 10개 입력 및 배열에 저장
        System.out.print("양의 정수 10개를 입력하시오>>");
        for(int i = 0; i < positiveNumber.length; i++) {
            positiveNumber[i] = scanner.nextInt();
        }
        // 2. 3의 배수 출력
        System.out.print("3의 배수는 ");
        for(int i = 0; i < positiveNumber.length; i++) {
            if(positiveNumber[i] % 3 == 0) {
                System.out.print(positiveNumber[i] + " ");
            }
            else {
                continue;
            }
        }

        scanner.close();
    }
}
