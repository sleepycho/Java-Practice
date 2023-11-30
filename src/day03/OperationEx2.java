/*
    Date: 2023년 11월 30일
    Author: 조성진
    Description: 국어, 영어, 수학 점수의 총점과 평균 구하기
    Version: 1.0
*/
package day03;

public class OperationEx2 {
    public static void main(String[ ] args) {
        int korScore = 96;
        int engScore = 94;
        int mathScore = 87;

        int totalScore = korScore + engScore + mathScore;
        System.out.println(totalScore);

        float avgScore = totalScore / 2.0F;
        System.out.println(avgScore);
    }
}
