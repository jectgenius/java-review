package com.sjr.exercise.practice;                      // 패키지 선언문

public class Ch3_13 {                                   // Ch3_13 클래스 정의 시작
    public static void main(String[] args) {            // main() 메소드 정의 시작
        // 선언
        int count, ten, one;                            // int형 변수 count, ten, one 선언, 즉 개수, 십의 자리 수, 일의 자리 수

        // 로직
        // 1. 1 ~ 99까지 반복
        for(int i = 1; i <= 99; i++) {                  // int형 변수 i 선언 동시에 1 대입하여 초기화, 반복제어변수 i가 99보다 작거나 같으면 반복, i에 +1
            // 2. 각 수의 3, 6, 9 개수 세기
            count = 0;                                  // 변수 count에 0 대입하여 초기화, 즉 개수

            ten = i / 10;                               // 변수 ten에 i / 10 연산 결과 리턴 받아 대입하여 초기화, 즉 십의 자리 수
            one = i % 10;                               // 변수 one에 i % 10 연산 결과 리턴 받아 대입하여 초기화, 즉 일의 자리 수

            if(ten == 3 || ten == 6 || ten == 9) {      // 만약 ten == 3 또는 ten == 6 또는 ten == 9이면, 즉 십의 자리수가 3 또는 6 또는 9이면
                count++;                                // 변수 count에 +1
            }
            if(one == 3 || one == 6 || one == 9) {      // 만약 one == 3 또는 one == 6 또는 one == 9이면, 즉 일의 자리수가 3 또는 6 또는 9이면
                count++;                                // 변수 count에 +1
            }

            // 3. 개수가 0이 아닌 경우 박수 출력
            if(count == 1) {                            // 만약 count == 1이면, 즉 십 또는 일의 자리 수 중에서 3, 6, 9의 개수가 1개면
                System.out.println(i + " 박수 짝");      // System.out.println() 메소드 호출하여 문자열 i + " 박수 짝" 출력, 즉 박수 개수 출력
            }
            else if(count == 2) {                       // 그렇지 않고 만약 count == 2이면, 즉 십 또는 일의 자리 수 중에서 3, 6, 9의 개수가 2개면
                System.out.println(i + " 박수 짝짝");    // System.out.println() 메소드 호출하여 문자열 i + " 박수 짝짝" 출력, 즉 박수 개수 출력
            }
        }                                               // for문 끝, 즉 1 ~ 99까지 3, 6, 9 게임 완료

    }                                                   // main() 메소드 정의 끝
}                                                       // Ch3_13 클래스 정의 끝
