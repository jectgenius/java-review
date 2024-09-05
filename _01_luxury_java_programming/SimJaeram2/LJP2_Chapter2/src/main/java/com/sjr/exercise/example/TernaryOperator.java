package com.sjr.exercise.example;                                    // 패키지 선언문

public class TernaryOperator {                                       // TernaryOperator 클래스 정의 시작
    public static void main(String[] args) {                         // main() 메소드 정의 시작
        // 변수 선언
        int a = 3, b = 5;                                            // int형 변수 a 선언 동시에 3 대입하여 초기화, b 선언 동시에 5 대입하여 초기화

        // 연산 결과 출력
        System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));     // System.out.println() 메소드 호출하여 문자열 "두 수의 차는 " + ((a>b)?(a-b):(b-a)) 출력, 두 수의 차는 5-3 == 2
    }                                                                // main() 메소드 정의 끝
}                                                                    // TernaryOperator 클래스 정의 끝