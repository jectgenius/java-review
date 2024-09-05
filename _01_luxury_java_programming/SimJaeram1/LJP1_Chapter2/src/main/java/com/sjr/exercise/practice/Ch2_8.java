package com.sjr.exercise.practice;                                                      // 패키지 선언문

import java.util.Scanner;                                                               // 다른 패키지의 클래스를 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_8 {                                                                    // Ch2_8 클래스 정의 시작
    public static void main(String[] args) {                                            // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                                       // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int x1, y1, x2, y2;                                                             // 사용자로부터 입력 받은 사각형의 두 점의 좌표
        int rectangleX1 = 100, rectangleY1 = 100, rectangleX2 = 200, rectangleY2 = 200; // 충돌 판단할 직사각형의 두 점의 좌표
        boolean isConflicted;                                                           // boolean형 변수 iisConflicted 선언, 즉 충돌 여부

        // 로직
        // 1. 충돌 판단할 직사각형의 두 점 좌표 입력
        System.out.print("점 (x1, y1), (x2, y2)를 입력하시오>> ");                        // System.out.print() 메소드 호출하여 문자열 "점 (x1, y1), (x2, y2)를 입력하시오>> " 출력, 입력 안내 메세지 출력
        x1 = scanner.nextInt();                                                        // 변수 x1에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, x1 좌표
        y1 = scanner.nextInt();                                                        // 변수 y1에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, y1 좌표
        x2 = scanner.nextInt();                                                        // 변수 x2에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, x2 좌표
        y2 = scanner.nextInt();                                                        // 변수 y2에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, y2 좌표

        // 2. 충돌 판단
        // 입력 받은 사각형의 두 점의
        // 1. x좌표가 모두 사각형의 왼쪽에 있거나 2. 오른쪽에 있거나 3. y좌표가 모두 사각형의 아래쪽에 있거나 4. 위쪽에 있거나
        if((x1 < rectangleX1 && x2 < rectangleX1) || (x1 > rectangleX2 && x2 > rectangleX2) || (y1 < rectangleY1 && y2 < rectangleY1) || (y1 > rectangleY2 && y2 > rectangleY2))
            isConflicted = false;                                                       // isConflicted에 false 대입, 즉 충돌함
        else
            isConflicted = true;                                                        // isConflicted에 false 대입, 즉 충돌하지 않음

        // 3. 결과 출력
        System.out.println(isConflicted ? "충돌합니다." : "충돌 하지 않습니다.");            // System.out.println() 메소드 호출하여 문자열 isConflicted ? "충돌합니다." : "충돌 하지 않습니다." 출력, 즉 충돌 판별 결과 메세지 출력

        scanner.close();                                                                // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                                                                   // main() 메소드 정의 끝
}                                                                                       // Ch2_8 클래스 정의 끝
