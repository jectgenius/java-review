package com.sjr.exercise.practice;

public class Ch3_1_DoWhileTest {
    public static void main(String[] args) {
        // 변수 및 상수 선언
        int sum = 0, i = 0;

        // 로직
        // 1. 반복하여 짝수만 더함
        do {
            sum += i;
            i += 2;
        } while(i < 100);

        // 2. 결과 출력
        System.out.println(sum);
    }
}
