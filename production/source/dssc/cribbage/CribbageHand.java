package dssc.cribbage;

import java.util.*;

public class CribbageHand {

    private List<String> valuesList;
    private List<String> suitsList;

    private List<String> handToValues(String hand) {
        List<String> valuesList = new ArrayList<>();
        for(int i=0; i<10; i=i+2) {
            valuesList.add(String.valueOf(hand.charAt(i)));
        }
        return valuesList;
    }

    private List<String> handToSuits(String hand) {
        List<String> suitsList = new ArrayList<>();
        for(int i=1; i<10; i=i+2) {
            suitsList.add(String.valueOf(hand.charAt(i)));
        }
        return suitsList;
    }

    public CribbageHand(String hand) {
        this.valuesList = handToValues(hand);
        this.suitsList = handToSuits(hand);
    }

    private List<Integer> valuesToPoints(List<String> valuesList) {
        return ValuesToPoints.convertValuesToPoints(valuesList);
    }

    public int fifteenTwos() {
        List<Integer> pointsList = valuesToPoints(this.valuesList);
        return CountFifteens.fifteensTwoScore(pointsList);
    }

    public int runsScore() {
        return RunsScore.runsScore(this.valuesList);
    }

    public int pairsScore() {
        return PairsScore.pairsScore(this.valuesList);
    }

    public int flushScore() {
        return FlushScore.flushScore(this.suitsList);
    }

    public int jackScore() {
        return JackScore.jackScore(this.valuesList, this.suitsList);
    }

    public int score() {
        List<Integer> pointsList = valuesToPoints(this.valuesList);
        return CountFifteens.fifteensTwoScore(pointsList) +
                RunsScore.runsScore(this.valuesList) +
                PairsScore.pairsScore(this.valuesList) +
                FlushScore.flushScore(this.suitsList) +
                JackScore.jackScore(this.valuesList, this.suitsList);
    }
}
