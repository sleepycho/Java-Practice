package day06;

public class Exam1 {
    public static void main(String[] args) {
        int a = 7;
        switch (a % 3) {
            case 0 : System.out.println(a + "는 3의 배수"); break;
            case 1 :
            case 2 : System.out.println(a + "는 3의 배수가 아님"); break;
        }
    }
}
