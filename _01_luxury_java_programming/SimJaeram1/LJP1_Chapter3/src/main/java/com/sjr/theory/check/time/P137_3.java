package com.sjr.theory.check.time;                          // 패키지 선언문

public class P137_3 {                                       // P137_3 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작
        // 변수 및 상수 선언
        int[] intArray = new int[10];                       // int형 배열에 대한 레퍼런스 변수 intArray 선언 동시에 크기가 10인 int형 배열 생성하여 대입하여 초기화
        int sum = 0;                                        // int형 변수 sum 선언 동시에 0 대입하여 초기화, 즉 합

        // 로직
        // 1. 배열 원소 초기화
        // 2. 합 연산
        for(int i = 0; i < 10; i++) {                       // int형 변수 i 선언 동시에 0 대입하여 초기화, i가 10보다 작을 동안 반복, i에 +1
            intArray[i] = i + 1;                            // 배열 intArray의 인덱스 i 번째 원소에 i + 1 대입하여 초기화
            sum += intArray[i];                             // sum에 배열 intArray의 인덱스 i 번째 원소 합함
        }
        // 3. 결과 출력
        System.out.println("모든 원소의 합은 " + sum);        // System.out.println() 메소드 호출하여 문자열 "모든 원소의 합은 " + sum 출력, 즉 연산 결과 출력
    }                                                      // main() 메소드 정의 끝
}                                                          // P137_3 클래스 정의 끝