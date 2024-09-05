package com.sjr.exercise.practice;                      // 패키지 선언문

import java.util.Scanner;                               // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_11_1 {                                 // Ch2_11_1 클래스 정의 시작
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
        if ( 3 <= month && month <= 5) {                // 만약 변수 month에 저장된 값이 3보다 크거나 같고 5보다 작거나 같으면, 즉 사용자가 입력한 달이 3 ~ 5월이면
            season = "봄";                              // 변수 season에 문자열 "봄" 대입
        }
        else if ( 6 <= month && month <= 8) {           // 그렇지 않고 만약 변수 month에 저장된 값이 6보다 크거나 같고 8보다 작거나 같으면, 즉 사용자가 입력한 달이 6 ~ 8월이면
            season = "여름";                             // 변수 season에 문자열 "여름" 대입
        }
        else if ( 9 <= month && month <= 11) {          // 그렇지 않고 만약 변수 month에 저장된 값이 9보다 크거나 같고 11보다 작거나 같으면, 즉 사용자가 입력한 달이 9 ~ 11월이면
            season = "가을";                             // 변수 season에 문자열 "가을" 대입
        }
        else if ( month == 1 || month == 2 || month == 12) { // 그렇지 않고 만약 변수 month에 저장된 값이 1이거나 2거나 12이면, 즉 사용자가 입력한 달이 1, 2, 12월이면
            season = "겨울";                             // 변수 season에 문자열 "겨울" 대입
        }
        else {                                          // 그렇지 않으면, 즉 변수 month에 저장된 값이 1 ~ 12월에 해당되지 않으면
            season = "잘못입력";                          // 변수 season에 문자열 "잘못입력" 대입
        }
        // 3. 결과 출력
        System.out.println(season);                     // System.out.println() 메소드 호출하여 season에 저장된 값 출력, 즉 계절 판별 결과 출력

        scanner.close();                                // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                                   // main() 메소드 정의 끝
}                                                       // Ch2_11_1 클래스 정의 끝
