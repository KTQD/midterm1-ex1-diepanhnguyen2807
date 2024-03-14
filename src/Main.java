import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {

        MP3 mp3 = new MP3("Lucky", "a song", "1", 28, 7);
        Book book = new Book("Gone with the wind", "a book", "2", 300000,"Margaret Mitchell",1000,"Novel");
        book.showinfo();
        mp3.showinfo();

    }
}
