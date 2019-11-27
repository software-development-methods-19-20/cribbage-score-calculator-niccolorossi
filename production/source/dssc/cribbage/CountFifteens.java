package dssc.cribbage;

import java.util.List;

public class CountFifteens {

    public static int sumsOfTwo(List<Integer> values) {
        int score = 0;
        int size = values.size();
        for(int i=0; i<size; i++) {
            int firstValue = values.get(i);
            for(int j=i+1; j<size; j++) {
                if(firstValue + values.get(j) == 15) score += 2;
            }
        }
        return score;
    }

    public static int sumsOfThree(List<Integer> values) {
        int score = 0;
        int size = values.size();
        for(int i=0; i<size; i++) {
            for(int j=i+1; j<size; j++) {
                int firstValue = values.get(i);
                int secondValue = values.get(j);
                for(int k=j+1; k<size; k++) {
                    if(firstValue + secondValue + values.get(k) == 15) score += 2;
                }
            }
        }
        return score;
    }

    public static int sumsOfFour(List<Integer> values) {
        int score = 0;
        int size = values.size();
        for(int i=0; i<size; i++) {
            int sum = values.stream().reduce(Integer::sum).get() - values.get(i);
            if (sum == 15) score += 2;
        }
        return score;
    }

    public static int fifteensTwoScore(List<Integer> values) {
        int score = sumsOfFour(values) + sumsOfThree(values) + sumsOfTwo(values);
        return score;
    }

}
