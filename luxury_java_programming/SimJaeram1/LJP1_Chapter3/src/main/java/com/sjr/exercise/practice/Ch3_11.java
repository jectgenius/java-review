package com.sjr.exercise.practice;

public class Ch3_11 {
    public static void main(String[] args) {
        // 선언
        int sum = 0;                                // 총합
        double average;                             // 평균

        // 로직
        // 1. 명령행 인자에 값 전달
        // 2. 총합 연산
        for(int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        // 3. 평균 연산
        average = (double) sum / args.length;
        // 4. 결과 출력
        System.out.println(average);
    }
}
