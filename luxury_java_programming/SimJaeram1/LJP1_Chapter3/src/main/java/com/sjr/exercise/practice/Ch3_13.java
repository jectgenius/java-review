package com.sjr.exercise.practice;

public class Ch3_13 {
    public static void main(String[] args) {
        // 선언
        int count, ten, one;

        // 로직
        // 1. 1 ~ 99까지 반복
        for(int i = 1; i <= 99; i++) {
            // 2. 각 수의 3, 6, 9 개수 세기
            count = 0;

            ten = i / 10;
            one = i % 10;

            if(ten == 3 || ten == 6 || ten == 9) {
                count++;
            }
            if(one == 3 || one == 6 || one == 9) {
                count++;
            }

            // 3. 개수가 0이 아닌 경우 박수 출력
            if(count == 1) {
                System.out.println(i + " 박수 짝");
            }
            else if(count == 2) {
                System.out.println(i + " 박수 짝짝");
            }
        }
    }
}
