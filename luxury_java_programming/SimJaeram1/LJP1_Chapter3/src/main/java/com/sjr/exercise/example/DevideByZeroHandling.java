package com.sjr.exercise.example;                       // 패키지 선언문

import java.util.Scanner;                               // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class DevideByZeroHandling {                     // DevideByZeroHandling 클래스 정의 시작
    public static void main(String[] args) {            // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);       // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int dividend;                                   // int형 변수 dividend 선언, 즉 나뉨수
        int divisor;                                    // int형 변수 divisor 선언, 즉 나눗수

        // 로직
        // 1. 나뉨수, 나눗수 입력
        while(true) {                                   // 무한반복
            System.out.print("나뉨수를 입력하시오:");      // System.out.print() 메소드 호출하여 문자열 "나뉨수를 입력하시오:" 출력, 즉 입력 안내 메세지 출력
            dividend = scanner.nextInt();               // 변수 dividend에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 나뉨수 입력
            System.out.print("나눗수를 입력하시오:");      // System.out.print() 메소드 호출하여 문자열 "나눗수를 입력하시오:" 출력, 즉 입력 안내 메세지 출력
            divisor = scanner.nextInt();                // 변수 divisor에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 나눗수 입력

            // 2. 연산 및 결과 출력
            try {
                System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");  // System.out.print() 메소드 호출하여 문자열 dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다." 출력, 즉 연산 결과 출력
                break;                                                                                            // 예외가 발생하지 않은 경우, while문을 빠져나감
            }
            catch(ArithmeticException e) {                                                                        // ArithmeticException 예외가 발생한 경우 catch 블럭으로 분기
                System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");                                         // System.out.println() 메소드 호출하여 문자열 "0으로 나눌 수 없습니다! 다시 입력하세요." 출력, 즉 0으로 나눌 수 없음 안내 메세지 출력하여 예외 처리
            }
        }                                               // while문 끝

        scanner.close();                                // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                   // main() 메소드 정의 끝
}
