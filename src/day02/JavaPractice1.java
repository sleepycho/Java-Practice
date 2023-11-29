/*
    Date: 2023년 11월 29일
    Author: 조성진
    Description: 변수 두 개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙 연산 결과를 정수로 출력해보세요.
    Version: 1.0
*/
package day02;

public class JavaPractice1 {
    public static void main(String[ ] args) {
        int iNum = 10;
        float fNum = 2.0F;

        int iNum2 = (int)(iNum + fNum);
        System.out.println(iNum2);

    }
}
