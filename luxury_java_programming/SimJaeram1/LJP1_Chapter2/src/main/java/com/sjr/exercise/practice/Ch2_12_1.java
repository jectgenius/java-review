package com.sjr.exercise.practice;                          // 패키지 선언문

import java.util.Scanner;                                   // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_12_1 {                                     // Ch2_12_1 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);           // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        double number1, number2, result;                    // double형 변수 number1, number2, result 선언, 즉 피연산자 2개와 결과값
        String operator;                                    // String형 변수 operator 선언

        // 로직
        // 1. 연산 입력
        System.out.print("연산>>");                          // System.out.print() 메소드 호출하여 문자열 "연산>>" 출력, 연산 입력 안내 메세지 출력
        number1 = scanner.nextDouble();                     // 변수 number1에 scanner 객체의 nextDouble() 메소드 호출하여 사용자로부터 입력 받은 값 double형으로 리턴 받아 대입하여 초기화, 즉 사용자로부터 피연산자 입력
        operator = scanner.next();                          // 변수 operator에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값 String형으로 리턴 받아 대입하여 초기화, 즉 사용자로부터 연산자 입력
        number2 = scanner.nextDouble();                     // 변수 number2에 scanner 객체의 nextDouble() 메소드 호출하여 사용자로부터 입력 받은 값 double형으로 리턴 받아 대입하여 초기화, 즉 사용자로부터 피연산자 입력
        // 2. 연산 종류 판별 및 계산
        if(operator.equals("+") == true) {                  // 변수 operator에 저장된 값이 equals() 메소드 호출하여 문자열 "+"과 같은지 비교한 결과가 true이면, 즉 사용자가 입력한 연산자가 +이면
            result = number1 + number2;                     // 변수 result에 number1 + number2 연산 결과 리턴 받아 대입하여 초기화, 즉 연산 결과
        }
        else if(operator.equals("-") == true) {             // 변수 operator에 저장된 값이 equals() 메소드 호출하여 문자열 "-"과 같은지 비교한 결과가 true이면, 즉 사용자가 입력한 연산자가 -이면
            result = number1 - number2;                     // 변수 result에 number1 - number2 연산 결과 리턴 받아 대입하여 초기화, 즉 연산 결과
        }
        else if(operator.equals("*") == true) {             // 변수 operator에 저장된 값이 equals() 메소드 호출하여 문자열 "*"과 같은지 비교한 결과가 true이면, 즉 사용자가 입력한 연산자가 *이면
            result = number1 * number2;                     // 변수 result에 number1 * number2 연산 결과 리턴 받아 대입하여 초기화, 즉 연산 결과
        }
        else if(operator.equals("/") == true) {             // 변수 operator에 저장된 값이 equals() 메소드 호출하여 문자열 "/"과 같은지 비교한 결과가 true이면, 즉 사용자가 입력한 연산자가 /이면
            if (number2 == 0) {                             // 만약 number2에 저장된 값이 0이면, 즉 사용자가 0으로 나누려고 하면
                System.out.println("0으로 나눌 수 없습니다."); // System.out.println() 메소드 호출하여 문자열 "0으로 나눌 수 없습니다." 출력, 즉 0으로 나눌 수 없음 안내 메세지 출력
                return;                                     // 프로그램 종료
            } else {                                        // 그렇지 않으면, 즉 사용자가 0이 아닌 수로 나누려고 하면
                result = number1 / number2;                 // 변수 result에 number1 / number2 연산 결과 리턴 받아 대입하여 초기화, 즉 연산 결과
            }
        }
        else {                                              // 그렇지 않으면, 즉 사용자가 입력한 연산 종류가 +, -, *, /가 아니면
            System.out.println("해당 연산은 할 수 없습니다.");  // System.out.println() 메소드 호출하여 문자열 "해당 연산은 할 수 없습니다." 출력, 즉 연산 불가 안내 메세지 출력
            return;                                         // 프로그램 종료
        }

        // 3. 결과 출력
        System.out.println(number1 + " " + operator + " " + number2 + " 의 계산 결과는 " + result);   // System.out.println() 메소드 호출하여 문자열 number1 + " " + operator + " " + number2 + " 의 계산 결과는 " + result 출력, 즉 연산 결과 메세지 출력

        scanner.close();                                    // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                                       // main() 메소드 정의 끝
}                                                           // Ch2_12_1 클래스 정의 끝
