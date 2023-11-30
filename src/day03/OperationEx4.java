/*
    Date: 2023년 11월 30일
    Author: 조성진
    Description: 증가 • 감소 연산자 사용 후 값 연산 2
    Version: 1.0
*/
package day03;

public class OperationEx4 {
    public static void main(String[ ] args) {
        int gameScore = 100;

        int lastScore1 = gameScore++; //gameScore 값을 lastScore에 할당 후 gameScore 1 증가시킴. 즉, 변한게 없다.
        System.out.println(lastScore1);
    }
}
