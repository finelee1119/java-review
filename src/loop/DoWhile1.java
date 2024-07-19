package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        do { // 일단 한번은 실행
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3); // false
    }
}
