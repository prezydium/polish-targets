package sda.kristoff.polishtargets.util;

import java.util.List;
import java.util.Map;

public class TestDataProvider {

    public static final List<String> rawData = List.of(
            "02;;;;DOLNOŚLĄSKIE;województwo;2020-01-01",
            "02;01;;;bolesławiecki;powiat;2020-01-01",
            "02;01;01;1;Bolesławiec;gmina miejska;2020-01-01",
            "02;01;02;2;Bolesławiec;gmina wiejska;2020-01-01",
            "02;02;05;2;Dzierżoniów;gmina wiejska;2020-01-01",
            "67;04;01;3;Dół;gmina miejsko-wiejska;2020-01-01",
            "67;;;;PRUSY KRÓLEWSKIE;województwo;2020-01-01");

    public static final Map<Integer, String> mappedVoivodeships = Map.of(
            2, "DOLNOŚLĄSKIE",
            67, "PRUSY KRÓLEWSKIE"
    );
}
