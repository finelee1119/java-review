package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // int < long < double
        intValue = (int)doubleValue; // 명시적 형 변환
    }
}
