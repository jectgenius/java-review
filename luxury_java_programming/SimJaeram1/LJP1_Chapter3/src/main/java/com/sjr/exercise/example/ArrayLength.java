package com.sjr.exercise.example;                                       // 패키지 선언문

import java.util.Scanner;                                               // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ArrayLength {                                              // ArrayLength 클래스 정의 시작
    public static void main(String[] args) {                            // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                       // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int[] intArray = new int[5];                                    // int형 배열 intArray 선언 동시에 크기가 5인 int형 배열 객체 생성하여 대입하여 초기화, 즉 사용자가 입력한 정수 저장할 배열
        int sum = 0;                                                    // int형 변수 sum 선언 동시에 0 대입하여 초기화, 즉 총합

        // 로직
        // 1. 정수 입력
        // 2. 합 연산
        System.out.print(intArray.length + "개의 정수를 입력하세요>> ");   // System.out.print() 메소드 호출하여 문자열 intArray.length + "개의 정수를 입력하세요>> " 출력, 즉 배열의 크기 만큼 정수 입력 안내 메세지 출력
        for(int i = 0; i < intArray.length; i++) {                     // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i에 저장된 값이 배열 intArray의 크기 length보다 작을 동안 반복, i에 +1
            intArray[i] = scanner.nextInt();                           // 배열 intArray의 인덱스 i번째 요소에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 사용자가 입력한 정수를 배열에 저장
            sum += intArray[i];                                        // 변수 sum에 배열 intArray의 인덱스 i번째 요소 합함
        }                                                              // for문 끝

        // 3. 평균 연산 결과 출력
        System.out.print("평균은 " + (double)sum/intArray.length);      // System.out.print() 메소드 호출하여 문자열 "평균은 " + (double)sum/intArray.length 출력, 즉 사용자가 입력한 정수의 평균 출력

        scanner.close();                                               // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                                  // main() 메소드 정의 끝
}                                                                      // ArrayLength 클래스 정의 끝
