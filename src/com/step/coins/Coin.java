package com.step.coins;

import java.util.Arrays;

public class Coin {
    private final int numOfFaces;
    private final Faces[] faces;

    public Coin() {
        this.numOfFaces = 2;
        this.faces = new Faces[]{Faces.TAIL, Faces.HEAD};
    }

    public double probabilityOfGettingTails() {
        long count = Arrays.stream(faces).filter((face) -> face == Faces.TAIL).count();
        return (double) count / numOfFaces;
    }

    public double probabilityOfNotGettingTails() {
        return 1.0 - this.probabilityOfGettingTails();
    }
}
