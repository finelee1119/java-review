package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(1000, balance);
        balance = withdraw(2000, balance);

        System.out.println("최종 잔액: " + balance + "원");
    }

    // 입금
    public static int deposit(int amount, int balance) {
        balance += amount;
        System.out.println(amount + "원 입금 완료. 현재 잔액: " + balance + "원");
        return balance;
    }

    // 출금
    public static int withdraw(int amount, int balance) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금 완료. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원 출금 실패. 잔액 부족.");
        }
        return balance;
    }
}
