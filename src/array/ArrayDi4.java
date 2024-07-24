package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        //행2 x 열3 배열
        int[][] arr = new int[2][3];

        // 값 할당하기
        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        // 값 사용하기
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column]);
            }
            System.out.println();
        }
    }
}
