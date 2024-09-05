package com.sjr;                                                                // 패키지 선언문

import java.util.Scanner;                                                       // Scanner 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class RockPaperScissors {                                                // RockPaperScissors 클래스 정의 시작
    public static void main(String[] args) {                                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                               // Scanner 클래스형 레퍼런스 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화
        // 변수 선언
        String chulsu, younghee, result = "";                                   // String 클래스형 레퍼런스 변수 chulsu, younghee, result 선언 동시에 result에 빈 문자열 "" 대입하여 초기화

        // 가위, 바위, 보 입력
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");  // System.out.println() 메소드 호출하여 문자열 "가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요" 출력, 즉 가위, 바위 보 입력 안내 메세지 출력
        System.out.print("철수 >> ");                                           // System.out.println() 메소드 호출하여 문자열 "철수 >> " 출력, 즉 철수 입력 안내 메세지 출력
        chulsu = scanner.next();                                               // 변수 chulsu에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값 문자열로 리턴 받아 대입하여 초기화, 즉 철수가 낸 것
        System.out.print("영희 >> ");                                           // System.out.println() 메소드 호출하여 문자열 "영희 >> " 출력, 즉 영희 입력 안내 메세지 출력
        younghee = scanner.next();                                             // 변수 younghee에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값 문자열로 리턴 받아 대입하여 초기화, 즉 영희가 낸 것

        // 승패 판별
        if((chulsu.equals("가위") && younghee.equals("가위")) || (chulsu.equals("바위") && younghee.equals("바위"))|| (chulsu.equals("보") && younghee.equals("보"))) // 변수 chulsu에 저장된 문자열이 "가위"이고 변수 younghee에 저장된 문자열이 "가위"이면 또는
            result = "비겼습니다.";                                              // 변수 result에 문자열 "비겼습니다." 대입
        else if ((chulsu.equals("가위") && younghee.equals("보")) || (chulsu.equals("바위") && younghee.equals("가위"))|| (chulsu.equals("보") && younghee.equals("바위")))
            result = "철수가 이겼습니다.";                                        // 변수 result에 문자열 "철수가 이겼습니다." 대입
        else if ((chulsu.equals("가위") && younghee.equals("바위")) || (chulsu.equals("바위") && younghee.equals("보"))|| (chulsu.equals("보") && younghee.equals("가위")))
            result = "영희가 이겼습니다.";                                        // 변수 result에 문자열 "영희가 이겼습니다." 대입

        // 결과 출력
        System.out.println(result);                                             // System.out.println() 메소드 호출하여 변수 result에 저장된 문자열 출력, 즉 가위 바위 보 결과 출력

        scanner.close();                                                        // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용 종료
    }                                                                           // main() 메소드 정의 끝
}                                                                               // RockPaperScissors 클래스 정의 끝
