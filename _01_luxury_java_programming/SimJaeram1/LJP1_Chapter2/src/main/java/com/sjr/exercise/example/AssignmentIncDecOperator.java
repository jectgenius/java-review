package com.sjr.exercise.example;                                       // 패키지 선언문

public class AssignmentIncDecOperator {                                 // AssignmentIncDecOperator 클래스 정의 시작
    public static void main(String[] args) {                            // main() 메소드 정의 시작
        // 변수
        int a = 3, b = 3, c = 3;                                        // int형 변수 a, b, c 선언 동시에 각각 3 대입하여 초기화

        // 복합 대입 연산자
        a += 3;                                                         // a = a + 3
        b *= 3;                                                         // b = b * 3
        c %= 2;                                                         // c = c % 2
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);   // System.out.println() 메소드 호출하여 a는 6, b는 9, c는 1 출력

        // 증감 연산자
        int d = 3;                                                      // int형 변수 d 선언 동시에 3 대입하여 초기화
        a = d++;                                                        // a에 d 대입 후, d에 +1
        System.out.println("a = " + a + ", d = " + d);                  // System.out.println() 메소드 호출하여 a는 3, d는 4 출력
        a = ++d;                                                        // d에 +1 후, a에 d 대입
        System.out.println("a = " + a + ", d = " + d);                  // System.out.println() 메소드 호출하여 d는 5, a는 5 출력
        a = d--;                                                        // a에 d 대입 후, d에 -1
        System.out.println("a = " + a + ", d = " + d);                  // System.out.println() 메소드 호출하여 a는 5, d는 4 출력
        a = --d;                                                        // d에 -1 후, a에 d 대입
        System.out.println("a = " + a + ", d = " + d);                  // System.out.println() 메소드 호출하여 d는 3, a는 3 출력
    }                                                                   // main() 메소드 정의 끝
}                                                                       // AssignmentIncDecOperator 클래스 정의 끝
