package com.sjr.exercise.practice;                                                                  // 패키지 선언문

public class Ch3_10 {                                                                               // Ch3_10 클래스 정의 시작
    public static void main(String[] args) {                                                        // main() 메소드 정의 시작
        // 선언
        int row, column, randomNumber;                                                              // int형 변수 row, column, randomNumber 선언, 즉 행, 열, 랜덤 난수
        int[][] numbers = new int[4][4];                                                            // int형 배열 numbers 선언 동시에 크기가 4 x 4인 int형 배열 객체 생성하여 대입하여 초기화, 즉 난수 저장할 배열

        // 로직
        // 1. 배열 모두 0으로 초기화
        // 2. 1 ~ 10 난수 10번 생성 및 랜덤하게 대입
        for (int i = 0; i < 10; i++) {                                                              // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 10 보다 작으면 반복, i에 +1
            row = (int) (Math.random() * 4);                                                        // 변수 row에 (int) (Math.random() * 4) 연산 결과 리턴 받아 대입하여 초기화, 즉 행 인덱스
            column = (int) (Math.random() * 4);                                                     // 변수 column에 (int) (Math.random() * 4) 연산 결과 리턴 받아 대입하여 초기화, 즉 열 인덱스

            // 중복 검증
            // 현재 대입할 요소에 0이 아닌 다른 값이 저장되어 있다면 이미 초기화 것이므로 다른 위치 찾아보기
            if (numbers[row][column] != 0) {                                                        // 배열 numbers의 인덱스 row번째 행 column번째 열 요소에 저장된 값이 0이 아니면
                i--;                                                                                // i에 -1
                continue;                                                                           // 반복문을 빠져나가지 않으면서 다음 반복으로 넘어감, 즉 반복 후 작업문으로 분기
            }
            else {                                                                                  // 그렇지 않으면, 즉 0이면 아직 초기화 되지 않은 것이므로
                randomNumber = (int) (Math.random() * 10 + 1);                                      // 변수 randomNumber에 (int) (Math.random() * 10 + 1) 연산 결과 리턴 받아 대입하여 초기화, 즉 랜덤 난수 발생
                numbers[row][column] = randomNumber;                                                // 배열 numbers에 인덱스 row번째 행 column번째 열 요소에 randomNumber 대입하여 초기화, 즉 아직 초기화 되지 않았으므로 랜덤 난수 저장
            }
        }                                                                                           // 10개의 랜덤 정수 대입 모두 완료, for문 끝

        // 3. 배열 출력
        for (int i = 0; i < numbers.length; i++) {                                                  // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 numbers의 1차원 배열의 크기 length 보다 작으면 반복, i에 +1, 즉 행의 크기
            for (int j = 0; j < numbers[i].length; j++) {                                           // int형 변수 j 선언 동시에 0 대입하여 초기화, 반복제어변수 j가 배열 numbers의 2차원 배열의 크기 length 보다 작으면 반복, j에 +1, 즉 열의 크기
                System.out.print(numbers[i][j] + "\t");                                             // System.out.print() 메소드 호출하여 문자열 numbers[i][j] + "\t" 출력, 즉 배열 numbers의 인덱스 i번째 행 j번째 열 요소 값 출력
            }                                                                                       // 안쪽 for문 끝, 한 행 모든 요소 출력 완료
            System.out.println();                                                                   // System.out.println() 메소드 호출하여 줄바꿈
        }                                                                                           // 바깥쪽 for문 끝, 배열의 모드 요소 출력 완료
    }                                                                                               // main() 메소드 정의 끝
}                                                                                                   // Ch3_10 클래스 정의 끝
