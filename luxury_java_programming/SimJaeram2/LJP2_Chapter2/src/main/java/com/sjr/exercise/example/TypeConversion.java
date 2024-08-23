package com.sjr.exercise.example;                   // 패키지 선언문

public class TypeConversion {                       // TypeConversion 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        // 변수 선언
        byte b = 127;                               // byte형 변수 b 선언 동시에 127 대입하여 초기화
        int i = 100;                                // int형 변수 i 선언 동시에 100 대입하여 초기화

        // 연산 결과 출력
        System.out.println(b+i);                    // System.out.println() 메소드 호출하여 b+i 연산 결과 출력, 227, 자동형변환 1번
        System.out.println(10/4);                   // System.out.println() 메소드 호출하여 10/4 연산 결과 출력, 2, 형변환 0번
        System.out.println(10.0/4);                 // System.out.println() 메소드 호출하여 10.0/4 연산 결과 출력, 2.5, 자동형변환 1번
        System.out.println((char)0x12340041);       // System.out.println() 메소드 호출하여 (char)0x12340041 연산 결과 출력, 'A', 강제형변환 1번
        System.out.println((byte)(b+i));            // System.out.println() 메소드 호출하여 (byte)(b+i) 연산 결과 출력, -29, 자동형변환 1번, 강제형변환 1번
        System.out.println((int)2.9 + 1.8);         // System.out.println() 메소드 호출하여 (int)2.9 + 1.8 연산 결과 출력, 3.8, 강제형변환 1번, 자동형변환 1번
        System.out.println((int)(2.9 + 1.8));       // System.out.println() 메소드 호출하여 (int)(2.9 + 1.8) 연산 결과 출력, 4, 강제형변환 1번
        System.out.println((int)2.9 + (int)1.8);    // System.out.println() 메소드 호출하여 (int)2.9 + (int)1.8 연산 결과 출력, 3, 강제형변환 2번

    }                                               // main() 메소드 정의 끝
}                                                   // TypeConversion 클래스 정의 시작
