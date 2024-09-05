package com.sjr;

import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);               // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 선언
        int randomNumber, answer, count, start, end;
        String restart;
        // 로직
        while (true) {
            // 0. 변수 초기화
            count = 1; start = 0; end = 99;
            // 1. 0 ~ 99 랜덤 수 결정
            randomNumber = (int) (Math.random() * 100);
            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            while (true) {
                // 2. 사용자 입력
                System.out.println(start + "-" + end);
                System.out.print(count++ + ">>");
                answer = scanner.nextInt();
                // 3. 결과 판별
                if (answer == randomNumber) {
                    System.out.println("맞았습니다.");
                    break;
                } else if (answer < randomNumber) {
                    System.out.println("더 높게");
                    start = answer;
                    continue;
                } else if (answer > randomNumber) {
                    System.out.println("더 낮게");
                    end = answer;
                    continue;
                }
            }
            // 4. 게임 재시작 여부 판별
            System.out.println("다시하시겠습니까(y/n)>>");
            restart = scanner.next();
            if (restart.charAt(0) == 'n') {
                break;
            } else {
                continue;
            }
        }

        scanner.close();
    }
}