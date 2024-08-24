package com.sjr.exercise.practice;                              // 패키지 선언문

import java.util.Scanner;                                       // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch2_10 {                                           // Ch2_10 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);               // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 변수 및 상수 선언
        int ox1, oy1, radius1, ox2, oy2, radius2;               // int형 변수 ox1, oy1, radius1, ox2, oy2, radius2 선언, 즉 원 2개의 중심의 x, y 좌표, 반지름
        double distance;                                        // int형 변수 distance 선언, 즉 두 원의 중심 사이의 거리
        boolean isOverlap = false;                              // boolean형 변수 isOverlap 선언 동시에 false 대입하여 초기화, 즉 두 원의 겹침 여부

        // 로직
        // 1. 첫번째 원 입력
        System.out.print("첫번째 원의 중심과 반지름 입력>>");        // System.out.print() 메소드 호출하여 문자열 "첫번째 원의 중심과 반지름 입력>>" 출력, 첫번째 원의 중심과 반지름 입력 안내 메세지 출력
        ox1 = scanner.nextInt();                                // 변수 ox1에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 첫번째 원 중심의 x 좌표
        oy1 = scanner.nextInt();                                // 변수 oy1에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 첫번째 원 중심의 y 좌표
        radius1 = scanner.nextInt();                            // 변수 radius1에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 첫번째 원의 반지름
        // 2. 두번째 원 입력
        System.out.print("두번째 원의 중심과 반지름 입력>>");        // System.out.print() 메소드 호출하여 문자열 "두번째 원의 중심과 반지름 입력>>" 출력, 두번째 원의 중심과 반지름 입력 안내 메세지 출력
        ox2 = scanner.nextInt();                                // 변수 ox2에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 두번째 원 중심의 x 좌표
        oy2 = scanner.nextInt();                                // 변수 oy2에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 두번째 원 중심의 y 좌표
        radius2 = scanner.nextInt();                            // 변수 radius2에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 두번째 원의 반지름
        // 3. 두 원의 중심 사이의 거리 계산
        distance = Math.sqrt((ox1 - ox2) * (ox1 - ox2) + (oy1 - oy2) * (oy1 - oy2)); // distance에 Math.sqrt((ox1 - ox2) * (ox1 - ox2) + (oy1 - oy2) * (oy1 - oy2))에 연산 결과 리턴 받아 대입하여 초기화, 두 원의 중심 사이의 거리
        // 4. 겹치는지 판별
        if (distance <= radius1 + radius2) {                    // 만약 distance에 저장된 값이 radius1 + radius2 보다 작거나 같으면, 즉 두 원의 중심 사이의 거리가 두 원의 반지름의 합보다 작거나 같으면
            isOverlap = true;                                   // isOverlap에 true 대입, 즉 두 원은 서로 겹침
        }
        // 5. 결과 출력
        System.out.println("두 원은 서로 " + (isOverlap ? "겹친다.":"겹치지 않는다."));   // System.out.println() 메소드 호출하여 문자열 "두 원은 서로 " + (isOverlap ? "겹친다.":"겹치지 않는다.") 출력, 즉 두 원 겹침 판별 여부 결과 출력

        scanner.close();                                        // scanner 객체의 close() 메소드 호출하여 객체 닫기, 사용종료
    }                                                           // main() 메소드 정의 끝
}                                                               // Ch2_10 클래스 정의 끝
