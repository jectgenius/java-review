package com.sjr.exercise.practice;                                      // 패키지 선언문

import java.util.Scanner;                                               // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_1 {                                                    // Ch2_1 클래스 정의 시작
    public static void main(String[] args) {                            // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                       // Scanner 클래스형 레퍼런스 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화
        // 상수
        final double Exchange_Rate = 1100;                              // double형 상수 Exchange_Rate 선언 동시에 1100 대입하여 초기화, 환율
        // 변수
        int won;                                                        // int형 변수 won 선언, 원화
        double dollar;                                                  // double형 변수 dollar 선언, 달러화

        // 로직
        // 1. 원화 입력
        System.out.print("원화를 입력하세요(단위 원)>>");                   // System.out.println() 메소드 호출하여 문자열 "원화를 입력하세요(단위 원)>>" 출력, 원화 입력 안내 메세지 출력
        won = scanner.nextInt();                                        // 변수 won에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값을 리턴 받아 대입하여 초기화, 원화 저장

        // 2. 달러 변환
        dollar = won/Exchange_Rate;                                     // 변수 dollar에 won/Exchange_Rate 연산 결과 리턴 받아 대입, 원화를 달러화로 변환하여 저장

        // 3. 결과 출력
        System.out.println(won + "원은 $" + dollar + "입니다.");         // System.out.println() 메소드 호출하여 원화를 달러화로 변환한 결과 안내 메세지 출력

        scanner.close();                                                // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용 종료
    }                                                                   // main() 메소드 정의 끝
}                                                                       // Ch2_1 클래스 정의 끝
