package com.sjr.exercise.practice;              // 패키지 선언문

public class Ch3_1_ForTest {                    // Ch3_1_ForTest 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        // 변수 및 상수 선언
        int sum = 0;                            // int형 변수 sum 선언 동시에 0 대입하여 초기화, 즉 총합

        // 로직
        // 1. 반복하여 짝수만 더함
        for(int i = 0; i < 100; i+=2) {         // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 100보다 작거나 같을 동안 반복, i에 +2 합함
            sum += i;                           // 변수 sum에 +i 합함
        }

        // 2. 결과 출력
        System.out.println(sum);                // System.out.println() 메소드 호출하여 sum 출력, 즉 0부터 100미만 짝수의 총합 연산 결과 출력
    }                                           // main() 메소드 정의 끝
}                                               // Ch3_1_ForTest 클래스 정의 끝
