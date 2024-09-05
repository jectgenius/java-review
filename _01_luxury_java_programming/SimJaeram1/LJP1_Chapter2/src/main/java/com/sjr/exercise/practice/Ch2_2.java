package com.sjr.exercise.practice;                                          // 패키지 선언문

import java.util.Scanner;                                                   // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_2 {                                                        // Ch2_2 클래스 정의 시작
    public static void main(String[] args) {                                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                           // Scanner 클래스형 레퍼런스 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화
        // 변수
        int number, one, ten;                                               // int형 변수 number, one, ten 선언, 즉 2자리수 정수, 일의 자리수, 십의 자리수
        boolean result = false;                                             // boolean형 변수 result 선언 동시에 false 대입하여 초기화, 즉 일의 자리수와 십의 자리수 비교 결과

        // 로직
        // 1. 2자리수 정수 입력
        System.out.print("2자리수 정수 입력(10~99)>>");                        // System.out.println() 메소드 호출하여 문자열 "2자리수 정수 입력(10~99)>>" 출력, 2자리수 정수 입력 안내 메세지 출력
        number = scanner.nextInt();                                         // 변수 number에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값을 정수로 리턴 받아 대입하여 초기화, 즉 2자리수 정수 입력
        // 2. 십의 자리수와 일의 자리수 추출
        ten = number / 10;                                                  // 변수 ten에 number / 10 연산 결과 리턴 받아 대입, 즉 십의 자리수
        one = number % 10;                                                  // 변수 one에 number % 10 연산 결과 리턴 받아 대입, 즉 일의 자리수
        // 3. 동일비교
        if(ten == one)                                                      // 만약 ten과 one에 저장된 값이 같으면, 즉 사용자로부터 입력 받은 2자리수 정수의 십의 자리수와 일의 자리수가 같으면
            result = true;                                                  // 변수 result에 true 대입하여 저장, 즉 비교 결과 같음
        else                                                                // 그렇지 않으면, 즉 사용자로부터 입력 받은 2자리수 정수의 십의 자리수와 일의 자리수가 다르면
            result = false;                                                 // 변수 result에 false 대입하여 저장, 즉 비교 결과 다름
        // 4. 결과 출력
        System.out.println(result ? "Yes! 10의 자리와 1의 자리가 같습니다."     // System.out.println() 메소드 호출하여 비교 결과 출력,
                                    : "No! 10의 자리와 1의 자리가 다릅니다.");  // 변수 result에 저장된 값이 true이면 문자열 "Yes! 10의 자리와 1의 자리가 같습니다." 출력
                                                                            // 변수 result에 저장된 값이 tfalse이면 문자열 "No! 10의 자리와 1의 자리가 다릅니다." 출력
        scanner.close();                                                    // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용 종료
    }                                                                       // main() 메소드 정의 끝
}                                                                           // Ch2_2 클래스 정의 끝
