package test;

import dssc.cribbage.CribbageHand;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CribbageScoreTest {

    @Test
    void testFifteenTwo() {
        CribbageHand cribbageHand = new CribbageHand("6DJH4H7C5H");
        assertThat(cribbageHand.fifteenTwos(), is(4));
    }

    @Test
    void testAnotherFifteenTwo() {
        CribbageHand cribbageHand = new CribbageHand("5S4S2S6H5H");
        assertThat(cribbageHand.fifteenTwos(), is(4));
    }

    @Test
    void TestRunFour() {
        CribbageHand cribbageHand = new CribbageHand("6DJH4H7C5H");
        assertThat(cribbageHand.runsScore(), is(4));
    }

}
