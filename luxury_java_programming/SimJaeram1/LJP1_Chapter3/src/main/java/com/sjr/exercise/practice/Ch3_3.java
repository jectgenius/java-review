package com.sjr.exercise.practice;              // 패키지 선언문

import java.util.Scanner;

public class Ch3_3 {                            // Ch3_3 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);

        // 변수
        int number;

        // 로직
        // 1. 줄 개수 입력
        System.out.print("정수를 입력하시오>>");
        number = scanner.nextInt();
        // 2. 별 출력
        for(int i = number; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }                                           // main() 메소드 정의 끝
}                                               // Ch3_3 클래스 정의 끝
