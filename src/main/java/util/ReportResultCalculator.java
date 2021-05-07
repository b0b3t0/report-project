package util;

import data.input.ReportRulesDto;
import data.input.SellerDataDto;
import data.SellerResult;

import java.util.ArrayList;
import java.util.List;

public class ReportResultCalculator {

    public static List<SellerResult> calcResult(List<SellerDataDto> sellers, ReportRulesDto rules) {
        List<SellerResult> resultList = new ArrayList<>();

        for (SellerDataDto seller : sellers) {
            SellerResult result = new SellerResult(seller.getName());

            if (seller.getSalesPeriod() > rules.getPeriodLimit()) {
                break;
            }

            if (rules.isUseExperienceMultiplier()) {
                result.setScore((double)seller.getTotalSales() / (seller.getSalesPeriod() * seller.getExperienceMultiplier()));
            } else {
                result.setScore((double)seller.getTotalSales() / seller.getSalesPeriod());
            }

            if (result.getScore() >= rules.getTopPerformersThreshold()) {
                resultList.add(result);
            }

        }

        return resultList;
    }
}
