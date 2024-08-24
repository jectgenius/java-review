package com.sjr.exercise.practice;                          // 패키지 선언문

import java.util.Scanner;                                   // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_9 {                                        // Ch2_9 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);           // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        double ox, oy, radius;                              // double형 변수 ox, oy, radius 선언, 원의 중심의 x, y 좌표 및 반지름
        double x, y;                                        // double형 변수 x, y 선언, 내외부 판별할 점의 x, y 좌표
        double d;                                           // double형 변수 d 선언, 원의 중심과 판별한 점 사이의 거리의 제곱
        boolean isIn = false;                               // boolean형 변수 isIn 선언 동시에 false 대입하여 초기화, 원 내외부 여부

        // 로직
        // 1. 원의 중심 좌표 및 반지름 입력
        System.out.print("원의 중심과 반지름 입력>>");          // System.out.print() 메소드 호출하여 문자열 "원의 중심과 반지름 입력>>" 출력, 원의 중심과 반지름 입력 안내 메세지 출력
        ox = scanner.nextDouble();                          // 변수 ox에 scanner 객체의 nextDouble() 메소드 호출하여 사용자로부터 입력 받은 값 double형으로 리턴 받아 대입하여 초기화, 원 중심의 x 좌표
        oy = scanner.nextDouble();                          // 변수 oy에 scanner 객체의 nextDouble() 메소드 호출하여 사용자로부터 입력 받은 값 double형으로 리턴 받아 대입하여 초기화, 원 중심의 y 좌표
        radius = scanner.nextDouble();                      // 변수 radius에 scanner 객체의 nextDouble() 메소드 호출하여 사용자로부터 입력 받은 값 double형으로 리턴 받아 대입하여 초기화, 원의 반지름

        // 2. 한 점의 좌표 입력
        System.out.print("점 입력>>");                       // System.out.print() 메소드 호출하여 문자열 "점 입력>>" 출력, 점 입력 안내 메세지 출력
        x = scanner.nextDouble();                           // 변수 x에 scanner 객체의 nextDouble() 메소드 호출하여 사용자로부터 입력 받은 값 double형으로 리턴 받아 대입하여 초기화, x 좌표
        y = scanner.nextDouble();                           // 변수 y에 scanner 객체의 nextDouble() 메소드 호출하여 사용자로부터 입력 받은 값 double형으로 리턴 받아 대입하여 초기화, y 좌표

        // 3. 두 점 사이의 거리의 제곱 계산
        d = Math.sqrt((ox - x) * (ox - x) + (oy - y) * (oy - y));                           // 변수 d에 Math.sqrt((ox - x) * (ox - x) + (oy - y) * (oy - y)) 연산 결과 리턴 받아 대입하여 초기화, 원의 중심과 한 점 사이의 거리의

        // 4. 점 내외부 판별
        if(d <= radius) {                                   // 만약 d에 저장된 값이 radius 보다 작거나 같으면, 즉 원의 중심과 한 점 사이의 거리가 원의 반지름보다 작거나 같으면
            isIn = true;                                    // isIn에 true 대입, 즉 점은 원 내부에 있다
        }

        // 5. 판별 결과 출력
        System.out.println("점 (" + x + ", " + y + ")는 원 " + (isIn?"안":"밖") + "에 있다."); // System.out.println() 메소드 호출하여 문자열 "점 (" + x + ", " + y + ")는 원 " + (isIn?"안":"밖") + "에 있다." 출력, 즉 내외부 판별 결과 출력

        scanner.close();                                    // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                                       // main() 메소드 정의 끝
}                                                           // Ch2_9 클래스 정의 끝
