package com.sjr.exercise.example;                               // 패키지 선언문

public class CircleArea {                                       // CircleArea 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        // 상수 선언
        final double PI = 3.14;                                 // double형 상수 PI 선언 동시에 3.14 대입하여 초기화, 원주율

        // 변수 선언
        double radius = 10.0;                                   // double형 radius 선언 동시에 10.0 대입하여 초기화, 원의 반지름
        double circleArea = radius * radius * PI;               // double형 변수 circleArea 선언 동시에 radius * radius * PI 연산 결과 리턴 받아 대입하여 초기화, 원의 면적 연산

        // 원의 면적을 화면에 출력한다.
        System.out.println("원의 면적 = " + circleArea);         // System.out.println() 메소드 호출하여 문자열 "원의 면적 = " + circleArea 출력, 원의 면적 안내 메세지 출력
    }                                                           // main() 메소드 정의 끝
}                                                               // CircleArea 클래스 정의 끝
