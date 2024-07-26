package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        // 학생1
        Student student1;
        student1 = new Student();

        student1.name = "학생1";
        student1.age =  15;
        student1.grade = 90;

        // 학생2
        Student student2 = new Student();

        student2.name = "학생2";
        student2.age =  16;
        student2.grade = 80;

        // 배열 활용하기
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println(students[0].name);
    }
}
