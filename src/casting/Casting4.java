package casting;

public class Casting4 {
    public static void main(String[] args) {
        // 같은 타입끼리 계산
        int div1 = 3 / 2; // 1

        double div2 = 3 / 2; // 1.0 (자동 형 변환)


        // 다른 타입과 계산
        double div3 = 3.0 / 2; // 1.5 (큰 타입으로 따라간 후 계산)

        double div4 = (double)3 / 2; // 1.5 (명시적 형 변환) (큰 타입으로 따라간 후 계산)

        int a = 3;
        int b = 2;
        double result = (double)a / b; // 1.5 (명시적 형 변환) (큰 타입으로 따라간 후 계산)
    }
}
