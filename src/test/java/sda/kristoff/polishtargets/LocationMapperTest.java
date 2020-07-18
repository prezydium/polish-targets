package sda.kristoff.polishtargets;

import org.junit.Test;
import sda.kristoff.polishtargets.model.Location;
import sda.kristoff.polishtargets.util.TestDataProvider;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class LocationMapperTest {


    @Test
    public void testMapping(){
        //given
        List<String> rawData = TestDataProvider.rawData;
        Map<Integer, String> mappedVoivodeships = TestDataProvider.mappedVoivodeships;
        //when
        List<Location> result = LocationMapper.mapLocations(rawData, mappedVoivodeships);
        //then
        assertEquals(4, result.size());
        List<String> resultNames = result.stream()
                .map(Location::getName)
                .collect(Collectors.toList());

        assertTrue(resultNames.contains("Dół"));
        assertFalse(resultNames.contains("XXXXX"));

    }

}