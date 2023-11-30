/*
    Date: 2023년 11월 30일
    Author: 조성진
    Description: 산술 연산자 사용과 총점과 평균 구하기
    Version: 1.0
*/
package day03;

public class OperationEx1 {
    public static void main(String[ ] args) {
        int mathScore = 90;
        int engScore = 70;

        int totalScore = mathScore + engScore; //총 점수 구하기
        System.out.println(totalScore);

        double avgScore = totalScore / 2.0; //평균 구하기
        System.out.println(avgScore);
    }
}
