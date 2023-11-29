/*
    Date: 2023년 11월 29일
    Author: 조성진
    Description: 문자형 연습
    Version: 1.0
*/
package day02;

public class CharacterEx1 {
    public static void main(String [] args) {
        char ch1 = 'A'; //문자형 변수 ch1을 선언, A를 대입(= 초기화)
        System.out.println(ch1); //변수 ch1을 출력
        System.out.println((int)ch1); //변수 ch1의 정수 값(아스키 코드)를 출력

        char ch2 = 66; //문자형 변수 ch2를 선언, 정수 값(아스키 코드) 대입
        System.out.println(ch2); //변수 ch2의 정수 값(아스키 코드)에 해당 되는 문자 출력

        int ch3 = 67; //정수형 변수 ch3를 선언, 67을 대입(= 초기화)
        System.out.println(ch3); //변수 ch3의 문자 정수 값 출력
        System.out.println((char)ch3); //변수 ch3의 정수 값에 해당 되는 문자 출력

    }
}
