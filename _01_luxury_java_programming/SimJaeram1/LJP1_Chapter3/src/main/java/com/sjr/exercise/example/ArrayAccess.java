package com.sjr.exercise.example;                               // 패키지 선언문

import java.util.Scanner;                                       // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ArrayAccess {                                      // ArrayAccess 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);               // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 배열 선언 및 생성
        int intArray[] = new int[5];                            // int형 배열에 대한 레퍼런스 변수 intArray 선언 동시에 크기가 5인 int형 배열 객체 생성하여 대입하여 초기화, 즉 양수 5개 저장할 배열

        // 로직
        // 1. 양수 5개 입력
        // 2. 최댓값 찾기
        int max = 0;                                            // int형 변수 max 선언 동시에 0 대입하여 초기화
                                                                // 최댓값 수월하게 찾기 위해 입력한 정수의 부호를 양수로 제한함, 만약 모두 음수만 입력한 경우 최댓값이 0인 논리 오류가 발생할 수 있으므로
        System.out.println("양수 5개를 입력하세요.");              // System.out.println() 메소드 호출하여 문자열 "양수 5개를 입력하세요." 출력, 즉 양수 입력 안내 메세지 출력
        for(int i = 0; i < 5; i++) {                            // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 5보다 작을 동안 반복, i에 +1
            intArray[i] = scanner.nextInt();                    // intArray의 인덱스 i번째 요소에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 배열에 사용자가 입력한 양수 저장
            if(intArray[i] > max)                               // 만약 배열 intArray의 인덱스 i번째 요소에 저장된 값이 max보다 크면
                max = intArray[i];                              // 변수 max에 배열 intArray의 인덱스 i번째 요소에 저장된 값 대입, 즉 최댓값 갱신
        }                                                       // for문 끝

        // 3. 최댓값 출력
        System.out.println("가장 큰 수는 " + max + "입니다.");     // System.out.println() 메소드 호출하여 문자열 "가장 큰 수는 " + max + "입니다." 출력, 즉 최댓값 입력 안내 메세지 출력

        scanner.close();                                        // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                           // main() 메소드 정의 끝
}                                                               // ArrayAccess 클래스 정의 끝
