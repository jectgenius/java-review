package com.sjr.exercise.example;                                   // 패키지 선언문

import java.util.Scanner;                                           // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class CoffeePrice {                                          // CoffeePrice 클래스 정의 시작
    public static void main(String[] args) {                        // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                   // Scanner 클래스형 레퍼런스 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화

        // 커피 주문
        System.out.print("무슨 커피 드릴까요? ");                      // System.out.print() 메소드 호출하여 문자열 "무슨 커피 드릴까요? " 출력, 즉 커피 주문 입력 안내 메세지 출력
        String order = scanner.next();                              // String 클래스형 레퍼런스 변수 order 선언 동시에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값 문자열로 리턴 받아 대입하여 초기화, 즉 커피 주문
        int price = 0;                                              // int형 변수 price 선언 동시에 0 대입하여 초기화

        // 주문 가격 판별
        switch(order) {                                             // 변수 order에 저장된 값이, 즉 사용자라 주문한 커피가
            case "에스프레소":                                        // "에스프레소"인 경우
            case "카푸치노":                                          // "카푸치노"인 경우
            case "카페라떼":                                          // "카페라떼"인 경우
                price = 3500;                                       // 변수 price에 3500 대입
                break;                                              // switch문을 빠져나감
            case "아메리카노":                                        // "아메리카노"인 경우
                price = 2000;                                       // 변수 price에 2000 대입
                break;                                              // switch문을 빠져나감
            default:                                                // 어떤 case문으로도 분기 되지 않은 경우, 즉 사용자가 주문한 커피가 메뉴에 없는 경우
                System.out.println("메뉴에 없습니다!");                // System.out.println() 메소드 호출하여 문자열 "메뉴에 없습니다!" 출력, 즉 메뉴에 없음 안내 메세지 출력
        }                                                           // switch문 끝

        // 주문 가격 출력
        if(price != 0)                                              // 만약 변수 price에 저장된 값이 0이 아니면, 즉 사용자가 커피를 주문하여 주문 가격이 있으면
            System.out.print(order + "는 " + price + "원입니다");     // System.out.println() 메소드 호출하여 주문 가격 출력, 즉 주문 가격 안내 메세지 출력

        scanner.close();                                            // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용 종료
    }                                                               // main() 메소드 정의 끝
}                                                                   // CoffeePrice 클래스 정의 끝
