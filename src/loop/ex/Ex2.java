package loop.ex;

public class Ex2 {
    public static void main(String[] args) {
//        int num = 2;
//        int count = 1;
//
//        while (count <= 10) {
//            System.out.println(num);
//            num += 2;
//            count++;
//        }

        for (int num = 2, count = 1; count <= 10 ; num+=2, count++) {
            System.out.println(num);
        }
    }
}
