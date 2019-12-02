package dssc.cribbage;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PairsScore {

    public static int pairsScore(List<String> valuesList) {

        ValuesComparator comparator = new ValuesComparator();
        List<Integer> sortedValues = valuesList.stream().map(x -> comparator.getRunPlace(x)).collect(Collectors.toList());

        List<Integer> uniqueValues = sortedValues.stream().distinct().collect(Collectors.toList());

        List<Integer> repeatedNumbers = sortedValues.stream()
                .filter(e -> Collections.frequency(sortedValues, e) > 1)
                .distinct()
                .collect(Collectors.toList());

        int repeatedNumbersSize = repeatedNumbers.size();
        int uniqueValuesSize = uniqueValues.size();

        if(repeatedNumbersSize == 1) {
            if(uniqueValuesSize == 2) {
                return 12;
            } else if(uniqueValuesSize == 3) {
                return 8;
            } else return 2;
        } else if(repeatedNumbersSize == 2) {
            return 4;
        } else return 0;
    }
}
