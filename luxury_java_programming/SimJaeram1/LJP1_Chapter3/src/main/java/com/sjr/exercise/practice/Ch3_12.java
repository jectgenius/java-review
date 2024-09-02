package com.sjr.exercise.practice;                  // 패키지 선언문

public class Ch3_12 {                               // Ch3_12 클래스 정의 시작
    public static void main(String[] args) {        // main() 메소드 정의 시작
        // 선언
        int sum = 0;                                // int형 변수 sum 선언 동시에 0 대입하여 초기화, 즉 총합

        // 로직
        // 1. 명령행 인자에 값 전달
        // 2. 총합 연산
        for(int i = 0; i < args.length; i++) {      // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 args의 크기 length 보다 작으면 반복, i에 +1
            try {                                   // 예외가 발생할 가능성이 있는 코드는 try 블럭으로 둘러쌈
                sum += Integer.parseInt(args[i]);   // 변수 sum에 Integer 클래스의 parseInt() 메소드 호출하여 배열 args의 인덱스 i번째 요소를 문자열에서 int형으로 변환하여 리턴 받은 값 합함, 즉 명령행 인자들을 정수로 변환한 뒤 sum에 합함
            }                                       // try 블럭 끝
            catch(NumberFormatException e) {        // 변환하고자 하는 문자열이 int형이 아닌 경우 NumberFormatException 예외 발생, catch 블럭에 예외 처리 코드 작성
                continue;                           // 반복문을 빠져나가지 않으면서 다음 반복으로 넘어감
            }                                       // catch 블럭 끝
        }                                           // for문 끝, 총합 연산 완료
        // 3. 결과 출력
        System.out.println(sum);                    // System.out.println() 메소드 호출하여 sum 출력, 즉 총합 연산 결과 출력
    }                                               // main() 메소드 정의 끝
}                                                   // Ch3_12 클래스 정의 끝
