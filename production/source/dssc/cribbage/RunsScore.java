package dssc.cribbage;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RunsScore {

    public static int runsScore(List<String> values) {

        ValuesComparator comparator = new ValuesComparator();
        Collections.sort(values, comparator);

       List<Integer> sortedAndParsed = values.stream().map(x -> comparator.getRunPlace(x)).collect(Collectors.toList());

       int run = 0;
       for(int i=0; i<sortedAndParsed.size()-1; i++) {
           if(sortedAndParsed.get(i)+1 != sortedAndParsed.get(i+1)) {
               continue;
           } else run++;
       }

        return run+1;
    }
}
