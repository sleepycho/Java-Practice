/*
    Date: 2023년 11월 30일
    Author: 조성진
    Description: 증가 • 감소 연산자 사용 후 값 연산
    Version: 1.0
*/
package day03;

public class OperationEx3 {
    public static void main(String[ ] args) {
        int gameScore = 150; //게임 점수 150점

        int lastScore1 = ++gameScore; //gameScore에 1만큼 더한 값을 lastScore1에 대입
        System.out.println(lastScore1); //151

        int lastScore2 = --gameScore; //gameScore에 1만큼 뺀 값을 lastSocre2에 대입
        System.out.println(lastScore2); //150

    }
}
