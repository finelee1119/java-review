package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i]; // 배열의 값을 순서대로 읽어서 number 변수에 넣고
            System.out.println(number); // 출력한다
        }

        // 향상된 for문
        for (int number : numbers) { // 배열을 그냥 순서대로 처음부터 끝까지 탐색하게 해준다
            System.out.println(number);
        }
    }
}
