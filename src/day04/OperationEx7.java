/*
    Date: 2023년 12월 3일
    Author: 조성진
    Description: 비트 이동 연산자 사용
    Version: 1.0
*/
package day04;

public class OperationEx7 {
    public static void main(String[ ] args) {
        int num = 0B00000101; //5를 8비트 2진수로 나타냄

        System.out.println(num << 2); //왼쪽으로 2비트 이동
        System.out.println(num >> 2); //오른쪽으로 2비트 이동
        System.out.println(num >>> 2); //오른쪽으로 2비트 이동

        System.out.println(num); //num 값에 대입하지 않았기 때문에 그대로 출력

        num = num << 2; //왼쪽 2비트 이동한 값을 num에 대입
        System.out.println(num);
    }
}
