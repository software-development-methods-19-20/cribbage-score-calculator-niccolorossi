package dssc.cribbage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RunsScore {

    public static int runsScore(List<String> values) {

        ValuesComparator comparator = new ValuesComparator();
        Collections.sort(values, comparator);

       List<Integer> sortedAndParsed = values.stream().map(x -> comparator.getRunPlace(x)).collect(Collectors.toList());
       List<Integer> uniqueValuesList = sortedAndParsed.stream().distinct().collect(Collectors.toList());

       int multiplier = (sortedAndParsed.size()-uniqueValuesList.size()) + 1;

       int count = 0;
       for (int i = 0; i < uniqueValuesList.size() - 1; i++) {
           if (uniqueValuesList.get(i) +1  != uniqueValuesList.get(i+1)) {
               continue;
           } else count++;
       }
       if (count != 0) count += 1;
       return count*multiplier;
    }
}
