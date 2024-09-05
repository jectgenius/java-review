package com.sjr.exercise.example;                                               // 패키지 선언문

public class NumException {                                                     // NumException 클래스 정의 시작
    public static void main(String[] args) {                                    // main() 메소드 정의 시작
        // 배열 선언 및 생성
        String[] stringNumber = {"23", "12", "3.141592", "998"};                // String형 배열 stringNumber 선언 동시에 초기화 블럭으로 직접 초기화한 배열 객체 생성하여 대입하여 초기화, 즉 정수로 변환할 문자열 배열

        // 변수 선언 및 생성
        int i = 0;                                                              // int형 변수 i 선언 동시에 0 대입하여 초기화, 즉 반복제어변수
        // 문자열을 정수로 변환한 뒤 출력
        try {
            for (i = 0; i < stringNumber.length; i++) {                         // 변수 i 선언 동시에 0 대입, 반복제어변수 i가 배열 stringNumber의 크기 length 보다 작을 동안 반복, i에 +1
                int j = Integer.parseInt(stringNumber[i]);                      // 변수 j 선언 동시에 Integer 클래스의 parseInt() 메소드 호출하여 배열 stringNumber의 인덱스 i번째 요소에 저장된 문자열을 정수로 변환한 뒤 리턴 받아 대입하여 초기화, 즉 변환한 정수
                System.out.println("정수로 변환된 값은 " + j);                     // System.out.println() 메소드 호출하여 문자열 "정수로 변환된 값은 " + j 출력, 즉 변환한 정수 출력
            }
        }
        catch (NumberFormatException e) {                                       // NumberFormatException 예외가 발생한 경우 catch 블럭으로 분기
            System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");  // System.out.println() 메소드 호출하여 문자열 stringNumber[i] + "는 정수로 변환할 수 없습니다." 출력, , 즉 변환 불가 안내 메세지 출력하여 예외 처리
        }
    }                                                                           // main() 메소드 정의 끝
}                                                                               // NumException 클래스 정의 끝
