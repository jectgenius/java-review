package com.sjr.exercise.practice;                                                          // 패키지 선언문

import java.util.Scanner;                                                                   // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_3 {                                                                        // Ch2_3 클래스 정의 시작
    public static void main(String[] args) {                                                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                                           // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int money, remain;                                                                  // int형 변수 money, remain 선언, 사용자가 입력한 돈, 나머지 돈
        int manwon5, manwon1, cheonwon1, baekwon5, baekwon1, sibwon5, sibwon1, illwon1;     // int형 변수 manwon5, manwon1, cheonwon1, baekwon5, baekwon1, sibwon5, sibwon1, illwon 선언, 지폐 개수

        // 로직
        // 1. 변환할 돈 입력
        System.out.print("금액을 입력하시오>>");                                               // System.out.print() 메소드 호출하여 문자열 "금액을 입력하시오>>" 출력, 금액 입력 안내 메세지 출력
        money = scanner.nextInt();                                                          // 변수 money에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 사용자가 입력한 돈

        // 2. 각 지폐 단위로 나누기, 지폐 개수
        // 3. 각 지폐 단위로 나머지 연산, 남은 돈
        manwon5 = money / 50_000;                                                           // 변수 manwon5에 money / 50_000 연산 결과 리턴 받아 대입하여 초기화, 오만원권 개수
        remain = money % 50_000;                                                            // 변수 remain에 money % 50_000 연산 결과 리턴 받아 대입하여 초기화, 오만원권으로 변환하고 남은 돈
        manwon1 = remain / 10_000;                                                          // 변수 manwon1에 remain / 10_000 연산 결과 리턴 받아 대입하여 초기화, 만원권 개수
        remain = remain % 10_000;                                                           // 변수 remain에 remain % 10_000 연산 결과 리턴 받아 대입하여 초기화, 만원권으로 변환하고 남은 돈
        cheonwon1 = remain / 1_000;                                                         // 변수 cheonwon1에 remain % 1_000 연산 결과 리턴 받아 대입하여 초기화, 천원권 개수
        remain = remain % 1_000;                                                            // 변수 remain에 remain % 1_000 연산 결과 리턴 받아 대입하여 초기화, 천원권으로 변환하고 남은 돈
        baekwon5 = remain / 500;                                                            // 변수 baekwon5에 remain / 500 연산 결과 리턴 받아 대입하여 초기화, 오백원 개수
        remain = remain % 500;                                                              // 변수 remain에 remain % 500 연산 결과 리턴 받아 대입하여 초기화, 오백원으로 변환하고 남은 돈
        baekwon1 = remain / 100;                                                            // 변수 baekwon1에 remain / 100 연산 결과 리턴 받아 대입하여 초기화, 백원 개수
        remain = remain % 100;                                                              // 변수 remain에 remain % 100 연산 결과 리턴 받아 대입하여 초기화, 백원으로 변환하고 남은 돈
        sibwon5 = remain / 50;                                                              // 변수 sibwon5에 remain / 50 연산 결과 리턴 받아 대입하여 초기화, 오십원 개수
        remain = remain % 50;                                                               // 변수 remain에 remain % 50 연산 결과 리턴 받아 대입하여 초기화, 오십원으로 변환하고 남은 돈
        sibwon1 = remain / 10;                                                              // 변수 sibwon1에 remain / 10 연산 결과 리턴 받아 대입하여 초기화, 십원 개수
        remain = remain % 10;                                                               // 변수 remain에 remain % 10 연산 결과 리턴 받아 대입하여 초기화, 십원으로 변환하고 남은 돈
        illwon1 = remain;                                                                   // 변수 illwon1에 remain 대입하여 초기화, 일원 개수

        // 4. 변환한 결과 출력, 개수가 0개이면 출력 X
        if (manwon5 != 0) {                                                                 // 변수 manwon5에 저장된 값이 0이 아니면, 즉 오만원권 개수가 0개 아니면
            System.out.println("오만원권 " + manwon5 + "매");                                 // System.out.println() 메소드 호출하여 문자열 "오만원권 " + manwon5 + "매" 출력, 오만원권 개수 출력
        }
        if (manwon1 != 0) {                                                                 // 변수 manwon1에 저장된 값이 0이 아니면, 즉 만원권 개수가 0개 아니면
            System.out.println("만원권 " + manwon1 + "매");                                   // System.out.println() 메소드 호출하여 문자열 "만원권 " + manwon1 + "매" 출력, 만원권 개수 출력
        }
        if (cheonwon1 != 0) {                                                               // 변수 cheonwon1에 저장된 값이 0이 아니면, 즉 천원권 개수가 0개 아니면
            System.out.println("천원권 " + cheonwon1 + "매");                                 // System.out.println() 메소드 호출하여 문자열 "천원권 " + cheonwon1 + "매" 출력, 천원권 개수 출력
        }
        if (baekwon5 != 0) {                                                                // 변수 baekwon5에 저장된 값이 0이 아니면, 즉 오백원 개수가 0개 아니면
            System.out.println("오백원 " + baekwon5 + "개");                                  // System.out.println() 메소드 호출하여 문자열 "오백원 " + baekwon5 + "개" 출력, 오백원 개수 출력
        }
        if (baekwon1 != 0) {                                                                // 변수 baekwon1에 저장된 값이 0이 아니면, 즉 백원 개수가 0개 아니면
            System.out.println("백원 " + baekwon1 + "개");                                   // System.out.println() 메소드 호출하여 문자열 "백원 " + baekwon1 + "개" 출력, 백원 개수 출력
        }
        if (sibwon5 != 0) {                                                                 // 변수 sibwon5에 저장된 값이 0이 아니면, 즉 오십원 개수가 0개 아니면
            System.out.println("오십원 " + sibwon5 + "개");                                   // System.out.println() 메소드 호출하여 문자열 "오십원 " + sibwon5 + "개" 출력, 오십원 개수 출력
        }
        if (sibwon1 != 0) {                                                                 // 변수 sibwon1에 저장된 값이 0이 아니면, 즉 십원 개수가 0개 아니면
            System.out.println("십원 " + sibwon1 + "개");                                    // System.out.println() 메소드 호출하여 문자열 "십원 " + sibwon1 + "개" 출력, 십원 개수 출력
        }
        if (illwon1 != 0) {                                                                 // 변수 illwon1에 저장된 값이 0이 아니면, 즉 일원 개수가 0개 아니면
            System.out.println("일원 " + illwon1 + "개");                                    // System.out.println() 메소드 호출하여 문자열 "일원 " + illwon1 + "개" 출력, 일원 개수 출력
        }

        scanner.close();                                                                    // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                                                                       // main() 메소드 정의 끝
}                                                                                           // Ch2_3 클래스 정의 끝
