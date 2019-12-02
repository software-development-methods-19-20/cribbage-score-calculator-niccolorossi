package dssc.cribbage;

import java.util.List;

public class FlushScore {

    public static int flushScore(List<String> suitsList) {

        boolean toReturn = true;
        String suit = suitsList.get(0);
        for(int i=1; i<4; i++) {
            toReturn = toReturn && (suitsList.get(i).equals(suit));
        }

        if(toReturn) {
            return 4;
        } else return 0;
    }
}
