import java.io.IOException;

public class Main {

    public static void main(String[] args) {


        ReadingClass book = new ReadingClass("origin.txt", "destination.txt");

        try {
            book.readingClass();
            book.writingClass();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
