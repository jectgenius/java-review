package com.sjr.theory.check.time;                  // 패키지 선언문

public class P127_1_For {                           // P127_1_For 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        // 로직
        // 1. 5줄 반복
        // 2. 5번, 4번, 3번, 2번, 1번 반복
        for(int i = 5; i > 0; i--) {                // int형 변수 i 선언 동시에 5 대입하여 초기화, i가 0 보다 클 동안 반복, i에 -1
            for(int j = 0; j < i; j++) {            // int형 변수 j 선언 동시에 0 대입하여 초기화, j가 i 보다 작을 동안 반복, j에 +1
                System.out.print("*");              // System.out.print() 메소드 호출하여 문자열 "*" 출력
            }                                       // 한 줄 출력 완료, 안쪽 반복문 끝
            System.out.println();                   // System.out.println() 메소드 호출하여 줄바꿈
        }                                           // 모두 출력 완료, 바깥쪽 반복문 끝
    }                                               // main() 메소드 정의 끝
}                                                   // P127_1_For 클래스 정의 끝
