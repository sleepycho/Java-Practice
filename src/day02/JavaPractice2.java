/*
    Date: 2023년 11월 29일
    Author: 조성진
    Description: '글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력하여 확인해 보세요.
    Version: 1.0
*/
package day02;

public class JavaPractice2 {
    public static void main(String[ ] args) {
        char ch1 = '\uae00';
        System.out.println(ch1);
    }
}
