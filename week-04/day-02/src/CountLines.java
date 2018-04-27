// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.


import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.next();
        Path myFile = Paths.get(filename);
        try {
            long lineCount = Files.lines(myFile).count();
            System.out.println(lineCount);
        } catch (IOException e) {
            System.out.println("0");
        }

    }
}