package com.sjr.exercise.practice;                              // 패키지 선언문

import java.util.InputMismatchException;                        // 다른 패키지 클래스 사용하기 위해 컴파일러에게 경로명 알려줌
import java.util.Scanner;                                       // 다른 패키지 클래스 사용하기 위해 컴파일러에게 경로명 알려줌

public class Ch3_15 {                                           // Ch3_15 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);               // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 두 정수 입력
        while(true) {                                           // 무한반복
            System.out.print("곱하고자 하는 두 수 입력>>");         // System.out.print() 메소드 호출하여 문자열 "곱하고자 하는 두 수 입력>>" 출력, 즉 두 정수 입력 안내 메세지 출력
            try {                                               // 예외가 발생할 것 같은 코드 감쌈
                int n = scanner.nextInt();                      // int형 변수 n 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 사용자가 입력한 정수
                int m = scanner.nextInt();                      // int형 변수 m 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 사용자가 입력한 정수
                // 결과 출력
                System.out.print(n + "x" + m + "=" + n * m);    // System.out.print() 메소드 호출하여 문자열 n + "x" + m + "=" + n * m 출력, 즉 곱셈 연산 결과 출력
                break;                                          // 예외가 발생하지 않고 정상적으로 실행된 경우 무한반복문을 빠져나감
            } catch (InputMismatchException e) {                // 만약 InputMismatchException 예외가 발생하면 catch 블럭으로 분기, 즉 int 값을 입력 받고자 하였지만 다른 타입의 값이 입력된 경우 발생
                System.out.println("실수는 입력하면 안됩니다.");    // System.out.print() 메소드 호출하여 문자열 "실수는 입력하면 안됩니다." 출력하여 예외처리
                scanner.nextLine();                             // scanner 객체의 nextLine() 메소드 호출하여 현재 입력된 키 제거
            }                                                   // catch 블럭 끝, 예외처리 끝
        }                                                       // while문 끝, 무한반복 끝

        scanner.close();                                        // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                           // main() 메소드 정의 끝
}                                                               // Ch3_15 클래스 정의 끝
