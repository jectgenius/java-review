package com.sjr.exercise.practice;                                              // 패키지 선언문

import java.util.Scanner;                                                       // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch3_6 {                                                            // Ch3_6 클래스 정의 시작
    public static void main(String[] args) {                                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                               // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};                 // int형 배열 unit 선언 동시에 초기화 블럭으로 초기화한 int형 배열 객체 생성하여 대입, 즉 화폐 단위
        int[] count = new int[10];                                              // int형 배열 unit 선언 동시에 크기가 10인 int형 배열 객체 생성하여 대입, 즉 화페 단위로 환산한 개수
        int money, remain;                                                      // int형 변수 money, remain 선언, 즉 사용자가 입력한 금액과 환산하고 남은 돈

        // 로직
        // 1. 변환할 돈 입력
        System.out.print("금액을 입력하시오>>");                                   // System.out.print() 메소드 호출하여 문자열 "금액을 입력하시오>>" 출력, 즉 금액 입력 안내 메세지 출력
        money = scanner.nextInt();                                              // 변수 money에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 사용자가 입력한 금액
        remain = money;                                                         // 변수 remain에 money 대입하여 초기화

        for(int i = 0; i < unit.length; i++) {                                  // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 unit의 크기 length 보다 작으면 반복, i에 +1
            // 2. 단위 환산하여 개수 배열에 저장
            count[i] = remain / unit[i];                                        // 배열 count의 인덱스 i번째 요소에 remain / unit[i] 연산 결과 리턴 받아 대입하여 초기화, 즉 인덱스 i번째 요소에 저장된 화폐 단위로 바꾼 개수 대입
            remain = remain % unit[i];                                          // 변수 remain에 remain % unit[i] 연산 결과 리턴 받아 대입하여 초기화, 즉 환산하고 남은 돈

            // 3. 환산 결과 출력
            if(count[i] != 0) {                                                 // 배열 count의 인덱스 i번째 요소에 저장된 값이 0이 아니면, 즉 환산한 화폐 단위 개수가 0개가 아니면
                System.out.println(unit[i] + "원 짜리 : " + count[i] + "개");    // System.out.print() 메소드 호출하여 문자열 unit[i] + "원 짜리 : " + count[i] + "개" 출력, 즉 환산 결과 출력
            }
        }                                                                       // for문 끝, 즉 환산 모두 완료

        scanner.close();                                                        // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                                           // main() 메소드 정의 끝
}                                                                               // Ch3_6 클래스 정의 끝
