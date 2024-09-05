package com.sjr.exercise.example;                                   // 패키지 선언문

public class ScoreAverage {                                         // ScoreAverage 클래스 정의 시작
    public static void main(String[] args) {                        // main() 메소드 정의 시작
        // 배열 선언 및 생성
        double score[][] = {{3.3, 3.4},                             // double형 2차원 배열 score 선언 동시에 초기화 블럭으로 직접 초기화한 배열 객체 생성하여 대입하여 초기화, 즉 4년 학기별 성적 저장
                            {3.5, 3.6},
                            {3.7, 4.0},
                            {4.1, 4.2}};
        // 변수 및 상수 선언
        double sum = 0;                                             // double형 변수 sum 선언 동시에 0 대입하여 초기화, 즉 총합

        // 로직
        // 1. 학기별 평점 총합 연산
        // 2. 평점 평균 연산 및 결과 출력
        for(int year = 0; year < score.length; year++)              // int형 변수 year 선언 동시에 0 대입하여 초기화, 반복제어변수 year가 배열 score의 크기 length 즉 행의 크기보다 작을 동안 반복, year에 +1
            for(int term = 0; term < score[year].length; term++)    // int형 변수 term 선언 동시에 0 대입하여 초기화, 반복제어변수 term이 배열 score의 인덱스 year번째 행의 크기 length 즉 열의 크기보다 작을동안 반복, term에 +1
                sum += score[year][term];                           // 변수 sum에 인덱스 year행 term열 요소에 저장된 값 합함

        int n = score.length;                                       // int형 변수 n 선언 동시에 배열 score의 크기 length 대입하여 초기화, 즉 행의 크기
        int m = score[0].length;                                    // int형 변수 m 선언 동시에 배열 score의 0번째 행의 크기 length 대입하여 초기화, 즉 열의 크기

        System.out.println("4년 전체 평점 평균은 " + sum/(n*m));       // System.out.println() 메소드 호출하여 문자열 "4년 전체 평점 평균은 " + sum/(n*m) 출력, 즉 4년 전체 평점 평균 연산 결과 출력
    }                                                               // main() 메소드 정의 끝
}                                                                   // ScoreAverage 클래스 정의 끝
