package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        // 배열 변수 선언
        int[] students;

        // 배열 생성 및 초기화
        students = new int[] {90, 80, 70, 60, 50};

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
