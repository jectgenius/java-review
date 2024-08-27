package com.sjr.exercise.example;               // 패키지 선언문

public class DoWhileSample {                    // DoWhileSample 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        char c = 'a';                           // char형 변수 c 선언 동시에 문자 'a' 대입하여 초기화, 즉 c는 'a'

        do {
            System.out.print(c);                // System.out.print() 메소드 호출하여 변수 c에 저장된 값 출력
            c = (char) (c + 1);                 // 변수 c에 (char) (c + 1) 연산 결과 리턴 받아 대입, 즉 알파벳 a부터 하나씩 증가
        } while(c <= 'z');                      // 변수 c에 저장된 값이 문자 'z' 보다 작거나 같을 동안 반복
    }                                           // main() 메소드 정의 끝
}                                               // DoWhileSample 클래스 정의 끝
