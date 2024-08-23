package com.sjr.theory.check.time;                                              // 패키지 선언문

import java.util.Scanner;                                                       // Scanner 클래스 사용하기 위해 컴파일러에게 경로명 알려줌

public class P80_2 {                                                            // P80_2 클래스 정의 시작
    public static void main(String[] args) {                                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                               // Scanner 클래스형 레퍼런스 변수 scanner 선언 동시에 객체 생성하여 대입하여 초기화, 사용자로부터 키 입력 받기 위해 Scanner 클래스 사용

        // 정수 2개 입력, 합 연산
        System.out.println("합을 구할 정수 2개를 공백으로 구분하여 입력하세요.");       // System.out.println() 메소드 호출하여 문자열 "합을 구할 정수 2개를 공백으로 구분하여 입력하세요." 출력, 정수 2개 입력 안내 메세지 출력
        int number1 = scanner.nextInt();                                        // int형 변수 number1 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화
        int number2 = scanner.nextInt();                                        // int형 변수 number2 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 정수 리턴 받아 대입하여 초기화
        int sum = number1 + number2;                                            // int형 변수 sum 선언 동시에 number1 + number2 연산 결과 대입하여 초기화, 합

        // 결과 출력
        System.out.println(number1 + "과 " + number2 + "의 합은 " + sum + "입니다.");// System.out.println() 메소드 호출하여 sum 출력, 합 출력

        scanner.close();                                                        // scanner 객체 닫기, 사용종료
    }                                                                           // main() 메소드 정의 끝
}                                                                               // P80_2 클래스 정의 시작
