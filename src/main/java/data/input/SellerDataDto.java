package data.input;

public class SellerDataDto {

    private String name;
    private int totalSales;
    private int salesPeriod;
    private double experienceMultiplier;


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

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }

    public void setSalesPeriod(int salesPeriod) {
        this.salesPeriod = salesPeriod;
    }

    public void setExperienceMultiplier(double experienceMultiplier) {
        this.experienceMultiplier = experienceMultiplier;
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
