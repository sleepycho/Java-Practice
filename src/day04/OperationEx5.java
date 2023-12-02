/*
    Date: 2023년 12월 3일
    Author: 조성진
    Description: 단락 회로 평가 실습
    Version: 1.0
*/
package day04;

public class OperationEx5 {
    public static void main(String[ ] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);
    }
}
