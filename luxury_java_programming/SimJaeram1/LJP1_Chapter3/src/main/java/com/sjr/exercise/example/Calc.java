package com.sjr.exercise.example;                   // 패키지 선언문

public class Calc {                                 // Calc 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        // 변수 및 상수 선언
        double sum = 0.0;                           // double형 변수 sum 선언 동시에 0.0 대입하여 초기화

        // 로직
        // 1. 전달 받은 인자들을 숫자로 변환한 뒤 총합 연산
        for(int i = 0; i < args.length; i++)        // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 args의 크기 length보다 작을 동안 반복, i에 +1
            sum += Double.parseDouble(args[i]);     // 변수 sum에 Double 클래스의 parseDouble() 메소드 호출하여 배열 args의 인덱스 i번째 요소에 저장된 값 double형으로 리턴 받아 합함, 즉 main() 메소드로 전달 받은 인자의 총합 연산

        // 2. 결과 출력
        System.out.println("sum = " + sum);         // System.out.print() 메소드 호출하여 문자열 "sum = " + sum 출력, 즉 총합 sum 출력
    }                                               // main() 메소드 정의 끝
}                                                   // Calc 클래스 정의 끝
