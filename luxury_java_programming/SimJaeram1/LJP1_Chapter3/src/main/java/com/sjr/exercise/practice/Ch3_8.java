package com.sjr.exercise.practice;                              // 패키지 선언문

import java.util.Scanner;                                       // 다른 패키지의 클래스 사용하기위해 컴파일러에게 경로명 알려줌

public class Ch3_8 {                                            // Ch3_8 클래스 정의 시작
    public static void main(String[] args) {                    // main() 메소드 정의 시작
        Scanner scanner = new Scanner(System.in);               // Scanner 클래스형 변수 scanner 선언 동시에 Scanner 객체 생성하여 대입하여 초기화, 사용자로부터 입력 받기 위해 Scanner 사용

        // 선언
        int[] numbers;                                          // int형 배열 numbers 선언
        int randomNumber, count;                                // int형 변수 randomNumber, count 선언, 즉 랜덤 수, 개수

        // 로직
        // 1. 저장할 정수 개수 입력
        System.out.print("정수 몇개?");                          // System.out.print() 메소드 호출하여 문자열 "정수 몇개?" 출력, 즉 저장할 정수 개수
        count = scanner.nextInt();                              // 변수 count에 scanner 객체의 nextInt() 메소드 호출하여 사용자로부터 입력 받은 값 int형으로 리턴 받아 대입하여 초기화, 즉 사용자가 입력한 정수
        // 2. 배열 생성
        numbers = new int[count];                               // 배열에 대한 레퍼런스 변수 numbers에 크기가 count인 int형 배열 객체 생성하여 대입하여 초기화
        // 3. 랜덤 정수 배열에 저장
        for(int i = 0; i < numbers.length; i++) {               // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 numbers의 크기 length 보다 작으면 반복, i에 +1
            randomNumber = (int) (Math.random() * 100 + 1);     // 변수 randomNumber에 (int) (Math.random() * 100 + 1) 연산 결과 리턴 받아 대입하여 초기화, 1 ~ 100 범위 랜덤 정수 발생
            numbers[i] = randomNumber;                          // 배열 numbers의 인덱스 i번째 요소에 randomNumber 대입하여 초기화, 즉 1 ~ 100 범위 랜덤 정수 발생한 뒤 배열에 저장

            // 중복 검증
            for(int j = 0; j < i; j++) {                        // 지금까지 저장된 배열 요소 중에서, int형 변수 j 선언 동시에 0 대입하여 초기화, 반복제어변수 j가 i보다 작으면 반복, j에 +1
                if (randomNumber == numbers[j]) {               // 중복되는 수가 있다면, randomNumber == numbers[j]이면, 즉 랜덤한 정수가 배열 numbers의 인덱스 j번째 요소에 저장된 값과 같다면
                    i--;                                        // 배열 요소 인덱스 증가 방지 위해 -1, 해당 인덱스에 저장할 랜덤 정수 다시 뽑게 됨, i에 -1
                    break;                                      // 반복문을 빠져나감, 즉 랜덤 정수 발생
                }
                else {                                          // 그렇지 않으면, 즉 랜덤 정수와 같지 않으면
                    continue;                                   // 반복문을 빠져나가지 않으면서 다음 반복으로 넘어감
                }
            }                                                   // 안쪽 for문 끝, 지금까지 저장된 배열 요소 중에서 중복되는 수가 있는지 중복 검증 모두 완료
        }                                                       // 바깥쪽 for문 끝, 즉 랜덤 정수 배열에 모두 저장 완료

        // 4. 배열 출력
        for(int i = 0; i < numbers.length; i++) {               // int형 변수 i 선언 동시에 0 대입하여 초기화, 반복제어변수 i가 배열 numbers의 크기 length 보다 작으면 반복, i에 +1
            System.out.print(numbers[i] + "\t");                // System.out.print() 메소드 호출하여 문자열 numbers[i] + "\t" 출력, 즉 배열 numbers의 인덱스 i번째 요소 출력

            if(i % 10 == 9) {                                   // 원소가 한 줄에 10개가 출력될 때는 인덱스가 9, 19 ... 이다., 변수 i를 10으로 나눈 나머지가 9와 같다면, 즉 인덱스가 x9 형식이면
                System.out.println();                           // System.out.println() 메소드 호출하여 줄바꿈
            }
        }                                                       // for문 끝, 즉 배열 모두 출력 완료

        scanner.close();                                        // scanner 객체의 close() 메소드 호출하여 객체 닫기, 즉 사용종료
    }                                                           // main() 메소드 정의 끝
}                                                               // Ch3_8 클래스 정의 끝