package com.sjr.theory.check.time;                  // 패키지 선언문

import java.util.Scanner;                           // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class P80_2 {                                // 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);   // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화

        // 변수 선언
        int number1, number2;                       // int형 변수 number1, number2 선언, 사용자가 입력한 정수
        int sum;                                    // int형 변수 sum 선언, 사용자가 입력한 두 정수의 합

        // 정수 2개 입력
        System.out.print("정수 2개를 입력하세요: ");   // System.out.print() 메소드 호출하여 문자열 "정수 2개를 입력하세요: " 출력, 정수 입력 안내 메세지 출력
        number1 = scanner.nextInt();                // 변수 number1에 scanner 객체 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화, 정수 1개 입력 
        number2 = scanner.nextInt();                // 변수 number2에 scanner 객체 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화, 정수 1개 입력

        // 합 계산
        sum = number1 + number2;                    // 변수 sum에 number1 + number2 연산 결과 리턴 받아 대입하여 초기화, 두 정수의 합

        // 결과 출력
        System.out.println(number1 + "과 " + number2 + "의 합은 " + sum + "입니다."); // System.out.println() 메소드 호출하여 두 정수의 합 연산 결과 출력

        scanner.close();                            // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                               // main() 메소드 정의 끝
}                                                   // 클래스 정의 끝
