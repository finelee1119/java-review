package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = sc.nextInt();

        int[] numbers = new int[count];
        int sum = 0;

        System.out.println(count + "개의 정수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        double avg = (double) sum / count;
        System.out.println(sum);
        System.out.println(avg);
    }
}
