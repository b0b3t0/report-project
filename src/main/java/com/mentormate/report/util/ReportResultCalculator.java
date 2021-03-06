package com.mentormate.report.util;

import com.mentormate.report.data.SellerResult;
import com.mentormate.report.data.input.ReportRulesDto;
import com.mentormate.report.data.input.SellerDataDto;

import java.util.ArrayList;
import java.util.List;

public class ReportResultCalculator {

    public static List<SellerResult> calculateResult(SellerDataDto[] sellers, ReportRulesDto rules) {
        List<SellerResult> resultList = new ArrayList<>();

        for (SellerDataDto seller : sellers) {
            if (seller.getSalesPeriod() > rules.getPeriodLimit()) {
                continue;
            }

            double score = calculateScore(rules, seller);

            if (score >= rules.getTopPerformersThreshold()) {
                SellerResult result = new SellerResult(seller.getName(), score);
                resultList.add(result);
            }
        }

        return resultList;
    }

    private static double calculateScore(ReportRulesDto rules, SellerDataDto seller) {
        double sellerTotalSales = seller.getTotalSales();
        double sellerSalesPeriod = seller.getSalesPeriod();

        if (rules.isUseExperienceMultiplier()) {
            return sellerTotalSales / sellerSalesPeriod * seller.getExperienceMultiplier();
        } else {
            return sellerTotalSales / sellerSalesPeriod;
        }
    }
}
