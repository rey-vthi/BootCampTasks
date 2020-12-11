package com.step.coins;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    @Test
    public void shouldGetChancesOfGettingTailsWhenFlipping() {
        Coin coin = new Coin();
        assertEquals(0.5, coin.probabilityOfGettingTails(), 0.0);
    }

    @Test
    public void shouldGetChancesOfNotGettingTailsWhenFlipping() {
        Coin coin = new Coin();
        assertEquals(0.5, coin.probabilityOfNotGettingTails(), 0.0);

    }
}
