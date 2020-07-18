package sda.kristoff.polishtargets;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VoivodeshipMapperTest {


    @Test
    public void testMapping(){
        //given
        List<String> rawData = List.of(
       "02;;;;DOLNOŚLĄSKIE;województwo;2020-01-01",
       "02;01;;;bolesławiecki;powiat;2020-01-01",
       "02;01;01;1;Bolesławiec;gmina miejska;2020-01-01",
       "02;01;02;2;Bolesławiec;gmina wiejska;2020-01-01",
       "67;;;;PRUSY KRÓLEWSKIE;województwo;2020-01-01");

        //when
        Map<Integer, String> results = VoivodeshipMapper.mapData(rawData);

        //then
        assertEquals(2, results.size());
        assertTrue(results.containsValue("PRUSY KRÓLEWSKIE"));
    }


}