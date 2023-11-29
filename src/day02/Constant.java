/*
    Date: 2023년 11월 29일
    Author: 조성진
    Description: 상수 사용하기
    Version: 1.0
*/
package day02;

public class Constant {
    public static void main(String[ ] args) {
        final int MAX_NUM = 100; //선언과 동시에 초기화
        final int MIN_NUM;

        MIN_NUM = 0; //사용 전 초기화 필수. 하지 않으면 오류 발생

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
}
