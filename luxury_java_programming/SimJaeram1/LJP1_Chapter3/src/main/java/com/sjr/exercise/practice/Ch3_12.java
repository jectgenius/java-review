package com.sjr.exercise.practice;

public class Ch3_12 {
    public static void main(String[] args) {
        // 선언
        int sum = 0;                                // 총합

        // 로직
        // 1. 명령행 인자에 값 전달
        // 2. 총합 연산
        for(int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);   // 명령행 인자들을 정수로 변환한 뒤, sum에 합함
            }
            catch(NumberFormatException e) {        // 변환하고자 하는 문자열이 int형이 아닌 경우 NumberFormatException 예외 발생
                continue;
            }
        }
        // 3. 결과 출력
        System.out.println(sum);
    }
}
