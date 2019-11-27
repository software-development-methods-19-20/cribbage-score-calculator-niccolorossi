package dssc.cribbage;

import java.util.*;

public class CribbageHand {

    private String hand;

    public CribbageHand(String hand) {
        this.hand = hand;
    }

    private List<String> handToValues() {
        List<String> valuesList = new ArrayList<>();
        for(int i=0; i<10; i=i+2) {
            valuesList.add(String.valueOf(this.hand.charAt(i)));
        }
        return valuesList;
    }

    private List<String> handToSuits() {
        List<String> suitsList = new ArrayList<>();
        for(int i=1; i<10; i=i+2) {
            suitsList.add(String.valueOf(this.hand.charAt(i)));
        }
        return suitsList;
    }

    private List<Integer> valuesToPoints(List<String> valuesList) {
        return ValuesToPoints.convertValuesToPoints(valuesList);
    }


    public int fifteenTwos() {
        List<String> valuesList = handToValues();
        List<Integer> pointsList = valuesToPoints(valuesList);
        return CountFifteens.fifteensTwoScore(pointsList);
    }

    public int runsScore() {
        List<String> valuesList = handToValues();

        return RunsScore.runsScore(valuesList);
    }
}
