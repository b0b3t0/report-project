package com.mentormate.report;

import com.mentormate.report.data.SellerResult;
import com.mentormate.report.data.input.ReportRulesDto;
import com.mentormate.report.util.ReportResultCalculator;
import com.mentormate.report.data.input.SellerDataDto;
import com.mentormate.report.util.FileUtils;
import com.mentormate.report.util.writer.CsvWriter;

import java.io.File;
import java.util.List;
import java.util.function.Supplier;

public class ReportConsoleApplication {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Please provide path to data file and report definition file");
            System.err.println("example: java -jar reports-client.jar path/to/data.json path/to/definition.json");
            System.exit(1);
        }

        String dataFilePath = args[0];
        String reportDefinitionFilePath = args[1];
        String outputFilePath = "./report.csv";

        SellerDataDto[] data = runCommand("read json data", () ->
                FileUtils.readJson(dataFilePath, SellerDataDto[].class));

        ReportRulesDto rules = runCommand("read jason rules", () ->
                FileUtils.readJson(reportDefinitionFilePath, ReportRulesDto.class));

        runCommand("Write csv file", () -> {
            File file = FileUtils.touchFile(outputFilePath);
            List<SellerResult> results = ReportResultCalculator.calculateResult(data, rules);
            CsvWriter.writeResultIntoFile(file.getPath(), results);
            return null;
        });
    }

    private static <T> T runCommand(String context, Supplier<T> command) {
        try {
            return command.get();
        } catch (Exception e) {
            System.err.println("Failed " + context + " error: " + e.getMessage());
            System.exit(1);
        }
        return command.get();
    }
}
