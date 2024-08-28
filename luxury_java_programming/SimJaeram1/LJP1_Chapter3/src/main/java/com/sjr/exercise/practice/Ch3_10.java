package com.sjr.exercise.practice;

public class Ch3_10 {
    public static void main(String[] args) {
        // 선언
        int indexRow, indexColumn, randomNumber;
        int[][] numbers = new int[4][4];

        // 로직
        // 1. 배열 모두 0으로 초기화
        // 2. 1 ~ 10 난수 10번 생성 및 랜덤하게 대입
        for (int i = 0; i < 10; i++) {
            indexRow = (int) (Math.random() * 4);
            indexColumn = (int) (Math.random() * 4);

            // 중복 검증
            // 현재 대입할 요소에 0이 아닌 다른 값이 저장되어 있다면 이미 초기화 것이므로 다른 위치 찾아보기
            if (numbers[indexRow][indexColumn] != 0) {
                i--;
                continue;
            }
            else {
                randomNumber = (int) (Math.random() * 10 + 1);
                numbers[indexRow][indexColumn] = randomNumber;
            }
        }
        // 3. 배열 출력
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
