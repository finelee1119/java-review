package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 ('종료'를 입력하면 종료): ");
            String name = scanner.nextLine(); // 4. 따로 nextLine을 안 쳐주면 nextInt가 안 가져간 \n을 여기서 가져가게 됨("")

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt(); // 1. 우리가 입력한 것 : 숫자 + \n // 2. nextInt가 가져가는 것 : 숫자만 (\n이 남아있게 됨)
            scanner.nextLine(); // 3. 남아있는 \n 삭제

            System.out.print("입력한 이름: " + name + ", 나이: " + age + "\n");
        }


    }
}
