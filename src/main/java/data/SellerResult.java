package data;

public class SellerResult {

    private final String name;
    private double score;

    public SellerResult(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "SellerResult{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
