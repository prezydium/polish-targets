package sda.kristoff.polishtargets;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<String> loadedRows = DataLoader.loadFile("TERC.csv");
        System.out.println(loadedRows);
        VoivodeshipMapper.mapData(loadedRows);
    }
}
