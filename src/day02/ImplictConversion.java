/*
    Date: 2023년 11월 29일
    Author: 조성진
    Description: 묵시적 형 변환
    Version: 1.0
*/
package day02;

public class ImplictConversion {
    public static void main(String[ ] args) {
        byte bNum = 10;
        int iNum = bNum; //변수 bNum 값이 변수 iNum 대입

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2; //변수 iNum2 값이 변수 fNum 대입

        System.out.println(iNum2);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;
        System.out.println(dNum);
    }
}
