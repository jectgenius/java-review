package com.sjr.exercise.practice;                          // 패키지 선언문

import java.util.Scanner;                                   // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch3_4 {                                        // Ch3_4 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);           // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 선언
        char s;                                             // char형 변수 s 선언, 즉 사용자가 입력한 문자

        // 로직
        // 1. 알파벳 입력
        System.out.print("소문자 알파벳 하나를 입력하시오>>");   // System.out.print() 메소드 호출하여 문자열 "소문자 알파벳 하나를 입력하시오>>" 출력, 즉 알파벳 입력 안내 메세지 출력
        s = scanner.next().charAt(0);                       // 변수 s에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값 문자열로 리턴 받아 String 객체의 chatAt() 메소드 호출하여 문자열의 인덱스 0번째 문자 대입하여 초기화, 즉 사용자가 입력한 알파벳

        // 2. 알파벳 출력
        for(int i = s - 'a' ; i >= 0; i--) {                // 총 문자 'a' ~ 변수 s에 저장된 문자 만큼 반복, int형 변수 i 선언 동시에 s - 'a' 연산 결과 리턴 받아 대입하여 초기화, 반복제어변수 i가 0보다 크거나 같으면 반복, i에 -1
            for(char c = 'a'; c <= 'a' + i; c++) {          // 문자 'a' ~ 'a' + i 까지 문자 출력, char형 변수 c 선언 동시에 'a' 대입하여 초기화, 반복제어변수 c가 문자 'a' 보다 작거나 같으면 반복, c에 +1
                System.out.print((char) c);                 // System.out.print() 메소드 호출하여 알파벳 출력
            }                                               // 안쪽 for문 끝, 알파벳 한줄 출력 완료
            System.out.println();                           // System.out.println() 메소드 호출하여 줄바꿈
        }                                                   // 바깥 for문 끝, 알파벳 모두 출력 완료

        scanner.close();                                    // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                       // main() 메소드 정의 끝
}                                                           // Ch3_4 클래스 정의 끝
