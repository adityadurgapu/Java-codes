class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam");

        book1.display();
        book2.display();
    }
}