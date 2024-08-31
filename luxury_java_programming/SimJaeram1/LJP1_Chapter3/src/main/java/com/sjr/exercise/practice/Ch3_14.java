package com.sjr.exercise.practice;

import java.util.Scanner;

public class Ch3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 선언
        String[] courses = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] scores = {95, 88, 76, 62, 55};
        String course;
        int score = 0;
        int index = 0;
        boolean isExisting = false;

        // 로직
        // 1. 과목 이름 입력
        while(true) {
            System.out.print("과목이름>>");
            course = scanner.next();

            // 그만을 입력하면 프로그램 종료
            if(course.equals("그만") == true) {
                break;
            }

            // 2. 과목 존재 여부 찾기
            for (int i = 0; i < courses.length; i++) {
                if (course.equals(courses[i]) == true) {
                    isExisting = true;
                    score = scores[i];
                    index = i;
                    break;
                } else {
                    isExisting = false;
                }
            }

            // 3. 결과 출력
            if (isExisting == true) {
                System.out.println(courses[index] + "의 점수는 " + score);
            } else {
                System.out.println("없는 과목입니다.");
            }
        }
        scanner.close();
    }
}
