/*
    Date: 2023년 12월 6일
    Author: 조성진
    Description: switch-case문 예제
    Version: 1.0
*/
package day05;

public class SwitchCase {
    public static void main(String[ ] args) {
        int ranking = 1;
        char medalColor;

        switch(ranking) {
            case 1 : medalColor = 'G';
                     break;

            case 2 : medalColor = 'S';
                     break;

            case 3 : medalColor = 'B';
                     break;

            default:
                     medalColor = 'A';
        }
        System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
    }
}
