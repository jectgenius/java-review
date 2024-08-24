package com.sjr.exercise.practice;                      // 패키지 선언문

import java.util.Scanner;                               // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_11_2 {                                 // Ch2_11_2 클래스 정의 시작
    public static void main(String[] args) {            // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);       // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int month;                                      // int형 변수 month 선언, 달
        String season;                                  // String형 변수 season 선언, 계절

        // 로직
        // 1. 달 입력
        System.out.print("달을 입력하세요(1~12)>>");       // System.out.print() 메소드 호출하여 문자열 "달을 입력하세요(1~12)>>" 출력, 달 입력 안내 메세지 출력
        month = scanner.nextInt();                      // 변수 month에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 달
        // 2. 계절 판별
        switch(month) {                                 // 변수 month에 저장된 값이
            case 3:                                     // 3인 경우
            case 4:                                     // 4인 경우
            case 5:                                     // 5인 경우
                season = "봄";                           // season에 문자열 "봄" 대입
                break;                                  // switch문을 빠져나감
            case 6:                                     // 6인 경우
            case 7:                                     // 7인 경우
            case 8:                                     // 8인 경우
                season = "여름";                         // season에 문자열 "여름" 대입
                break;                                  // switch문을 빠져나감
            case 9:                                     // 9인 경우
            case 10:                                    // 10인 경우
            case 11:                                    // 11인 경우
                season = "가을";                         // season에 문자열 "가을" 대입
                break;                                  // switch문을 빠져나감
            case 12:                                    // 12인 경우
            case 1:                                     // 1인 경우
            case 2:                                     // 2인 경우
                season = "겨울";                         // season에 문자열 "겨울" 대입
                break;                                  // switch문을 빠져나감
            default:                                    // 어떠한 경우에도 해당되지 않는 경우
                season = "잘못입력";                     // season에 문자열 "잘못입력" 대입
        }
        // 3. 결과 출력
        System.out.println(season);                     // System.out.println() 메소드 호출하여 season에 저장된 값 출력, 즉 계절 판별 결과 출력

        scanner.close();                                // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                                   // main() 메소드 정의 끝
}                                                       // Ch2_11_2 클래스 정의 끝