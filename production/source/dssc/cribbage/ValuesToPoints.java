package dssc.cribbage;

import java.util.*;

public class ValuesToPoints {

    private static final Map<String, Integer> valuesToPoints;
    static {
        HashMap<String, Integer> aMap = new HashMap<>();
        aMap.put("A", 1);
        aMap.put("2", 2);
        aMap.put("3", 3);
        aMap.put("4", 4);
        aMap.put("5", 5);
        aMap.put("6", 6);
        aMap.put("7", 7);
        aMap.put("8", 8);
        aMap.put("9", 9);
        aMap.put("0", 10);
        aMap.put("J", 10);
        aMap.put("Q", 10);
        aMap.put("K", 10);
        valuesToPoints = Collections.unmodifiableMap(aMap);
    }


    public static List<Integer> convertValuesToPoints(List<String> valuesList) {
        List<Integer> pointsList = new ArrayList<>();
        for(int i=0; i<valuesList.size(); i++) {
            pointsList.add(valuesToPoints.get(valuesList.get(i)));
        }
        return pointsList;
    }

}
