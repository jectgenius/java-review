package com.sjr.theory.practice;              // 패키지 선언문

public class P162_9 {                        // P162_9 클래스 정의 시작
    public static void main(String[] args) { // main() 메소드 정의 시작
        int myArray[] = new int[2];          // int형 배열 myArray 선언 동시에 크기가 2인 int형 배열 생성하여 대입하여 초기화
        myArray[0] = 1;                      // 이 부분에서 컴파일 오류 발생
        myArray[1] = myArray[0] + 1;
    }                                        // main() 메소드 정의 끝
}                                            // P162_9 클래스 정의 끝
