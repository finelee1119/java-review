package construct.ex;

public class Book {
    // 멤버 변수
    String title;
    String author;
    int page;

    // 기본 생성자
    Book() {
        this("", "", 0);
    }

    // 일부만 매개변수로 받는 생성자
    Book(String title, String author) {
        this(title, author, 0);
    }

    // 모든 필드를 매개변수로 받는 생성자
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    // 메서드
    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
