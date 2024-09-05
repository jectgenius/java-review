package com.sjr.exercise.practice;                          // 패키지 선언문

import java.util.Scanner;                                   // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch3_7 {                                        // Ch3_7 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);           // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int[] numbers = new int[10];                        // int형 배열 numbers 선언 동시에 크기가 10인 int형 배열 객체 생성하여 대입하여 초기화, 즉 사용자가 입력한 양의 정수 10개 저장 배열
        int sum = 0;                                        // int형 변수 sum 선언 동시에 0 대입하여 초기화, 즉 합
        double average;                                     // double형 변수 average 선언, 즉 평균

        // 로직
        // 1. 1 ~ 10 범위 정수 10개 랜덤 저장 및 배열 출력
        // 2. 합 연산
        System.out.print("랜덤한 정수들 : ");                 // System.out.print() 메소드 호출하여 문자열 "랜덤한 정수들 : " 출력, 즉 랜덤 정수 10개 출력
        for(int i = 0; i < numbers.length; i++) {           // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 numbers의 크기 length 보다 작으면 반복, i에 +1
            numbers[i] = (int)(Math.random() * 10 + 1);     // 배열 numbers의 인덱스 i번째 요소에 (int)(Math.random() * 10 + 1) 연산 결과 리턴 받아 대입하여 초기화, 즉 1 ~ 10 범위 랜덤 정수
            System.out.print(numbers[i] + " ");             // System.out.print() 메소드 호출하여 문자열 numbers[i] + " " 출력, 즉 배열 numbers의 인덱스 i번째 요소 출력
            sum += numbers[i];                              // 변수 sum에 배열 numbers의 인덱스 i번째 요소 합함, 즉 총합 연산
        }                                                   // for문 끝, 1 ~ 10 범위 정수 10개 랜덤 저장 및 배열 출력과 합 연산 완료
        System.out.println();                               // System.out.println() 메소드 호출하여 줄바꿈
        // 3. 평균 연산
        average = (double) sum / numbers.length;            // 변수 average에 (double) sum / numbers.length 연산 결과 리턴 받아 대입하여 초기화, 즉 평균 연산
        // 4. 결과 출력
        System.out.println("평균은 " + average);             // System.out.println() 메소드 호출하여 문자열 "평균은 " + average 출력, 즉 평균 연산 결과 출력

        scanner.close();                                    // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                       // main() 메소드 정의 끝
}                                                           // Ch3_7 클래스 정의 끝
