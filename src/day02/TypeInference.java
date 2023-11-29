/*
    Date: 2023년 11월 29일
    Author: 조성진
    Description: 자료형 추론
    Version: 1.0
*/
package day02;

public class TypeInference {
    public static void main(String[ ] args) {
        var i = 10; //int i = 10;
        var j = 10.0; //double j = 10.0;
        var str = "Hello World!"; //char str = "Hello World!";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "Goodbye World!"; // 다른 문자열 대입 가능 (단, str 변수는 String 형으로 먼저 사용되었기 때문에 정수 값을 넣을 수 없음.)

    }
}
