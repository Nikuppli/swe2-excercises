package ch.juventus.streams;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class JsonExercise {
    public static void main(String[] args) throws IOException, ParseException {
        MyReader reader = new MyReader();
        MyWriter writer = new MyWriter();

        writer.writeJson("src/main/ressources/package.json");
        reader.readJson("src/main/ressources/package.json");

    }
}
