package com.sjr.exercise.example;                       // 패키지 선언문

public class ReturnArray {                              // ReturnArray 클래스 정의 시작
    static int[] makeArray() {                          // makeArray() 메소드 정의 시작
        int[] temp = new int[4];                        // 1차원 int형 배열 temp 선언 동시에 크기가 4인 int형 배열 객체 생성하여 대입하여 초기화
        for(int i = 0; i < temp.length; i++)            // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 temp의 크기 length보다 작거나 같을 동안 반복, i에 +1
            temp[i] = i;                                // 배열 temp의 인덱스 i번째 요소에 i 대입하여 초기화
        return temp;                                    // 배열 temp 객체를 통째로 복사해서 리턴하는 것이 아니라, 레퍼런스 값만 복사해서 리턴
    }                                                   // makeArray() 메소드 정의 끝

    public static void main(String[] args) {            // main() 메소드 정의 시작
        int intArray[];                                 // 1차원 int형 배열 intArray 선언
        intArray = makeArray();                         // intArray에 makeArray() 메소드 호출하여 리턴 받은 값 대입하여 초기화, 즉 makeArray() 메소드 호출하여 생성한 배열 객체 대입
        for(int i = 0; i < intArray.length; i++)        // int형 변수 i에 0 대입하여 초기화, 반복제어변수 i가 배열 intArray의 크기 length보다 작거나 같을 동안 반복, i에 +1
            System.out.print(intArray[i] + " ");        // System.out.print() 메소드 호출하여 배열 intArray의 인덱스 i번째 요소 출력
    }                                                   // main() 메소드 정의 끝
}                                                       // ReturnArray 클래스 정의 끝
