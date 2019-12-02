package test;

import dssc.cribbage.CribbageHand;
import org.junit.jupiter.api.Test;

import javax.security.auth.login.CredentialException;

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
    void testFourRun() {
        CribbageHand cribbageHand = new CribbageHand("6DJH4H7C5H");
        assertThat(cribbageHand.runsScore(), is(4));
    }

    @Test
    void testEightRun() {
        CribbageHand cribbageHand = new CribbageHand("5S4S2S6H5H");
        assertThat(cribbageHand.runsScore(), is(6));
    }

    @Test
    void testSinglePair() {
        CribbageHand cribbageHand = new CribbageHand("5S4S2S6H5H");
        assertThat(cribbageHand.pairsScore() ,is(2));
    }

    @Test
    void testFlush() {
        CribbageHand cribbageHand = new CribbageHand("5S4S2SAS5H");
        assertThat(cribbageHand.flushScore(), is(4));
    }

    @Test
    void testJack() {
        CribbageHand cribbageHand = new CribbageHand("JH4S2SAS5H");
        assertThat(cribbageHand.jackScore(), is(1));
    }

    @Test
    void lowestScore() {
        CribbageHand cribbageHand = new CribbageHand("0DJHQSAC9D");
        assertThat(cribbageHand.score(), is(4));
    }

    @Test
    void highestScore() {
        CribbageHand cribbageHand = new CribbageHand("5H5D5SJC5C");
        assertThat(cribbageHand.score(), is(29));
    }

}
