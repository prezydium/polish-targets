package sda.kristoff.polishtargets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VoivodeshipMapper {


    public static Map<Integer, String> mapData(List<String> loadedRawData) {

        Map<Integer, String> voivodeshipMap = new HashMap<>();

        loadedRawData.stream()
                .filter(line -> line.contains("województwo"))
                .forEach(filteredLine -> {
                            String[] splitLine = filteredLine.split(";");
                            Integer number = Integer.valueOf(splitLine[0]);
                            String name = splitLine[4];
                            voivodeshipMap.put(number, name);
                        }
                );
        return voivodeshipMap;
    }
}
