package class1;

public class ClassStart5 {
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
        Student[] students = {student1, student2};

        // 버전1
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + students[i].age + students[i].grade);
        }

        // 버전2
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.name + s.age + s.grade);
        }

        // 버전3
        for (Student s : students) {
            System.out.println(s.name + s.age + s.grade);
        }
    }
}
