package com.sjr.theory.check.time;                              // 패키지 선언문

public class P145_4_2 {                                         // P145_4_2 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        // 방법 2 배열 선언 동시에 초기화 블럭으로 값 대입하여 초기화
        // 배열 선언 및 생성 동시에 초기화
        int[][] intArray = {                                    // 2차원 int형 배열에 대한 레퍼런스 변수 intArray 선언 동시에 행의 크기가 4인 비정방형 배열 생성하여 대입 및 초기화 블럭으로 초기화
                {0, 1, 2, 3},
                {4},
                {5},
                {6, 7, 8, 9}
        };

        // 원소 출력
        for(int i = 0; i < intArray.length; i++) {              // int형 변수 i 선언 동시에 0 대입하여 초기화, i가 배열 intArray의 1차원 배열의 크기보다 작을 동안, 즉 행의 크기보다 작을 동안 반복, i에 +1
            for(int j = 0; j < intArray[i].length; j++) {       // int형 변수 j 선언 동시에 0 대입하여 초기화, j에 배열 intArray의 인덱스 i번째 요소에 저장된 1차원 배열의 크기보다 작을 동안, 즉 i번째 행의 열의 크기보다 작을 동안 반복, j에 +1
                System.out.print(intArray[i][j] + "\t");        // System.out.print() 메소드 호출하여 배열 intArray의 인덱스 i행 j열 요소 값 출력
            }                                                   // 한 행 출력 완료
            System.out.println();                               // System.out.println() 메소드 호출하여 줄바꿈
        }                                                       // 배열 모두 출력 완료

    }                                                           // main() 메소드 정의 끝
}                                                               // P145_4_2 클래스 정의 끝