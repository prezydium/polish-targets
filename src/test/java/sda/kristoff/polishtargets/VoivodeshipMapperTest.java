package sda.kristoff.polishtargets;

import org.junit.Assert;
import org.junit.Test;
import sda.kristoff.polishtargets.util.TestDataProvider;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VoivodeshipMapperTest {


    @Test
    public void testMapping(){
        //given
        List<String> rawData = TestDataProvider.rawData;

        //when
        Map<Integer, String> results = VoivodeshipMapper.mapData(rawData);

        //then
        assertEquals(2, results.size());
        assertTrue(results.containsValue("PRUSY KRÓLEWSKIE"));
    }


}