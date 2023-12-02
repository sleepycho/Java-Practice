/*
    Date: 2023년 12월 3일
    Author: 조성진
    Description: 조건 연산자
    Version: 1.0
*/
package day04;

public class OperationEx6 {
    public static void main(String[ ] args) {
        int fatherAge = 45;
        int motherAge = 47;

        char ch;
        ch = (fatherAge > motherAge) ? 'T' : 'F';

        System.out.println(ch);
    }
}
