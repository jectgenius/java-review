package com.sjr.exercise.example;                                   // 패키지 선언문

public class NestedLoop {                                           // NestedLoop 클래스 정의 시작
    public static void main(String[] args) {                        // main() 메소드 정의 시작
        for(int i = 1; i < 10; i++) {                               // int형 변수 i 선언 동시에 1 대입하여 초기화, 반복제어변수 i가 10보다 작을 동안 반복, i에 +1
            for(int j = 1; j < 10; j++) {                           // int형 변수 j 선언 동시에 1 대입하여 초기화, 반복제어변수 j가 10보다 작을 동안 반복, j에 +1
                System.out.print(i + "*" + j + "=" + i*j);          // System.out.print() 메소드 호출하여 문자열 i + "*" + j + "=" + i+j 출력, 즉 구구단 1개 출력
                System.out.print('\t');                             // System.out.print() 메소드 호출하여 탭 출력
            }                                                       // 안쪽 for문 끝, 즉 구구단 한 단 출력 완료
            System.out.println();                                   // System.out.print() 메소드 호출하여 줄바꿈
        }                                                           // 바깥쪽 for문 끝, 즉 구구단 모두 출력 완료
    }                                                               // main() 메소드 정의 끝
}                                                                   // NestedLoop 클래스 정의 끝
