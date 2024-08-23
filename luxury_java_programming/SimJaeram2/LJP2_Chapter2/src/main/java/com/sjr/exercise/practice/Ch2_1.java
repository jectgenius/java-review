package com.sjr.exercise.practice;                            // 패키지 선언문

import java.util.Scanner;                                     // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_1 {                                          // Ch2_1 클래스 정의 시작
    public static void main(String[] args) {                  // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);             // Scanner 클래스형 레퍼런스 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        final int rate = 1100;                                // int형 상수 rate 선언 동시에 1100 대입하여 초기화, 환율

        int won;                                              // int형 변수 won 선언, 원화
        double dollar;                                        // double형 변수 dollar 선언, 달러화

        // 로직
        // 1. 원화 입력
        System.out.print("원화를 입력하세요(단위 원)>> ");        // System.out.print() 메소드 호출하여 문자열 "원화를 입력하세요(단위 원)>> " 출력, 원화 입력 안내 메세지 출력
        won = scanner.nextInt();                              // 변수 won에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 사용자로부터 입력 받은 원화

        // 2. 달러화 변환
        dollar = won / rate;                                  // 변수 dollar에 won / rate 연산 결과 리턴 받아 대입하여 초기화, 변환한 달러화

        // 3. 변환한 달러화 결과 출력
        System.out.println(won + "원은 $" + dollar + "입니다.");// System.out.println() 메소드 호출하여 문자열 won + "원은 $" + dollar + "입니다." 출력, 달러화로 변환한 결과 출력

        scanner.close();                                      // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용 종료
    }                                                         // main() 메소드 정의 끝
}                                                             // Ch2_1 클래스 정의 끝
