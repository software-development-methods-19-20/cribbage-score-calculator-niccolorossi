package dssc.cribbage;

import java.util.Comparator;

public class ValuesComparator implements Comparator<String> {

    public int getRunPlace(String value) {
        if(value.equals("A")) {
            return 1;
        } else if(value.equals("J")) {
            return 11;
        } else if(value.equals("Q")) {
            return 12;
        } else if(value.equals("K")) {
            return 13;
        } else return Integer.parseInt(value);
    }

    @Override
    public int compare(String firstValue, String secondValue) {

        int firstPoint = getRunPlace(firstValue);
        int secondPoint = getRunPlace(secondValue);

        if(firstPoint < secondPoint) {
            return -1;
        } else if(firstPoint > secondPoint) {
            return 1;
        } else return 0;

    }
}
