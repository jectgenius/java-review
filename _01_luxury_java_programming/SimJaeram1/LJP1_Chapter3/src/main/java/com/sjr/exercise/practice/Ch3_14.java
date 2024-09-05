package com.sjr.exercise.practice;                                              // 패키지 선언문

import java.util.Scanner;                                                       // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch3_14 {                                                           // Ch3_14 클래스 정의 시작
    public static void main(String[] args) {                                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);                               // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 선언
        String[] courses = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};    // String형 배열 course 선언 동시에 초기화 블럭 사용하여 초기화한 객체 생성하여 대입하여 초기화, 죽 과목들
        int[] scores = {95, 88, 76, 62, 55};                                    // int형 배열 scores 선언 동시에 초기화 블럭 사용하여 초기화한 객체 생성하여 대입하여 초기화, 죽 점수들
        String course;                                                          // String형 변수 course 선언
        int score = 0;                                                          // int형 변수 score 선언 동시에 0 대입하여 초기화
        int index = 0;                                                          // int형 변수 index 선언 동시에 0 대입하여 초기화
        boolean isExisting = false;                                             // boolean형 변수 isExisting 선언 동시에 false 대입하여 초기화

        // 로직
        // 1. 과목 이름 입력
        while(true) {                                                           // 무한반복
            System.out.print("과목이름>>");                                       // System.out.print() 메소드 호출하여 문자열 "과목이름>>" 출력, 즉 점수 출력할 과목 이름 입력 안내 메세지 출력
            course = scanner.next();                                            // 변수 course에 scanner 객체의 next() 메소드 호출하여 사용자로부터 입력 받은 값 문자열로 리턴 받아 대입하여 초기화, 즉 사용자가 입력한 과목 이름

            // 그만을 입력하면 프로그램 종료
            if(course.equals("그만") == true) {                                  // 만약 course 객체의 equals() 메소드 호출하여 사용자가 입력한 문자열이 "그만"과 같다면, 즉 사용자가 그만을 입력하였다면
                break;                                                          // while문을 빠져나감, 즉 프로그램 종료
            }

            // 2. 과목 존재 여부 검증
            for (int i = 0; i < courses.length; i++) {                          // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 courses의 크기 length보다 작으면 반복, i에 +1
                if (course.equals(courses[i]) == true) {                        // 만약 course 객체의 equals() 메소드 호출하여 배열 courses의 인덱스 i번째 요소에 저장된 문자열과 같다면, 즉 사용자가 입력한 과목이 있다면
                    isExisting = true;                                          // 변수 isExisting에 true 대입, 즉 과목 존재함
                    score = scores[i];                                          // 변수 score에 배열 scores의 인덱스 i번째 요소에 저장된 값 대입하여 초기화, 즉 사용자가 입력한 과목의 점수 찾아서 저장
                    index = i;                                                  // 변수 index에 i 대입
                    break;                                                      // for문을 빠져나감, 즉 과목 점수 찾기 완료
                } else {                                                        // 그렇지 않으면
                    continue;                                                   // for문을 빠져나가지 않으면서 다음 반복으로 넘어감, 즉 반복 후 작업문으로 분기
                }
            }                                                                   // for문 끝, 즉 과목 존재 여부 검증 완료

            // 3. 결과 출력
            if (isExisting == true) {                                           // 만약 isExisting == true 이면, 즉 사용자가 입력한 과목이 존재하면
                System.out.println(courses[index] + "의 점수는 " + score);       // System.out.println() 메소드 호출하여 점수 안내 메세지 출력
            } else {                                                            // 그렇지 않으면, 즉 사용자가 입력한 과목이 존재하지 않으면
                System.out.println("없는 과목입니다.");                            // System.out.println() 메소드 호출하여 없는 과목 안내 메세지 출력
            }
        }                                                                       // while문 끝
        scanner.close();                                                        // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                                           // main() 메소드 정의 끝
}                                                                               // Ch3_14 클래스 정의 시작
