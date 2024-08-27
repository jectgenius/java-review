package com.sjr.exercise.example;                                                   // 패키지 선언문

public class ArrayException {                                                       // ArrayException 클래스 정의 시작
    public static void main(String[] args) {                                        // main() 메소드 정의 시작
        // 배열 선언 및 생성
        int[] intArray = new int[5];                                                // int형 배열 intArray 선언 동시에 크기가 5인 int형 배열 객체 생성하여 대입하여 초기화
        intArray[0] = 0;                                                            // 배열 intArray의 인덱스 0번째 요소에 0 대입하여 초기화

        try {
            for(int i = 0; i < 5; i++) {                                            // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 5보다 작을 동안 반복, i에 +1
                intArray[i+1] = i+1 + intArray[i];                                  // 배열 intArray의 인덱스 i+1번째 요소에 i+1 + intArray[i] 연산 결과 리턴 받아 대입하여 초기화
                System.out.println("intArray[" + i + "]" + " = " + intArray[i]);   // System.out.println() 메소드 호출하여 문자열 "intArray[}" + i + "]" + " = " + intArray[i] 출력, 즉 배열의 요소 출력
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {                                   // ArrayIndexOutOfBoundsException 예외가 발생한 경우 catch 블럭으로 분기
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");                   // System.out.println() 메소드 호출하여 문자열 "배열의 인덱스가 범위를 벗어났습니다." 출력, 즉 배열의 인덱스가 범위를 벗어났습니다. 안내 메세지 출력하여 예외 처리
        }
    }                                                                               // main() 메소드 정의 끝
}                                                                                   // ArrayException 클래스 정의 끝
