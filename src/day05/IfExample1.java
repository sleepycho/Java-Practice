/*
    Date: 2023년 12월 6일
    Author: 조성진
    Description: 나이에 따라 다른 문장 출력하기
    Version: 1.0
*/
package day05;

public class IfExample1 {
    public static void main(String[ ] args) {
        int age = 7;
        if(age >= 8) {
            System.out.println("학교에 다닙니다.");
        }
        else {
            System.out.println("학교에 다니지 않습니다.");
        }
    }
}