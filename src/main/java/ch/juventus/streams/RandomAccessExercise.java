package ch.juventus.streams;

import java.io.IOException;

public class RandomAccessExercise {

    public static void main(String[] args) throws IOException {
        MyReader reader = new MyReader();
        MyWriter writer = new MyWriter();

        reader.readAtPosition("src/main/ressources/hello.txt", 4);
        writer.writeAtPosition("src/main/ressources/outputPosition.txt", 5);
    }
}