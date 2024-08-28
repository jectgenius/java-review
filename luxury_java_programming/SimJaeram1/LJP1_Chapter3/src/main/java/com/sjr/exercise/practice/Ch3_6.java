package com.sjr.exercise.practice;

import java.util.Scanner;

public class Ch3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 변수 및 상수 선언
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int[] count = new int[10];
        int money, remain;

        // 로직
        // 1. 변환할 돈 입력
        System.out.print("금액을 입력하시오>>");
        money = scanner.nextInt();
        remain = money;

        for(int i = 0; i < unit.length; i++) {
            // 2. 단위 환산하여 개수 배열에 저장
            count[i] = remain / unit[i];
            remain = remain % unit[i];

            // 3. 환산 결과 출력
            if(count[i] != 0) {
                System.out.println(unit[i] + "원 짜리 : " + count[i] + "개");
            }
        }

        scanner.close();
    }
}
