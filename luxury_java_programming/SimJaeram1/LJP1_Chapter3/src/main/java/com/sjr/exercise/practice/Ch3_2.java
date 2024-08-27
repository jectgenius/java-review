package com.sjr.exercise.practice;              // 패키지 선언문

public class Ch3_2 {                            // Ch3_2 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        // 배열
        int n [][] = {                          // int형 2차원 배열 n 선언 동시에 초기화 블럭으로 직접 초기화한 배열 객체 생성하여 대입하여 초기화, 즉 비정방형 배열 생성
                {1},
                {1, 2, 3},
                {1},
                {1, 2, 3, 4},
                {1, 2}
        };

        // 로직
        // 1. 행 출력
        // 2. 열 출력
        for(int i = 0; i < n.length; i++) {     // int형 배열 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 n의 크기 length보다 작을 동안 반복, i에 +1
            for(int j = 0; j < n[i].length; j++) { // int형 배열 j 선언 동시에 0 대입하여 초기화, 반복제어변수 j가 배열 n의 인덱스 i번째 행의 j번째 요소의 크기 length보다 작을 동안 반복, j에 +1
                System.out.print(n[i][j] + "\t");// System.out.print() 메소드 호출하여 배열 n의 인덱스 i행 j열의 요소 출력
            }                                    // 한 행 출력 완료, 안쪽 for문 끝
            System.out.println();                // System.out.println() 메소드 호출하여 줄바꿈
        }                                        // 배열 모두 출력 완료, 바깥쪽 for문 끝
    }                                           // main() 메소드 정의 끝
}                                               // Ch3_2 클래스 정의 끝
