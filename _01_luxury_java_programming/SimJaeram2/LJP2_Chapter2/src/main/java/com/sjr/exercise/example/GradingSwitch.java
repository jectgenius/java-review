package com.sjr.exercise.example;                           // 패키지 선언문

import java.util.Scanner;                                   // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class GradingSwitch {                                // GradingSwitch 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);           // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 선언 및 점수 입력
        char grade;                                         // char형 변수 grade 선언, 학점
        System.out.print("점수를 입력하세요(0~100): ");        // System.out.print() 메소드 호출하여 문자열 "점수를 입력하세요(0~100): " 출력, 점수 입력 안내 메세지 출력
        int score = scanner.nextInt();                      // int형 변수 score 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 정수형으로 리턴 받아 대입하여 초기화, 점수 입력

        // 학점 판별
        switch(score/10) {                                  // 변수 score에 저장된 값을 10으로 나눈 연산 결과가
            case 10:                                        // 10인 경우, 즉 사용자가 입력한 점수가 100점인 경우
            case 9:                                         // 9인 경우, 즉 사용자가 입력한 점수가 90점대인 경우
                grade = 'A';                                // 변수 grade에 문자 'A' 대입하여 초기화, 즉 학점은 A
                break;                                      // switch문을 빠져나감
            case 8:                                         // 8인 경우, 즉 사용자가 입력한 점수가 80점대인 경우
                grade = 'B';                                // 변수 grade에 문자 'B' 대입하여 초기화, 즉 학점은 B
                break;                                      // switch문을 빠져나감
            case 7:                                         // 7인 경우, 즉 사용자가 입력한 점수가 70점대인 경우
                grade = 'C';                                // 변수 grade에 문자 'C' 대입하여 초기화, 즉 학점은 C
                break;                                      // switch문을 빠져나감
            case 6:                                         // 6인 경우, 즉 사용자가 입력한 점수가 60점대인 경우
                grade = 'D';                                // 변수 grade에 문자 'D' 대입하여 초기화, 즉 학점은 D
                break;                                      // switch문을 빠져나감
            default:                                        // 어떤 case에도 해당되지 않는 경우
                grade = 'F';                                // 변수 grade에 문자 'F' 대입하여 초기화, 즉 학점은 F
        }                                                   // switch문 끝

        // 학점 판별 결과 출력
        System.out.println("학점은 " + grade + "입니다.");    // System.out.println() 문자열 "학점은 " + grade + "입니다." 출력, 학점 안내 메세지 출력

        scanner.close();                                    // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                                       // main() 메소드 정의 끝
}                                                           // GradingSwitch 클래스 정의 끝
