package com.sjr.exercise.example;                           // 패키지 선언문

import java.util.Scanner;                                   // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class BreakExample {                                 // BreakExample 클래스 정의 시작
    public static void main(String[] args) {                // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);           // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        System.out.println("exit을 입력하면 종료합니다.");      // System.out.println() 메소드 호출하여 문자열 "exit을 입력하면 종료합니다." 출력, 즉 종료 안내 메세지 출력
        while(true) {                                       // 무한반복
            System.out.print(">>");                         // System.out.print() 메소드 호출하여 문자열 ">>" 출력, 즉 입력 프롬프트 출력
            String text = scanner.nextLine();               // String형 변수 text 선언 동시에 scanner 객체의 nextLine() 메소드 호출하여 사용자로부터 입력 받은 값 한 줄로 읽어들인뒤 String형으로 리턴하여 대입하여 초기화, 즉 사용자가 입력한 문자열
            if(text.equals("exit"))                         // 만약 text가 "exit"이면, 즉 사용자가 입력한 문자열이 "exit"이면
                break;                                      // 무한반복문을 빠져나감
        }                                                   // while문 끝

        System.out.println("종료합니다...");                  // System.out.println() 메소드 호출하여 문자열 "종료합니다..." 출력, 즉 종료 안내 메세지 출력

        scanner.close();                                    // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                       // main() 메소드 정의 끝
}                                                           // BreakExample 클래스 정의 끝
