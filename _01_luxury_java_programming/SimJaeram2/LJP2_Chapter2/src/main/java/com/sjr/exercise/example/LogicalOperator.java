package com.sjr.exercise.example;                   // 패키지 선언문

public class LogicalOperator {                      // LogicalOperator 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        // 비교 연산
        System.out.println('a' > 'b');              // System.out.println() 메소드 호출하여 'a' > 'b' 연산 결과 출력, false, 문자 a가 문자 b보다 사전 순으로 뒤에 나오지 않음
        System.out.println(3 >= 2);                 // System.out.println() 메소드 호출하여 3 >= 2 연산 결과 출력, true
        System.out.println(-1 < 0);                 // System.out.println() 메소드 호출하여 'a' > 'b' 연산 결과 출력, true
        System.out.println(3.45 <= 2);              // System.out.println() 메소드 호출하여 'a' > 'b' 연산 결과 출력, false
        System.out.println(3 == 2);                 // System.out.println() 메소드 호출하여 'a' > 'b' 연산 결과 출력, false
        System.out.println(3 != 2);                 // System.out.println() 메소드 호출하여 'a' > 'b' 연산 결과 출력, true
        System.out.println(!(3 != 2));               // System.out.println() 메소드 호출하여 'a' > 'b' 연산 결과 출력, !true == false

        // 비교 연산과 논리 연산 복합
        System.out.println((3 > 2) && (3 > 4));     // System.out.println() 메소드 호출하여 (3 > 2) && (3 > 4) 연산 결과 출력, true && false == false
        System.out.println((3 != 2) || (-1 > 0));   // System.out.println() 메소드 호출하여 (3 != 2) || (-1 > 0) 연산 결과 출력, true || false == true
        System.out.println((3 != 2) ^ (-1 > 0));    // System.out.println() 메소드 호출하여 (3 != 2) ^ (-1 > 0) 연산 결과 출력, true ^ false == true
    }                                               // main() 메소드 정의 끝
}                                                   // LogicalOperator 클래스 정의 끝
