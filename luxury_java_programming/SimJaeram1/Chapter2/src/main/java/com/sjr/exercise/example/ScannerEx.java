package com.sjr.exercise.example;                                                       // 패키지 선언문

import java.util.Scanner;                                                               // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class ScannerEx {                                                                // ScannerEx 클래스 정의 시작
    public static void main(String[] args) {                                            // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                                       // Scanner 클래스형 레퍼런스 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입

        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");  // System.out.println() 메소드 호출하여 문자열 출력, 입력 안내 메세지 출력

        String name = scanner.next();                                                   // String형 레퍼런스 변수 name 선언 동시에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값 문자열로 리턴 받아 대입하여 초기화, 즉 이름
        System.out.print("이름은 " + name + ", ");                                       // System.out.print() 메소드 호출하여 이름 출력

        String city = scanner.next();                                                   // String형 레퍼런스 변수 city 선언 동시에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값 문자열로 리턴 받아 대입하여 초기화, 즉 도시
        System.out.print("도시는 " + city + ", ");                                       // System.out.print() 메소드 호출하여 도시 출력

        int age = scanner.nextInt();                                                    // int형 변수 age 선언 동시에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 정수로 리턴 받아 대입하여 초기화, 즉 나이
        System.out.print("나이는 " + age + ", ");                                        // System.out.print() 메소드 호출하여 나이 출력

        double weight = scanner.nextDouble();                                           // double형 변수 weight 선언 동시에 scanner 객체의 nextDouble() 메소드 호출하여 사용자로부터 입력 받은 값 실수로 리턴 받아 대입하여 초기화, 즉 체중
        System.out.print("체중은 " + weight + ", ");                                     // System.out.print() 메소드 호출하여 체중 출력

        boolean isSingle = scanner.nextBoolean();                                       // boolean형 변수 isSingle 선언 동시에 scanner 객체의 nextBoolean() 메소드 호출하여 사용자로부터 입력 받은 값 논리값로 리턴 받아 대입하여 초기화, 즉 독신 여부
        System.out.println("독신 여부는 " + isSingle + "입니다.");                         // System.out.println() 메소드 호출하여 독신 여부 출력

        scanner.close();                                                                // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용 종료
    }                                                                                   // main() 메소드 정의 시작
}                                                                                       // ScannerEx 클래스 정의 시작
