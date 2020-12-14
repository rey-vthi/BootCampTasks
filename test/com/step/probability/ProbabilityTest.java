package com.step.probability;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProbabilityTest {
    @Test
    public void shouldGetProbabilityOfGettingTailsWhenACoinIsFlipped() {
        Probability probability = new Probability(0.5);
        Probability probabilityOfGettingTails = probability.not();
        assertEquals(probabilityOfGettingTails, probability);
    }

    @Test
    public void shouldGetProbabilityOfGettingTailsWhenTwoCoinsAreFlipped() {
        Probability probabilityOfGettingTails1 = new Probability(0.5);
        Probability probabilityOfGettingTails2 = new Probability(0.5);
        Probability probabilityOfGettingTails = probabilityOfGettingTails1.and(probabilityOfGettingTails2);
        assertEquals(new Probability(0.25), probabilityOfGettingTails);
    }

    @Test
    public void shouldGetProbabilityOfGettingAtleastOneTailsWhenTwoCoinsAreFlipped() {
        Probability probabilityOfGettingTails1 = new Probability(0.5);
        Probability probabilityOfGettingTails2 = new Probability(0.5);
        Probability probabilityOfGettingTails = probabilityOfGettingTails1.or(probabilityOfGettingTails2);
        assertEquals(new Probability(0.75), probabilityOfGettingTails);
    }
}
