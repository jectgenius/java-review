package com.sjr.theory.check.time;                  // 패키지 선언문

public class P149_3 {                               // P149_3 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        for(int i = 0; i < args.length; i++) {      // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 args의 크기보다 작을 동안 반복, i에 +1
            System.out.print(args[i] + "\t");       // System.out.print() 메소드 호출하여 배열 args의 인덱스 i번째 요소 출력
        }                                           // 배열 args의 모든 요소 출력
    }                                               // main() 메소드 정의 끝
}                                                   // P149_3 클래스 정의 시작
