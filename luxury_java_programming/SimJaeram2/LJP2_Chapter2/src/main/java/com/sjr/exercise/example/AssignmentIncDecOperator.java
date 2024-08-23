package com.sjr.exercise.example;                                   // 패키지 선언문

public class AssignmentIncDecOperator {                             // AssignmentIncDecOperator 클래스 정의 시작
    public static void main(String[] args) {                        // main() 메소드 정의 시작
        // 변수 선언
        int a = 3, b = 3, c = 3;                                    // int형 변수 a 선언 동시에 3 대입하여 초기화, b 선언 동시에 3 대입하여 초기화, c 선언 동시에 3 대입하여 초기화

        // 연산 및 결과 출력
        a += 3;                                                     // a = a + 3 == 6, 변수 a에 연산 결과 리턴 받아 대입
        b *= 3;                                                     // b = b * 3 == 9, 변수 b에 연산 결과 리턴 받아 대입
        c %= 2;                                                     // c = c % 2 == 1, 변수 c에 연산 결과 리턴 받아 대입
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);     // System.out.println() 메소드 호출하여 문자열 "a=" + a + ", b=" + b + ", c=" + c 출력, 연산 결과 출력

        int d = 3;                                                  // int형 변수 d 선언 동시에 3 대입하여 초기화
        // 증감 연산자 사례
        // 연산 및 결과 출력
        a = d++;                                                    // 먼저 a에 d 대입 후, d에 +1
        System.out.println("a=" + a + ", d=" + d);                  // System.out.println() 메소드 호출하여 문자열 "a=" + a + ", d=" + d 출력, a는 3, d는 4
        a = ++d;                                                    // 먼저 d에 +1 후, a에 d 대입
        System.out.println("a=" + a + ", d=" + d);                  // System.out.println() 메소드 호출하여 문자열 "a=" + a + ", d=" + d 출력, a는 5, d는 5
        a = d--;                                                    // 먼저 a에 d 대입 후, d에 -1
        System.out.println("a=" + a + ", d=" + d);                  // System.out.println() 메소드 호출하여 문자열 "a=" + a + ", d=" + d 출력, a는 5, d는 4
        a = --d;                                                    // 먼저 d에 -1 후, a에 d 대입
        System.out.println("a=" + a + ", d=" + d);                  // System.out.println() 메소드 호출하여 문자열 "a=" + a + ", d=" + d 출력, a는 3, d는 3
    }                                                               // main() 메소드 정의 끝
}                                                                   // AssignmentIncDecOperator 클래스 정의 끝
