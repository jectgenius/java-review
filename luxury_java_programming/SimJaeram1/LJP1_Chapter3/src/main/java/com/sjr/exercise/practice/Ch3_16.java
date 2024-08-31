package com.sjr.exercise.practice;

import java.util.Scanner;

public class Ch3_16 {
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);               // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 선언
        String human, computer, result = "";
        String[] RockPaperScissors = {"가위", "바위", "보"};
        int index;

        // 로직
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while(true) {
            // 1. 독자 내기
            System.out.print("가위 바위 보!>>");
            human = scanner.next();

            // 2. 그만을 입력한 경우 프로그램 종료
            if(human.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }

            // 3. 컴퓨터 내기
            index = (int) (Math.random() * 3);
            computer = RockPaperScissors[index];
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
