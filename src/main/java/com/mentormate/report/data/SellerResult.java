package com.mentormate.report.data;

public class SellerResult {

    private final String name;
    private final double score;

    public SellerResult(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "SellerResult{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
