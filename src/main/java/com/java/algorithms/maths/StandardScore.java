package com.java.algorithms.maths;

public final class StandardScore {
    private StandardScore() {
    }

    public static double zScore(double num, double mean, double stdDev) {
        return (num - mean) / stdDev;
    }
}
