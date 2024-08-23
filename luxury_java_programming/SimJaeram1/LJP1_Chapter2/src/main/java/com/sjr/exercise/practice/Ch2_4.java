package com.sjr.exercise.practice;                                              // 패키지 선언문

import java.util.Scanner;                                                       // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_4 {                                                            // Ch2_4 클래스 정의 시작
    public static void main(String[] args) {                                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                               // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int a, b, c;                                                            // int형 변수 a, b, c 선언, 정수 3개
        int median;                                                             // int형 변수 median 선언, 중간값

        // 로직
        // 1. 정수 3개 입력
        System.out.print("정수 3개 입력>>");                                      // System.out.print() 메소드 호출하여 문자열 "정수 3개 입력>>" 출력, 정수 3개 입력 안내 메세지 출력
        a = scanner.nextInt();                                                  // 변수 a에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입하여 초기화, 사용자가 입력한 정수
        b = scanner.nextInt();                                                  // 변수 b에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입하여 초기화, 사용자가 입력한 정수
        c = scanner.nextInt();                                                  // 변수 c에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 리턴 받아 대입하여 초기화, 사용자가 입력한 정수

        // 2. 중간값 판별
        // 3. 결과 출력
        // a가 중간값인 경우
        if (((b <= a) && (a <= c)) || ((c <= a) && (a <= b))) {                 // 만약 b가 a보다 작거나 같고 a가 c보다 작거나 같거나, c가 a보다 작거나 같고 a가 b보다 작거나 같으면
            median = a;                                                         // median에 a 대입하여 초기화, 중간값은 a
        }
        // b가 중간값인 경우
        else if (((a <= b) && (b <= c)) || ((c <= b) && (b <= a))) {            // 그렇지 않고 만약 a가 b보다 작거나 같고 b가 c보다 작거나 같거나, c가 b보다 작거나 같고 b가 a보다 작거나 같으면
            median = b;                                                         // median에 b 대입하여 초기화, 중간값은 b
        }
        // c가 중간값인 경우
        else {                                                                  // 그렇지 않으면
            median = c;                                                         // median에 c 대입하여 초기화, 중간값은 c
        }

        System.out.println("중간값은 " + median);                                // System.out.println() 메소드 호출하여 문자열 "중간값은 " + median 출력, 중간값 출력 안내 메세지 출력

        scanner.close();                                                        // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                                                           // main() 메소드 정의 끝
}                                                                               // Ch2_4 클래스 정의 끝
