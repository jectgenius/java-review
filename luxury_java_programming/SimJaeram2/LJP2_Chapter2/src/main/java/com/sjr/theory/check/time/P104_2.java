package com.sjr.theory.check.time;                  // 패키지 선언문

public class P104_2 {                               // P104_2 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        // 변수 선언
        int i = 4;                                  // int형 변수 i 선언 동시에 4 대입하여 초기화, 판별할 숫자

        // 짝/홀수 및 6의 배수 여부 판별
        if (i % 2 == 0) {                           // 변수 i를 2로 나눈 나머지가 0이면, 즉 i가 짝수이면
            if (i % 3 == 0) {                       // 변수 i를 3으로 나눈 나머지가 0이면, 즉 i가 3의배수면
                System.out.println("6의배수");       // System.out.println() 메소드 호출하여 문자열 "6의배수" 출력, 6의배수 안내 메세지 출력
            }
        }
        else {                                      // 그렇지 않으면, 즉 i가 홀수이면
            System.out.println("홀수");              // System.out.println() 메소드 호출하여 문자열 "홀수" 출력, 홀수 안내 메세지 출력
        }
    }                                               // main() 메소드 정의 끝
}                                                   // P104_2 클래스 정의 끝
