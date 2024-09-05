package com.sjr.exercise.practice;              // 패키지 선언문

import java.util.Scanner;                       // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch3_3 {                            // Ch3_3 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);// Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수
        int number;                             // int형 변수 number 선언, 즉 사용자가 입력한 정수

        // 로직
        // 1. 줄 개수 입력
        System.out.print("정수를 입력하시오>>");  // System.out.print() 메소드 호출하여 문자열 "정수를 입력하시오>>" 출력, 즉 정수 입력 안내 메세지 출력
        number = scanner.nextInt();            // 변수 number에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 사용자가 입력한 정수
        // 2. 별 출력
        for(int i = number; i > 0; i--) {      // int형 변수 i 선언 동시에 number 대입, 반복제어변수 i보다 0이 크면 반복, i에 -1
            for(int j = 0; j < i; j++) {       // int형 변수 j 선언 동시에 0 대입, 반복제어변수 j가 i보다 작으면 반복, j에 +1
                System.out.print("*");         // System.out.print() 메소드 호출하여 문자열 "*" 출력, 즉 별 출력
            }                                  // 안쪽 for문 끝, 별 한줄 출력 완료
            System.out.println();              // System.out.println() 메소드 호출하여 줄바꿈
        }                                      // 바깥 for문 끝, 별 모두 출력 완료

        scanner.close();                       // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                          // main() 메소드 정의 끝
}                                              // Ch3_3 클래스 정의 끝
