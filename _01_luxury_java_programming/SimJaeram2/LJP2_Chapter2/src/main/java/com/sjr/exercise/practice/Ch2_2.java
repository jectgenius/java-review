package com.sjr.exercise.practice;                                  // 패키지 선언문

import java.util.Scanner;                                           // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_2 {                                                // Ch2_2 클래스 정의 시작
    public static void main(String[] args) {                        // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                   // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화

        // 변수 및 상수 선언
        int number, sib, ill;                                       // int형 변수 number, sib, ill 선언, 사용자로부터 입력 받은 2자리 수 정수, 십의 자리수, 일의 자리수

        // 로직
        // 1. 2자리수 정수 입력
        System.out.print("2자리수 정수 입력(10~99)>>");                // System.out.print() 메소드 호출하여 문자열 "2자리수 정수 입력(10~99)>>" 출력, 2자리수 정수 입력 안내 메세지 출력
        number = scanner.nextInt();                                 // 변수 number 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 사용자로부터 입력 받은 2자리수 정수

        // 2. 십의 자리 수, 일의 자리 수 추출
        sib = number / 10;                                          // 변수 sib에 number / 10 연산 결과 리턴 받아 대입, 십의 자리 수
        ill = number % 10;                                          // 변수 sib에 number % 10 연산 결과 리턴 받아 대입, 일의 자리 수

        // 3. 십의 자리 수, 일의 자리 수 일치 여부 판별 및 판별 결과 출력
        if(sib == ill) {                                            // 변수 sib에 저장된 값과 ill에 저장된 값이 같으면, 즉 사용자가 입력한 2자리수 정수가 십의 자리수와 일의 자리수가 같으면
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다."); // System.out.println() 메소드 호출하여 문자열 "Yes! 10의 자리와 1의 자리가 같습니다." 출력, 일치 안내 메세지 출력
        }
        else {                                                      // 그렇지 않으면, 즉 사용자가 입력한 2자리수 정수가 십의 자리수와 일의 자리수가 같지 않으면
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다."); // System.out.println() 메소드 호출하여 문자열 "No! 10의 자리와 1의 자리가 다릅니다." 출력, 불일치 안내 메세지 출력
        }

        scanner.close();                                            // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용 종료
    }                                                               // main() 메소드 정의 끝
}                                                                   // Ch2_2 클래스 정의 끝
