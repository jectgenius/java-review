package com.sjr.theory.check.time;                  // 패키지 선언문

public class P127_1_DoWhile {                       // P127_1_DoWhile 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        // 변수 및 상수 선언
        int i, j;                                   // int형 변수 i 선언, j 선언

        // 로직
        // 1. 5줄 반복
        // 2. 5번, 4번, 3번, 2번, 1번 반복
        i = 5;                                      // i에 5 대입
        do {
            j = 0;                                  // j에 0 대입
            do {
                System.out.print("*");              // System.out.print() 메소드 호출하여 문자열 "*" 출력
                j++;                                // j에 +1
            } while (j < i);                        // 반복제어변수 j가 i 보다 작을 동안 반복
                                                    // 한 줄 출력 완료
            System.out.println();                   // System.out.println() 메소드 호출하여 줄바꿈
            i--;                                    // i에 -1
        } while(i > 0);                             // 반복제어변수 i가 0 보다 클 동안 반복
                                                    // 모두 출력 완료
    }                                               // main() 메소드 정의 끝
}                                                   // P127_1_DoWhile 클래스 정의 끝