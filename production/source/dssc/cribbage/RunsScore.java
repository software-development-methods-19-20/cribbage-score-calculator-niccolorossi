package dssc.cribbage;

import java.util.*;
import java.util.stream.Collectors;

public class RunsScore {

    public static int runsScore(List<String> values) {

       ValuesComparator comparator = new ValuesComparator();
       Collections.sort(values, comparator);

       List<Integer> sortedValues = values.stream().map(x -> comparator.getRunPlace(x)).collect(Collectors.toList());

       List<Integer> uniqueValues = sortedValues.stream().distinct().collect(Collectors.toList());

       List<Integer> repeatedNumbers = sortedValues.stream()
               .filter(e -> Collections.frequency(sortedValues, e) > 1)
               .distinct()
               .collect(Collectors.toList());

       int runsToCount = 1;
       int difference = repeatedNumbers.size();
       if(difference == 1) {
           runsToCount = 2;
       } else if (difference == 2 && repeatedNumbers.size() == 1) {
           runsToCount = 3;
       } else if (difference == 2 && repeatedNumbers.size() == 2) {
           runsToCount = 4;
       }

       int runSize = 0;
       for (int i = 0; i < uniqueValues.size() - 1; i++) {
           if (uniqueValues.get(i) +1  != uniqueValues.get(i+1)) {
               continue;
           } else runSize++;
       }
       if (runSize != 0) runSize += 1;
       return runSize*runsToCount;
    }
}
