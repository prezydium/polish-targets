package sda.kristoff.polishtargets;

import sda.kristoff.polishtargets.model.Location;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class LocationAnalyzer {

    public static List<Location> getLongestNameLocations(List<Location> locations) {
        OptionalInt optionalOfMaxNameLength = locations.stream()
                .mapToInt(loc -> loc.getName().length())
                .max();

        int maxNameLength = optionalOfMaxNameLength.orElse(0);

        return locations.stream()
                .filter(loc -> loc.getName().length() == maxNameLength)
                .collect(Collectors.toList());
    }

    public static Map<String, List<Location>> getLongestNameLocationsByVoivodeships(List<Location> locations){
        Map<String, List<Location>> longestNamesByVoivodeships = new HashMap<>();
        locations.stream()
                .collect(Collectors.groupingBy(location -> location.getVoivodeship()))
        .forEach((key, value) ->{
            longestNamesByVoivodeships.put(key, getLongestNameLocations(value));
        } );
        return longestNamesByVoivodeships;
    }



}
