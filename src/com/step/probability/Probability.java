package com.step.probability;

import java.util.Objects;

public class Probability {
    private final double value;

    public Probability(double value) {
        this.value = value;
    }

    public Probability not() {
        return new Probability(1 - this.value);
    }

    public Probability and(Probability otherProbability) {
        return new Probability(this.value * otherProbability.value);
    }

    public Probability or(Probability otherProbability) {
        Probability otherComplement = otherProbability.not();;
        Probability thisComplement = this.not();
        return (thisComplement.and(otherComplement)).not();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
