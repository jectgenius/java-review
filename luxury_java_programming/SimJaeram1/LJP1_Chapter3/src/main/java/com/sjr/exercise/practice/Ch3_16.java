package com.sjr.exercise.practice;                              // 패키지 선언문

import java.util.Scanner;                                       // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch3_16 {                                           // Ch3_16 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);               // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 선언
        String human, computer, result = "";                    // String형 변수 human, computer, result 선언 동시에 result에 빈문자열 객체 "" 대입하여 초기화, 즉 사용자 컴퓨터가 낸것과 승패 결과
        String[] RockPaperScissors = {"가위", "바위", "보"};      // String형 배열 RockPaperScissors 선언 동시에 초기화 블럭으로 초기화한 객체 생성하여 대입하여 초기화, 즉 컴퓨터가 낼 것들
        int index;                                              // int형 변수 index 선언, 즉 컴퓨터가 랜덤으로 낼 것을 정하기 위한 배열의 인덱스

        // 로직
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");  // System.out.println() 메소드 호출하여 문자열 "컴퓨터와 가위 바위 보 게임을 합니다." 출력, 즉 가위 바위 보 게임 시작 안내 메세지 출력
        while(true) {                                           // 무한반복
            // 1. 독자 내기
            System.out.print("가위 바위 보!>>");                  // System.out.print() 메소드 호출하여 문자열 "가위 바위 보!>>" 출력, 즉 가위 바위 보 게임 입력 안내 메세지 출력
            human = scanner.next();                             // 변수 human에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값 문자열로 리턴 받아 대입하여 초기화, 즉 사용자가 낸 것

            // 2. 그만을 입력한 경우 프로그램 종료
            if(human.equals("그만")) {                           // 만약 human 객체의 equals() 메소드 호출하여 사용자가 입력한 문자열이 "그만"과 같다면, 즉 사용자가 그만을 입력하였다면
                System.out.println("게임을 종료합니다...");        // System.out.println() 메소드 호출하여 문자열 "게임을 종료합니다..." 출력, 즉 게임 종료 안내 메세지 출력
                break;                                          // while문을 빠져나감, 즉 프로그램 종료
            }

            // 3. 컴퓨터 내기
            index = (int) (Math.random() * 3);                  // 변수 index에 (int) (Math.random() * 3) 연산 결과 리턴 받아 대입하여 초기화, 즉 컴퓨터가 낼 것을 랜덤으로 정하기 위해 인덱스 연산
            computer = RockPaperScissors[index];                // 변수 computer에 배열 RockPaperScissors의 인덱스 index번째 요소에 저장된 값 대입하여 초기화, 즉 컴퓨터가 낸 것
            // 4. 승패 판별
            if ((human.equals("가위") && computer.equals("보")) || (human.equals("바위") && computer.equals("가위")) || (human.equals("보") && computer.equals("바위"))) {
                result = "사용자가 이겼습니다.";
            }
            if ((computer.equals("가위") && human.equals("보")) || (computer.equals("바위") && human.equals("가위")) || (computer.equals("보") && human.equals("바위"))) {
                result = "컴퓨터가 이겼습니다.";
            }
            if ((computer.equals("가위") && human.equals("가위")) || (computer.equals("바위") && human.equals("바위")) || (computer.equals("보") && human.equals("보"))) {
                result = "비겼습니다.";
            }
            // 5. 결과 출력
            System.out.println("사용자 = " + human + ", 컴퓨터 = " + computer + ", " + result);
        }

        scanner.close();                                        // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                           // main() 메소드 정의 끝
}
