package sda.kristoff.polishtargets;

import org.junit.Before;
import org.junit.Test;
import sda.kristoff.polishtargets.model.Location;
import sda.kristoff.polishtargets.model.Village;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LocationAnalyzerTest {


    private List<Location> testLocations;


    @Before
    public void setUp() throws Exception {
        testLocations = new ArrayList<>();
        testLocations.add(new Village("Pcim Dolny", "KOSZALIŃSKIE"));
        testLocations.add(new Village("Mipc Dolny", "KOSZALIŃSKIE"));
        testLocations.add(new Village("Pcim", "KOSZALIŃSKIE"));
        testLocations.add(new Village("Pruszków", "WARSZAWSKIE"));
    }

    @Test
    public void shouldReturnTwoLocations() {

        List<Location> results = LocationAnalyzer.getLongestNameLocations(testLocations);

        assertEquals(2, results.size());

        List<Location> filteredByKoszalinskie = results.stream()
                .filter(loc -> {
                    System.out.println("Analyzing: " + loc.toString());
                    return loc.getVoivodeship().equals("KOSZALIŃSKIE");
                })
                .collect(Collectors.toList());

        assertEquals(2, filteredByKoszalinskie.size());

        List<String> resultNames = filteredByKoszalinskie.stream()
                .map(loc -> loc.getName())
                .collect(Collectors.toList());
        assertTrue(resultNames.contains("Mipc Dolny"));
        assertTrue(resultNames.contains("Pcim Dolny"));
    }

}