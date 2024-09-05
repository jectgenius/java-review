package com.sjr.theory.practice;                // 패키지 선언문

public class P109_14 {                          // P109_14 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        // 변수 선언
        String in = "";                         // String 클래스형 변수 in 선언 동시에 "" 빈문자열 대입하여 초기화, 판별할 문자열
        int result;                             // int형 변수 result 선언, 결과
        // 결과 판별
        switch(in) {                            // 변수 in에 저장된 값이
            case "가위":                         // "가위"인 경우
                result = 1;                     // 변수 result에 1 대입하여 초기화
                break;                          // switch문을 빠져나감
            case "바위":                         // "바위"인 경우
                result = 2;                     // 변수 result에 2 대입하여 초기화
                break;                          // switch문을 빠져나감
            case "보":                          // "보"인 경우
                result = 3;                     // 변수 result에 3 대입하여 초기화
                break;                          // switch문을 빠져나감
            default:                            // 어떤 경우에도 해당되지 않는 경우
                result = 0;                     // 변수 result에 0 대입하여 초기화
        }                                       // switch문 끝
        // 판별 결과 출력
        System.out.println(result);             // System.out.println() 메소드 호출하여 result에 저장된 값 출력, 판별 결과 출력
    }                                           // main() 메소드 정의 끝
}                                               // P109_14 클래스 정의 끝
