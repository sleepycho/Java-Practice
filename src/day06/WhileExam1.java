package day06;

public class WhileExam1 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        System.out.print("1-2+3-4+5-6+7-8+9-10=");
        while(i<=10) {
            if(i%2 == 0) sum -= i;
            else sum += i;
            i++;
        }
        System.out.print(sum);
    }
}
