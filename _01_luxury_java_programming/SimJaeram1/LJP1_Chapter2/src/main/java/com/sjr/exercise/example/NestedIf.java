package com.sjr.exercise.example;                       // 패키지 선언문

import java.util.Scanner;                               // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class NestedIf {                                 // NestedIf 클래스 정의 시작
    public static void main(String[] args) {            // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);       // Scanner 클래스형 레퍼런스 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화

        // 점수 및 학년 입력
        System.out.print("점수를 입력하세요(0~100): ");    // System.out.print() 메소드 호출하여 문자열 "점수를 입력하세요(0~100): " 출력, 즉 점수 입력 안내 메세지 출력
        int score = scanner.nextInt();                  // int형 변수 score 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 정수로 리턴 받아 대입하여 초기화, 즉 점수
        System.out.print("학년을 입력하세요(1~4): ");      // System.out.print() 메소드 호출하여 문자열 "학년을 입력하세요(1~4): " 출력, 즉 학년 입력 안내 메세지 출력
        int year = scanner.nextInt();                   // int형 변수 year 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 정수로 리턴 받아 대입하여 초기화, 즉 학년

        // 합불 여부 판별
        if(score >= 60) {                               // 만약 변수 score에 저장된 값이 60보다 크거나 같으면, 즉 사용자가 입력한 점수가 60점 이상이면
            if(year != 4)                               // 만약 변수 year에 저장된 값이 4가 아니면, 즉 사용자가 입력한 학년이 4가 아니면
                System.out.println("합격!");             // System.out.print() 메소드 호출하여 문자열 "합격!" 출력, 즉 합격 결과 메세지 출력
            else if(score >= 70)                        // 그렇지 않고 만약 score에 저장된 값이 70보다 크거나 같으면, 즉 사용자가 입력한 학년이 4학년이고 점수가 70점 이상이면
                System.out.println("합격!");             // System.out.print() 메소드 호출하여 문자열 "합격!" 출력, 즉 합격 결과 메세지 출력
            else                                        // 그렇지 않으면, 즉 사용자가 입력한 학년이 4학년이고 점수는 60점 이상 70점 미만이면
                System.out.println("불합격!");           // System.out.print() 메소드 호출하여 문자열 "불합격!" 출력, 즉 불합격 결과 메세지 출력
        }
        else {                                          // 그렇지 않으면, 즉 사용자가 입력한 점수가 60점 미만이면
            System.out.println("불합격!");               // System.out.print() 메소드 호출하여 문자열 "불합격!" 출력, 즉 불합격 결과 메세지 출력
        }

        scanner.close();                                // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용 종료
    }                                                   // main() 메소드 정의 끝
}                                                       // NestedIf 클래스 정의 끝
