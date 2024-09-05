package com.sjr.exercise.practice;                              // 패키지 선언문

import java.util.Scanner;                                       // 다른 패키지 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_6 {                                            // Ch2_6 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);               // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int number, ten, one, count = 0;                        // int형 변수 number, ten, one, count 선언 동시에 count에 0 대입하여 초기화, 사용자가 입력한 정수, 십의 자리 수, 일의 자리 수, 3, 6, 9 개수
        String result = "";                                     // String형 변수 result 선언 동시에 빈 문자열 "" 대입하여 초기화, 결과

        // 로직
        // 1. 정수 입력
        System.out.print("1~99 사이의 정수를 입력하시오>>");       // System.out.print() 메소드 호출하여 문자열 "1~99 사이의 정수를 입력하시오>>" 출력, 입력 안내 메세지 출력
        number = scanner.nextInt();                            // 변수 number에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 사용자로 부터 정수 입력

        // 2. 십의 자리 수 및 일의 자리 수 추출
        ten = number / 10;                                     // 변수 ten에 number / 10 연산 결과 리턴 받아 대입하여 초기화, 십의 자리 수 추출
        one = number % 10;                                     // 변수 one에 number % 10 연산 결과 리턴 받아 대입하여 초기화, 일의 자리 수 추출

        // 3. 3, 6, 9 개수 세기
        if((ten == 3) || (ten == 6) || (ten == 9)) {           // 만약 ten에 저장된 값이 3 또는 6 또는 9면, 즉 십의 자리 수가 3 또는 6 또는 9면
            count++;                                           // count에 +1, 즉 3, 6, 9 개수 +1
        }
        if((one == 3) || (one == 6) || (one == 9)) {           // 만약 one에 저장된 값이 3 또는 6 또는 9면, 즉 일의 자리 수가 3 또는 6 또는 9면
            count++;                                           // count에 +1, 즉 3, 6, 9 개수 +1
        }

        // 4. 결과 출력
        if (count == 1) {                                       // 만약 count에 저장된 값이 1이면, 즉 3, 6, 9 개수가 1개이면
            result = "박수짝";                                   // result에 문자열 "박수짝" 대입
        } else if (count == 2) {                                // 그렇지 않고 만약 count에 저장된 값이 2이면, 즉 3, 6, 9 개수가 2개이면
            result = "박수짝짝";                                 // result에 문자열 "박수짝짝" 대입
        }

        System.out.println(result);                             // System.out.println() 메소드 호출하여 result에 저장된 값 출력, 즉 판별 결과 출력

        scanner.close();                                        // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                                           // main() 메소드 정의 끝
}                                                               // Ch2_6 클래스 정의 끝
