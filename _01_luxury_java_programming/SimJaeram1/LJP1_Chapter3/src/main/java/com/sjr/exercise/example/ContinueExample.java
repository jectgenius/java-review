package com.sjr.exercise.example;                       // 패키지 선언문

import java.util.Scanner;                               // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ContinueExample {                          // ContinueExample 클래스 정의 시작
    public static void main(String[] args) {            // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);       // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 로직
        // 1. 정수 5개 입력
        // 2. 양수의 합 연산
        System.out.println("정수를 5개 입력하세요.");      // System.out.println() 메소드 호출하여 문자열 "정수를 5개 입력하세요." 출력, 즉 정수 입력 안내 메세지 출력

        int sum = 0;                                    // int형 변수 sum 선언 동시에 0 대입하여 초기화, 즉 양수의 합
        for(int i = 0; i < 5; i++) {                    // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 5보다 작거나 같을 동안 반복, i에 +1
            int n = scanner.nextInt();                  // int형 변수 n 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입, 즉 사용자가 입력한 정수
            if(n <= 0)                                  // 만약 n이 0보다 작거나 같으면, 즉 사용자가 입력한 정수가 양수가 아니면
                continue;                               // 반복문을 빠져나가지 않으면서 다음 반복으로 진행
            else                                        // 그렇지 않으면, 즉 사용자가 입력한 정수가 양수이면
                sum += n;                               // 변수 sum에 n을 합함, 즉 양수의 합 연산
        }                                               // for문 끝

        // 3. 결과 출력
        System.out.println("양수의 합은 " + sum);         // 사용자가 입력한 5개의 정수 중에서 양수의 합만 연산한 결과를 출력

        scanner.close();                                // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                   // main() 메소드 정의 끝
}                                                       // ContinueExample 클래스 정의 끝