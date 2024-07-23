package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        // int < long < double
        longValue = intValue; // int -> long
        doubleValue = intValue; // int -> double
        doubleValue = 2000000000L; // long -> double
    }
}
