package com.sjr.theory.practice;                    // 패키지 선언문

public class P109_14 {                              // P109_14 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        // 문자열 선언 동시에 대입
        String in = "";                             // String 클래스형 레퍼런스 변수 in 선언 동시에 빈 문자열 "" 대입하여 초기화
        // 문자열 내용 판별
        switch(in) {                                // 변수 in의 값이
            case "가위":                             // 문자열 "가위" 이면
                System.out.println(1);              // System.out.println() 메소드 호출하여 정수 1 출력
                break;                              // switch문을 빠져나감
            case "바위":                             // 문자열 "바위" 이면
                System.out.println(2);              // System.out.println() 메소드 호출하여 정수 2 출력
                break;                              // switch문을 빠져나감
            case "보":                               // 문자열 "보" 이면
                System.out.println(3);              // System.out.println() 메소드 호출하여 정수 3 출력
                break;                              // switch문을 빠져나감
            default:                                // 그 어떤 case문 값에 해당되지 않으면, 즉 어떤 case문으로도 분기되지 않으면
                System.out.println(0);              // System.out.println() 메소드 호출하여 정수 0 출력
        }                                           // switch문 끝
    }                                               // main() 메소드 정의 끝
}                                                   // P109_14 클래스 정의 끝
