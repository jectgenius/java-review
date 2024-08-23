package com.sjr.exercise.example;                           // 패키지 선언문

public class BitOperator {                                  // BitOperator 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작
        // 변수 선언
        short a = (short)0x55ff;                            // short형 변수 a 선언 동시에 (short)0x55ff 대입하여 초기화, 0b0101010111111111
        short b = (short)0x00ff;                            // short형 변수 b 선언 동시에 (short)0x00ff 대입하여 초기화, 0b0000000011111111

        // 비트 논리 연산
        System.out.println("[비트 연산 결과]");               // System.out.println() 메소드 호출하여 문자열 "[비트 연산 결과]" 출력
        System.out.printf("%04x\n", (short)(a & b));        // System.out.printf() 메소드 호출하여 4자리 16진수 형식으로 (short)(a & b) 연산 결과 출력
        System.out.printf("%04x\n", (short)(a | b));        // System.out.printf() 메소드 호출하여 4자리 16진수 형식으로 (short)(a | b) 연산 결과 출력
        System.out.printf("%04x\n", (short)(a ^ b));        // System.out.printf() 메소드 호출하여 4자리 16진수 형식으로 (short)(a ^ b) 연산 결과 출력
        System.out.printf("%04x\n", (short)(~a));           // System.out.printf() 메소드 호출하여 4자리 16진수 형식으로 (short)(~a) 연산 결과 출력

        // 변수 선언                                          // byte형 변수는 컴퓨터 내부적으로 연산을 편리하게 하기 위해서 int형으로 변환되어 연산함
        byte c = 20;                                        // byte형 변수 c 선언 동시에 20 대입하여 초기화
        byte d = -8;                                        // byte형 변수 d 선언 동시에 -8 대입하여 초기화
        // 비트 시프트 연산
        System.out.println("[시프트 연산 결과]");              // System.out.println() 메소드 호출하여 문자열 "[시프트 연산 결과]" 출력
        System.out.println(c << 2);                         // System.out.println() 메소드 호출하여 c << 2 연산 결과 출력, 20 * 2^2 == 80
        System.out.println(c >> 2);                         // System.out.println() 메소드 호출하여 c >> 2 연산 결과 출력, 20 / 2^2 == 5
        System.out.println(d >> 2);                         // System.out.println() 메소드 호출하여 d >> 2 연산 결과 출력, -8 / 2^2 == -2
        System.out.printf("%x\n", (d >> 2));                // System.out.println() 메소드 호출하여 16진수 형식으로 d >> 2 연산 결과 출력, -8 / 2^2 == -2
    }                                                       // main() 메소드 정의 끝
}                                                           // BitOperator 클래스 정의 끝
