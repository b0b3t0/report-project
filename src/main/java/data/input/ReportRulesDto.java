package data.input;

public class ReportRulesDto {

    private int topPerformersThreshold;
    private boolean useExperienceMultiplier;
    private int periodLimit;


    public ReportRulesDto () {
    }

    public int getTopPerformersThreshold() {
        return topPerformersThreshold;
    }

    public boolean isUseExperienceMultiplier() {
        return useExperienceMultiplier;
    }

    public int getPeriodLimit() {
        return periodLimit;
    }

    public void setTopPerformersThreshold(int topPerformersThreshold) {
        this.topPerformersThreshold = topPerformersThreshold;
    }

    public void setUseExperienceMultiplier(boolean useExperienceMultiplier) {
        this.useExperienceMultiplier = useExperienceMultiplier;
    }

    public void setPeriodLimit(int periodLimit) {
        this.periodLimit = periodLimit;
    }

    @Override
    public String toString() {
        return "ReportRulesDto{" +
                "topPerformersThreshold=" + topPerformersThreshold +
                ", useExperienceMultiplier=" + useExperienceMultiplier +
                ", periodLimit=" + periodLimit +
                '}';
    }
}
