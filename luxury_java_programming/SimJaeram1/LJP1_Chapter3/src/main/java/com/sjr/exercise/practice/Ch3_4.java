package com.sjr.exercise.practice;

import java.util.Scanner;

public class Ch3_4 {
    public static void main(String[] args) {    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);// Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 선언
        String str;

        // 로직
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        str = scanner.next();

        for(char s = str.charAt(0); s >= 'a'; s--) {
            for(char c = 'a'; c <= s; c++) {
                System.out.print(c);
            }
            System.out.println();
        }

        scanner.close();                        // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }
}
