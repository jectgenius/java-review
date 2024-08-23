package com.sjr.exercise.example;                           // 패키지 선언문

import java.util.Scanner;                                   // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Grading {                                      // Grading 클래스 정의 시작
    public static void main(String[] arg) {                 // main() 메소드 정의 시작
        // 변수 선언
        char grade;                                         // char형 변수 grade 선언, 학점
        Scanner scanner = new Scanner(System.in);           // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 점수 입력 및 학점 판별
        System.out.print("점수를 입력하세요(0~100): ");        // System.out.print() 메소드 호출하여 문자열 "점수를 입력하세요(0~100): " 출력, 점수 입력 안내 메세지 출력
        int score = scanner.nextInt();                      // int형 변수 score 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 정수형으로 리턴 받아 대입하여 초기화, 점수 입력
        if(score >= 90)                                     // 만약 변수 score에 저장된 값이 90보다 크거나 같으면, 즉 사용자가 입력한 점수가 90점 이상이면
            grade = 'A';                                    // 변수 grade에 문자 'A' 대입하여 초기화, 즉 학점은 A
        else if(score >= 80)                                // 그렇지 않고 만약 변수 score에 저장된 값이 80보다 크거나 같으면, 즉 사용자가 입력한 점수가 80점 이상 90점 미만이면
            grade = 'B';                                    // 변수 grade에 문자 'B' 대입하여 초기화, 즉 학점은 B
        else if(score >= 70)                                // 그렇지 않고 만약 변수 score에 저장된 값이 70보다 크거나 같으면, 즉 사용자가 입력한 점수가 70점 이상 80점 미만이면
            grade = 'C';                                    // 변수 grade에 문자 'C' 대입하여 초기화, 즉 학점은 C
        else if(score >= 60)                                // 그렇지 않고 만약 변수 score에 저장된 값이 60보다 크거나 같으면, 즉 사용자가 입력한 점수가 60점 이상 70점 미만이면
            grade = 'D';                                    // 변수 grade에 문자 'D' 대입하여 초기화, 즉 학점은 D
        else                                                // 그렇지 않으면, 즉 사용자가 입력한 점수가 60점 미만이면
            grade = 'F';                                    // 변수 grade에 문자 'F' 대입하여 초기화, 즉 학점은 F

        // 학점 판별 결과 출력
        System.out.println("학점은 " + grade + "입니다.");    // System.out.println() 문자열 "학점은 " + grade + "입니다." 출력, 학점 안내 메세지 출력

        scanner.close();                                    // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                                       // main() 메소드 정의 끝
}                                                           // Grading 클래스 정의 끝
