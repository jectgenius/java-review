package com.sjr.exercise.practice;                              // 패키지 선언문

import java.util.Scanner;                                       // 다른 패키지의 클래스를 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_7 {                                            // Ch2_7 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);               // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int x1 = 100, y1 = 100, x2 = 200, y2 = 200;             // int형 변수 x1, y1, x2, y2 선언 동시에 100, 100, 200, 200 대입하여 초기화, 직사각형의 두 모서리 점 좌표
        int x, y;                                               // int형 변수 x, y 선언, 사용자가 입력한 점의 좌표
        boolean isIn = false;                                   // boolean형 변수 isIn 선언, 직사각형 내외부 여부

        // 로직
        // 1. 판별할 점 좌표 입력
        System.out.print("점 (x,y)의 좌표를 입력하시오>>");        // System.out.print() 메소드 호출하여 문자열 "점 (x,y)의 좌표를 입력하시오>>" 출력, 점 좌표 입력 안내 메세지 출력
        x = scanner.nextInt();                                  // 변수 x에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, x 좌표 입력
        y = scanner.nextInt();                                  // 변수 y에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, y 좌표 입력

        // 2. 내외부 여부 판별
        if ((x1 < x && x < x2) && (y1 < y && y < y2)) {         // 만약 x에 저장된 값이 x1보다 크고 x2보다 작고, y에 저장된 값이 y1보다 크고 y2보다 작으면, 즉 사용자가 입력한 점의 x,y 좌표가 직사각형 내부에 있으면
            isIn = true;                                        // isIn에 true 대입, 즉 사용자가 입력한 점은 직사각형 내부에 있다고 판별
        }

        // 3. 판별 결과 출력
        System.out.println("(" + x + "," + y + ")은 사각형 " + (isIn ? "안":"밖") + "에 있습니다.");   // System.out.println() 메소드 호출하여 문자열 "(" + x + "," + y + ")은 사각형 " + (isIn ? "안":"밖") + "에 있습니다." 출력, 즉 직사각형 내외부 판별 결과 출력

        scanner.close();                                        // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                                           // main() 메소드 정의 끝
}                                                               // Ch2_7 클래스 정의 끝
