package com.sjr.exercise.practice;                                  // 패키지 선언문

public class Ch3_9 {                                                // Ch3_9 클래스 정의 시작
    public static void main(String[] args) {                        // main() 메소드 정의 시작
        // 선언
        int[][] numbers = new int[4][4];                            // int형 배열 numbers 선언 동시에 크기가 4 x 4인 int형 배열 객체 생성하여 대입하여 초기화, 즉 난수 저장할 배열

        // 로직
        // 1. 난수 발생 및 배열에 저장
        // 2. 배열 출력
        for(int i = 0; i < numbers.length; i++) {                   // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 numbers의 크기 length 보다 작으면 반복, i에 +1
            for(int j = 0; j < numbers.length; j++) {               // int형 변수 j 선언 동시에 0 대입하여 초기화, 반복제어변수 j가 배열 numbers의 크기 length 보다 작으면 반복, j에 +1
                numbers[i][j] = (int) (Math.random() * 10 + 1);     // 배열 numbers 인덱스 i번째행 j번째열 요소에 (int) (Math.random() * 10 + 1) 연산 결과 리턴 받아 대입하여 초기화
                System.out.print(numbers[i][j] + "\t");             // System.out.print() 메소드 호출하여 문자열 numbers[i][j] + "\t" 출력, 즉 배열 numbers 인덱스 i번째행 j번째열 요소 출력
            }                                                       // 한 행 요소 모두 출력 완료, 안쪽 for문 끝
            System.out.println();                                   // System.out.println() 메소드 호출하여 줄바꿈
        }                                                           // 전체 배열 요소 모두 출력 완료, 바깥쪽 for문 끝
    }                                                               // main() 메소드 정의 끝
}                                                                   // Ch3_9 클래스 정의 끝
