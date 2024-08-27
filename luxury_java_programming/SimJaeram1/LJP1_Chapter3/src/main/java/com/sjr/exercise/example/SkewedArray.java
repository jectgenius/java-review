package com.sjr.exercise.example;                           // 패키지 선언문

public class SkewedArray {                                  // SkewedArray 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작
        // 배열 선언 및 생성
        int intArray[][] = new int[4][];                    // 2차원 int형 배열 intArray 선언 동시에 크기가 4인 1차원 int형 배열 생성하여 대입하여 초기화, 즉 행에 대한 배열 객체 생성
        intArray[0] = new int[3];                           // 배열 intArray의 인덱스 0번째 요소의 크기가 3인 1차원 int형 배열 생성하여 대입하여 초기화, 즉 열 배열 객체 생성
        intArray[1] = new int[2];                           // 배열 intArray의 인덱스 1번째 요소의 크기가 2인 1차원 int형 배열 생성하여 대입하여 초기화, 즉 열 배열 객체 생성
        intArray[2] = new int[3];                           // 배열 intArray의 인덱스 2번째 요소의 크기가 3인 1차원 int형 배열 생성하여 대입하여 초기화, 즉 열 배열 객체 생성
        intArray[3] = new int[2];                           // 배열 intArray의 인덱스 3번째 요소의 크기가 2인 1차원 int형 배열 생성하여 대입하여 초기화, 즉 열 배열 객체 생성

        // 배열 요소 초기화 및 값 출력
        for(int i = 0; i < intArray.length; i++) {          // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 intArray의 크기 length보다 작거나 같을 동안 반복, i에 +1
            for (int j = 0; j < intArray[i].length; j++) {  // int형 변수 j 선언 동시에 0 대입하여 초기화, 반복제어변수 j가 배열 intArray의 인덱스 i번째 행의 크기 length보다 작거나 같을 동안 반복, j에 +1
                intArray[i][j] = (i + 1) * 10 + j;          // 배열 intArray의 인덱스 i행 j열의 요소에 (i + 1) * 10 + j 연산 결과 리턴 받아 대입하여 초기화
                System.out.print(intArray[i][j] + " ");     // System.out.print() 메소드 호출하여 배열 intArray의 인덱스 i행 j열의 요소 출력
            }                                               // 한 행 출력 완료, 안쪽 for문 끝
            System.out.println();                           // System.out.println() 메소드 호출하여 줄바꿈
        }                                                   // 모든 요소 출력 완료, 바깥쪽 for문 끝

    }                                                       // main() 메소드 정의 끝
}                                                           // SkewedArray 클래스 정의 끝