import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Numbers {
    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args) {
        File pathToData = new File("C:\\Users\\35196\\Desktop\\");
        System.out.println(pathToData.isDirectory());
        System.out.println(pathToData.get);
        /*try {
            System.out.println(readFileAsString(pathToData));
        } catch (IOException e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }*/
    }
}
