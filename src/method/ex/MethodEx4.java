package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 메뉴 선택
            getMenu();
            int option = sc.nextInt();
            int amount;

            // 메뉴 실행
            switch (option) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = sc.nextInt();
                    balance = deposit(amount, balance);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = sc.nextInt();
                    balance = withdraw(amount, balance);
                    break;
                case 3:
                    getBalance(balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴를 선택해주세요.");
            }
        }
    }

    private static int deposit(int amount, int balance) {
        balance += amount;
        System.out.println(amount + "원 입금 완료. 현재 잔액: " + balance + "원");
        return balance;
    }

    private static int withdraw(int amount, int balance) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금 완료. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원 출금 실패. 잔액 부족.");
        }
        return balance;
    }

    private static void getBalance(int balance) {
        System.out.println("현재 잔액: " + balance + "원");
    }

    public static void getMenu() {
        System.out.println("=====================================");
        System.out.println("1.입금 | 2.출금 | 3.잔액확인 | 4.종료");
        System.out.println("=====================================");
        System.out.print("선택: ");
    }
}
