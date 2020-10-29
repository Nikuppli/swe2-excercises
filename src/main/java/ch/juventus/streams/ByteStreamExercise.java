package ch.juventus.streams;

import java.io.*;

public class ByteStreamExercise {
    public static void main(String[] args) throws IOException {
        copy("src/main/resources/hello.txt", "src/main/resources/output.txt");
    }

    private static void copy(String source, String destination) throws IOException {
        InputStream inputStream = new FileInputStream(source);
        OutputStream outputStream = new FileOutputStream(destination);

        int b;
        while ((b = inputStream.read()) != -1 ) {
            outputStream.write(b);
        }
        inputStream.close();
        outputStream.close();
    }
}
