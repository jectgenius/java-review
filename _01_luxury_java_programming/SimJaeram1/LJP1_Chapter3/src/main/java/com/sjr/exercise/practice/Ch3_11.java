package com.sjr.exercise.practice;                              // 패키지 선언문

public class Ch3_11 {                                           // Ch3_11 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        // 선언
        int sum = 0;                                            // int형 변수 sum 선언 동시에 0 대입하여 초기화, 즉 총합
        double average;                                         // double형 변수 average 선언, 즉 평균

        // 로직
        // 1. 명령행 인자에 값 전달
        // 2. 총합 연산
        for(int i = 0; i < args.length; i++) {                  // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 args의 크기 length 보다 작으면 반복, i에 +1
            sum += Integer.parseInt(args[i]);                   // 변수 sum에 Integer 클래스의 parseInt() 메소드 호출하여 배열 args의 인덱스 i번째 요소를 문자열에서 int형으로 변환하여 리턴 받은 값 합함, 즉 명령행 인자에 전달된 값 총합 연산
        }
        // 3. 평균 연산
        average = (double) sum / args.length;                   // 변수 average에 (double) sum / args.length 연산 결과 리턴 받아 대입하여 초기화, 즉 평균 연산
        // 4. 결과 출력
        System.out.println(average);                            // System.out.println() 메소드 호출하여 average 출력, 즉 평균 연산 결과 출력
    }                                                           // main() 메소드 정의 끝
}                                                               // Ch3_11 클래스 정의 끝
