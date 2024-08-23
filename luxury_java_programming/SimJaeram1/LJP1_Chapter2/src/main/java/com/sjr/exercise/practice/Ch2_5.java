package com.sjr.exercise.practice;                                                  // 패키지 선언문

import java.util.Scanner;                                                           // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_5 {                                                                // Ch2_5 클래스 정의 시작
    public static void main(String[] args) {                                        // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                                   // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int a, b, c;                                                                // int형 변수 a, b, c 선언, 삼각형의 세 변의 길이
        boolean isTriangle = false;                                                 // boolean형 변수 isTriangle 선언 동시에 false 대입하여 초기화, 삼각형 가능 여부

        // 로직
        // 1. 세 변의 길이 입력
        System.out.print("정수 3개를 입력하시오>>");                                   // System.out.print() 메소드 호출하여 문자열 "정수 3개를 입력하시오>>" 출력, 정수 3개 입력 안내 메세지 출력
        a = scanner.nextInt();                                                      // 변수 a에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 삼각형의 한 변의 길이
        b = scanner.nextInt();                                                      // 변수 b에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 삼각형의 한 변의 길이
        c = scanner.nextInt();                                                      // 변수 c에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 삼각형의 한 변의 길이

        // 2. 삼각형 여부 판별
        if((a + b > c) || (a + c > b) || (b + c > a)) {                             // a + b가 c보다 크거나 a + c가 b보다 크거나 b + c가 a보다 크면
            isTriangle = true;                                                      // 변수 isTriangle에 true 대입
        }

        // 3. 판별 결과 출력
        System.out.println("삼각형이 " + (isTriangle? "됩니다.": "되지 못합니다."));     // System.out.println() 메소드 호출하여 문자열 "삼각형이 " + (isTriangle? "됩니다.": "되지 못합니다.") 출력, 삼각형 판별 결과 출력

        scanner.close();                                                            // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                                                               // main() 메소드 정의 끝
}                                                                                   // Ch2_5 클래스 정의 끝
