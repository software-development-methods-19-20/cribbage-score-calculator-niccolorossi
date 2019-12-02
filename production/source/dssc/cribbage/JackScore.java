package dssc.cribbage;

import java.util.ArrayList;
import java.util.List;

public class JackScore {

    public static int jackScore(List<String> valuesList, List<String> suitsList) {

        if(!valuesList.stream().anyMatch(x -> x.equals("J"))) {
            return 0;
        } else {
            List<Integer> jackIndexes = new ArrayList<>();
            for(int i=0; i<valuesList.size()-1; i++) {
                String value = valuesList.get(i);
                if(value.equals("J")) {
                    jackIndexes.add(i);
                }
            }

            int counter = 0;
            while(counter < jackIndexes.size()) {
                String jackSuite = suitsList.get(counter);
                if(jackSuite.equals(suitsList.get(4))) {
                    counter++;
                    break;
                }
            }

            if (counter != jackIndexes.size() -1) {
                return 1;
            } else return 0;


        }
    }
}
