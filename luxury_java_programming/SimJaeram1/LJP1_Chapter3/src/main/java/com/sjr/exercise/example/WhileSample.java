package com.sjr.exercise.example;                                           // 패키지 선언문

import java.util.Scanner;                                                   // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class WhileSample {                                                  // WhileSample 클래스 정의 시작
    public static void main(String[] args) {                                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                           // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int count = 0;                                                      // int형 변수 count 선언 동시에 0 대입하여 초기화, 즉 개수
        int sum = 0;                                                        // int형 변수 sum 선언 동시에 0 대입하여 초기화, 즉 총합

        // 로직
        // 1. 평균 구할 정수 입력
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");          // System.out.println() 메소드 호출하여 문자열 "정수를 입력하고 마지막에 -1을 입력하세요." 출력, 즉 정수 입력 안내 메세지 출력

        int n = scanner.nextInt();                                          // int형 변수 n 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 사용자가 입력한 정수
        while(n != -1) {                                                    // 만약 n이 -1이 아니면, 죽 사용자가 입력 끝을 지시한 게 아니면
            sum += n;                                                       // 변수 sum에 n 값을 합함
            count++;                                                        // 변수 count에 +1, 즉 사용자가 입력한 정수의 개수 증가
            n = scanner.nextInt();                                          // 변수 n에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 사용자가 입력한 정수
        }                                                                   // 정수 입력 끝

        // 2. 결과 출력
        if(count == 0)                                                      // 변수 count가 0이면, 즉 사용자가 입력한 정수가 0개이면
            System.out.println("입력된 수가 없습니다.");                       // System.out.println() 메소드 호출하여 문자열 "입력된 수가 없습니다." 출력, 즉 입력된 수 없음 안내 메세지 출력
        else {                                                              // 그렇지 않으면, 즉 사용자가 입력한 정수가 1개라도 있으면
            System.out.print("정수의 개수는 " + count + "개이며 ");            // System.out.print() 메소드 호출하여 문자열 "정수의 개수는 " + count + "개이며 " 출력, 즉 사용자가 입력한 정수 개수 출력
            System.out.println("평균은 " + (double)sum/count + "입니다.");    // System.out.println() 메소드 호출하여 문자열 "평균은 " + (double)sum/count + "입니다." 출력, 즉 사용자가 입력한 정수의 평균 출력
        }

        scanner.close();                                                    // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                                       // main() 메소드 정의 끝
}                                                                           // WhileSample 클래스 정의 끝