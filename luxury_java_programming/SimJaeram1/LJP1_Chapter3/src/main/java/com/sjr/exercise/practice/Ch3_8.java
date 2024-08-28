package com.sjr.exercise.practice;

import java.util.Scanner;

public class Ch3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 선언
        int[] numbers;
        int randomNumber, count;

        // 로직
        // 1. 저장할 정수 개수 입력
        // 2. 배열 생성
        System.out.print("정수 몇개?");
        count = scanner.nextInt();
        numbers = new int[count];
        // 3. 랜덤 정수 배열에 저장
        for(int i = 0; i < numbers.length; i++) {
            randomNumber = (int) (Math.random() * 100 + 1);
            numbers[i] = randomNumber;

            // 중복 검증
            for(int j = 0; j < i; j++) {
                if (randomNumber == numbers[j]) {
                    i--;
                    break;
                }
                else {
                    continue;
                }
            }
        }

        // 4. 배열 출력
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");

            if(i % 10 == 9) {                                   // 원소가 한 줄에 10개가 출력될 때는 인덱스가 9, 19 ... 이다.
                System.out.println();
            }
        }

        scanner.close();
    }
}