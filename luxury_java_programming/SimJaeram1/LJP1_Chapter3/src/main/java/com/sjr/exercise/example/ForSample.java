package com.sjr.exercise.example;               // 패키지 선언문

public class ForSample {                        // ForSample 클래스 정의 시작
    public static void main(String[] args) {    // main() 메소드 정의 시작
        int sum = 0;                            // int형 변수 sum 선언 동시에 0 대입하여 초기화, 즉 총합

        // 로직
        // 1부터 10까지 정수의 총합
        for(int i = 1; i <= 10; i++) {          // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 10보다 작거나 같을 동안 반복, i에 +1
            sum += i;                           // 변수 sum에 i를 합함
            System.out.print(i);                // System.out.print() 메소드 호출하여 i 출력, 즉 더하는 수 출력

            if(i <= 9)                          // 만약 i에 저장된 값이 9보다 작거나 같으면
                System.out.print("+");          // System.out.print() 메소드 호출하여 문자열 "+" 출력, 즉 덧셈 기호 출력
            else {                              // 그렇지 않으면, 즉 i에 저장된 값이 9보다 크면
                System.out.print("=");          // System.out.print() 메소드 호출하여 문자열 "=" 출력, 즉 등호 기호 출력
                System.out.print(sum);          // System.out.print() 메소드 호출하여 sum 출력, 즉 연산 결과 출력
            }
        }
    }                                           // main() 메소드 정의 끝
}                                               // ForSample 클래스 정의 끝
