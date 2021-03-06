package sda.kristoff.polishtargets;

import sda.kristoff.polishtargets.model.Location;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println("Polish Targets App has started");
        List<String> loadedRows = DataLoader.loadFile(args[0]);
        Map<Integer, String> voivodeships = VoivodeshipMapper.mapData(loadedRows);
        List<Location> locations = LocationMapper.mapLocations(loadedRows, voivodeships);
        Location randomLocation = VacationTargetGenerator.getRandomLocation(locations);
        System.out.println(LocationAnalyzer.getLongestNameLocations(locations));
        FileGenerator.generate(randomLocation, "test.txt");
    }
}
