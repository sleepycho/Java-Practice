/*
    Date: 2023년 12월 6일
    Author: 조성진
    Description: 성적에 따른 학점 부여하기
    Version: 1.0
*/
package day05;

public class IfExample3 {
    public static void main(String[ ] args) {
        String name = "John Doe"; //이름
        int score = 100; //점수
        char grade; //학점

        if(score >= 90) {
            grade = 'A';
        }

        else if(score >= 80) {
            grade = 'B';
        }

        else if(score >= 70) {
            grade = 'C';
        }

        else if(score >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        System.out.println(name + "님의 점수는 " + score + "이며, 학점은 " + grade + "입니다.");
    }
}
