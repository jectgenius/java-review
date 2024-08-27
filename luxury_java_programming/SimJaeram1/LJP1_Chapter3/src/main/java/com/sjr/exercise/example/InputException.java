package com.sjr.exercise.example;                                       // 패키지 선언문

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {                                           // InputException 클래스 정의 시작
    public static void main(String[] args) {                            // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                       // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 로직
        // 1. 정수 3개 입력
        // 2. 합 연산
        System.out.println("정수 3개를 입력하세요");                        // System.out.println() 메소드 호출하여 문자열 "정수 3개를 입력하세요" 출력, 즉 입력 안내 메세지 출력

        int sum = 0, n = 0;                                             // int형 변수 sum 선언 동시에 0 대입하여 초기화, n 선언 동시에 0 대입하여 초기화, 즉 총합 / 사용자가 입력한 정수
        for(int i = 0; i < 3; i++) {                                    // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 3보다 작을 동안 반복, 즉 i에 +1
            System.out.print(i+">>");                                   // System.out.print() 메소드 호출하여 문자열 i+">>" 출력, 즉 프롬프트 출력
            try{
                n = scanner.nextInt();                                  // 변수 n에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 정수 입력
                sum += n;
            }
            catch(InputMismatchException e) {                           // InputMismatchException 예외가 발생한 경우 catch 블럭으로 분기
                System.out.println("정수가 아닙니다. 다시 입력하세요!");     // System.out.println() 메소드 호출하여 문자열 "정수가 아닙니다. 다시 입력하세요!" 출력, 즉 정수가 아님 안내 메세지 출력하여 예외 처리
                scanner.nextLine();                                     // 현재 입력 스트림에 남아 있는 토큰을 지움
                i--;                                                    // 인덱스 증가하지 않도록 미리 감소
                continue;                                               // 반복문을 빠져나가지 않으면서 다음 반복으로 진행
            }
        }                                                               // for문 끝

        // 3. 결과 출력
        System.out.println("합은 " + sum);                               // System.out.println() 메소드 호출하여 문자열 "합은 " + sum 출력, 즉 총합 연산 결과 출력

        scanner.close();                                                // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                                   // main() 메소드 정의 끝
}                                                                       // InputException 클래스 정의 끝
