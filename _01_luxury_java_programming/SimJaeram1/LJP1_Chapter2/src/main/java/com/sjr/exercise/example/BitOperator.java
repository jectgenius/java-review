package com.sjr.exercise.example;                       // 패키지 선언문

public class BitOperator {                              // BitOperator 클래스 정의 시작
    public static void main(String[] args) {            // main() 메소드 정의 시작
        // 변수 선언
        short a = (short)0x55ff;                        // short형 변수 a 선언 동시에 (short)0x55ff 대입하여 초기화
        short b = (short)0x00ff;                        // short형 변수 b 선언 동시에 (short)0x00ff 대입하여 초기화

        // 비트 논리 연산자
        System.out.println("[비트 논리 연산 결과]");       // System.out.println() 메소드 호출하여 문자열 "[비트 논리 연산 결과]" 출력, 즉 비트 논리 연산 결과 안내 메세지 출력
        System.out.printf("%04x\n", (short)(a & b));    // System.out.printf() 메소드 호출하여 (short)(a & b) 연산 결과 출력, 즉 00ff
        System.out.printf("%04x\n", (short)(a | b));    // System.out.printf() 메소드 호출하여 (short)(a | b) 연산 결과 출력, 즉 55ff
        System.out.printf("%04x\n", (short)(a ^ b));    // System.out.printf() 메소드 호출하여 (short)(a ^ b) 연산 결과 출력, 즉 55ff
        System.out.printf("%04x\n", (short)(~a));       // System.out.printf() 메소드 호출하여 (short)(~a) 연산 결과 출력, 즉 aa00

        // 변수 선언
        byte c = 20;                                    // byte형 변수 c 선언 동시에 20 대입하여 초기화
        byte d = -8;                                    // byte형 변수 d 선언 동시에 -8 대입하여 초기화

        // 비트 시프트 연산자
        System.out.println("[비트 시프트 연산 결과]");     // System.out.println() 메소드 호출하여 문자열 "[비트 시프트 연산 결과]" 출력, 즉 비트 시프트 연산 결과 안내 메세지 출력
        System.out.println(c << 2);                     // System.out.println() 메소드 호출하여 c << 2 연산 결과 출력, 즉 80
        System.out.println(c >> 2);                     // System.out.println() 메소드 호출하여 c >> 2 연산 결과 출력, 즉 5
        System.out.println(d >> 2);                     // System.out.println() 메소드 호출하여 d >> 2 연산 결과 출력, 즉 -2
        System.out.printf("%x\n", (d >>> 2));           // System.out.println() 메소드 호출하여 d >> 2 연산 결과 출력, 즉 3ffffffe
    }                                                   // main() 메소드 정의 끝
}                                                       // BitOperator 클래스 정의 끝
