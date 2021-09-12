import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingClass {
    private FileInputStream inputStream;
    private FileOutputStream outputStream;
    private byte[] buffer;
    int number;


    public ReadingClass(String pathIn, String pathOut){

        try {
            this.inputStream = new FileInputStream(pathIn); //
            this.outputStream = new FileOutputStream(pathOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        buffer = new byte[24];
        number = 0;

    }

    public void readingClass() throws IOException {

        number = inputStream.read(buffer);

        if(number != -1) {
            System.out.println(number);
        }

        inputStream.close();

    }

    public void writingClass() throws IOException {

        outputStream.write(buffer, 0, number);

        outputStream.close();

    }

}
