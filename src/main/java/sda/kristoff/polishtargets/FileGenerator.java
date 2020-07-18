package sda.kristoff.polishtargets;

import sda.kristoff.polishtargets.model.Location;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {

    public static void generate(Location location, String path){

        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(location.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
