/*
    Date: 2023년 11월 29일
    Author: 조성진
    Description: 명시적 형 변환
    Version: 1.0
*/
package day02;

public class ExplicitConversion {
    public static void main(String[ ] args) {
        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int iNum3 = (int)dNum1 + (int)fNum2; //두 실수가 형 변환되어 더해짐
        int iNum4 = (int)(dNum1 + fNum2); //두 실수의 합이 먼저 계산되고 형 변환 됨

        System.out.println(iNum3);
        System.out.println(iNum4);

    }
}
