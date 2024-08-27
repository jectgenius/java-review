package com.sjr.exercise.example;                                       // 패키지 선언문

public class ForeachEx {                                                // ForeachEx 클래스 정의 시작
    enum Week {월, 화, 수, 목, 금, 토, 일}                                // Week enum 정의

    public static void main(String[] args) {                           // main() 메소드 정의 시작
        int [] n = {1, 2, 3, 4, 5};                                    // int형 배열 n 선언 동시에 초기화 블럭으로 1, 2, 3, 4, 5 직접 초기화한 배열 객체 생성하여 대입하여 초기화
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};  // String형 배열 names 선언 동시에 초기화 블럭으로 "사과", "배", "바나나", "체리", "딸기", "포도" 직접 초기화한 배열 객체 생성하여 대입하여 초기화

        int sum = 0;                                                    // int형 변수 sum 선언 동시에 0 대입하여 초기화, 즉 총합
        for(int k : n) {                                                // int형 변수 k에 n[0], n[1], n[2] ... n[4] 순서대로 대입
            System.out.print(k + " ");                                  // System.out.print() 메소드 호출하여 k 출력, 즉 배열 n의 요소 순서대로 모두 출력
            sum += k;                                                   // 변수 sum에 k 합함, 즉 배열 n의 요소 순서대로 모두 합함
        }                                                               // for-each문 끝
        System.out.println("합은 " + sum);                               // System.out.print() 메소드 호출하여 sum 출력, 즉 배열 n의 모든 요소의 총합 출력

        for(String s : names)                                           // String형 변수 s에 names[0], names[1] ... names[5] 순서대로 대입
            System.out.print(s + " ");                                  // System.out.print() 메소드 호출하여 s 출력, 즉 배열 names의 요소 순서대로 모두 출력
        System.out.println();                                           // System.out.println() 메소드 호출하여 줄바꿈

        for(Week day : Week.values())                                   // Week형 변수 day에 월, 화, 수 ... 일 순서대로 대입
            System.out.print(day + "요일 ");                             // System.out.println() 메소드 호출하여 day 출력, 즉 enum Week의 모든 값 출력
        System.out.println();                                           // System.out.println() 메소드 호출하여 줄바꿈
    }                                                                   // main() 메소드 정의 끝
}                                                                       // ForeachEx 클래스 정의 끝
