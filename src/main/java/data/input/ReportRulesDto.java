package data.input;

public class ReportRulesDto {

    private final int topPerformersThreshold;
    private final boolean useExperienceMultiplier;
    private final int periodLimit;


    public ReportRulesDto(int topPerformersThreshold, boolean useExperienceMultiplier, int periodLimit) {
        this.topPerformersThreshold = topPerformersThreshold;
        this.useExperienceMultiplier = useExperienceMultiplier;
        this.periodLimit = periodLimit;
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

    @Override
    public String toString() {
        return "ReportRulesDto{" +
                "topPerformersThreshold=" + topPerformersThreshold +
                ", useExperienceMultiplier=" + useExperienceMultiplier +
                ", periodLimit=" + periodLimit +
                '}';
    }
}
