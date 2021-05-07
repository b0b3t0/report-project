package data.input;

public class SellerDataDto {

    private final String name;
    private final int totalSales;
    private final int salesPeriod;
    private final double experienceMultiplier;


    public SellerDataDto(String name, int totalSales, int salesPeriod, double experienceMultiplier) {
        this.name = name;
        this.totalSales = totalSales;
        this.salesPeriod = salesPeriod;
        this.experienceMultiplier = experienceMultiplier;
    }

    public String getName() {
        return name;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public int getSalesPeriod() {
        return salesPeriod;
    }

    public double getExperienceMultiplier() {
        return experienceMultiplier;
    }

    @Override
    public String toString() {
        return "SellerDataDto{" +
                "name='" + name + '\'' +
                ", totalSales=" + totalSales +
                ", salesPeriod=" + salesPeriod +
                ", experienceMultiplier=" + experienceMultiplier +
                '}';
    }
}
