package com.sjr.exercise.practice;                              // 패키지 선언문

import java.util.Scanner;                                       // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch3_5 {                                            // Ch3_5 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);               // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int[] numbers = new int[10];                            // int형 배열 numbers 선언 동시에 크기가 10인 int형 배열 객체 생성하여 대입하여 초기화, 즉 사용자가 입력한 양의 정수 10개 저장 배열

        // 로직
        // 1. 양의 정수 10개 입력 및 배열에 저장
        System.out.print("양의 정수 10개를 입력하시오>>");          // System.out.print() 메소드 호출하여 문자열 "양의 정수 10개를 입력하시오>>" 출력, 즉 양의 정수 10개 입력 안내 메세지 출력
        for(int i = 0; i < numbers.length; i++) {               // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 numbers의 크기 length 보다 작으면 반복, i에 +1
            numbers[i] = scanner.nextInt();                     // 배열 numbers의 인덱스 i번째 요소에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 사용자가 입력한 양의 정수 저장
        }                                                       // for문 끝, 즉 양의 정수 10개 입력 및 저장 완료

        // 2. 3의 배수 출력
        System.out.print("3의 배수는 ");                         // System.out.print() 메소드 호출하여 문자열 "3의 배수는 " 출력, 즉 3의 배수 안내 메세지 출력
        for(int i = 0; i < numbers.length; i++) {               // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 numbers의 크기 length 보다 작으면 반복, i에 +1
            if(numbers[i] % 3 == 0) {                           // 만약 배열 numbers의 인덱스 i번째 요소 값을 3으로 나눈 나머지가 0이면, 즉 3의 배수이면
                System.out.print(numbers[i] + " ");             // System.out.print() 메소드 호출하여 배열 numbers 요소 중 3의 배수만 출력
            }
            else {                                              // 그렇지 않으면, 즉 3의 배수가 아니면
                continue;                                       // 반복문을 빠져나가지 않으면서 다음 반복으로 넘어감, 즉 반복 후 작업문으로 분기
            }
        }                                                       // for문 끝, 3의 배수 모두 출력 완료

        scanner.close();                                        // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                           // main() 메소드 정의 끝
}                                                               // Ch3_5 클래스 정의 끝
