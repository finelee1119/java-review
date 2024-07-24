package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        // 배열 변수 선언
        // - 배열을 담을 수 있음
        // - 내부에는 생성된 배열의 참조값을 보관 -> 이걸 통해 배열에 접근
        int[] students;

        // 배열 생성
        // - 배열을 사용하기 위해 필요
        // - 내부값은 타입에 따라 자동으로 초기화됨
        students = new int[5];

        // 배열 선언 및 생성
        // int[] students = new int[5];

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);
    }
}
