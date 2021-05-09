package util.writer;

import data.SellerResult;
import util.reader.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvWriter {

    private static final String COLUMN_NAME = "Name";
    private static final String COLUMN_SCORE = "Score";
    private static final String SEPARATOR = ",";


    public static void writeResultIntoFile(File file, List<SellerResult> results) {

        StringBuilder csvContent = new StringBuilder();
        // add csv header
        csvContent.append(COLUMN_NAME).append(SEPARATOR).append(COLUMN_SCORE);

        for (SellerResult result : results) {
            csvContent.append(result.getName()).append(SEPARATOR).append(result.getScore());
        }

        FileUtils.writeString(path, csvContent.toString());


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            writer.write("Name  , Score");
            writer.newLine();

            for (SellerResult result : results) {
                writer.write(result.getName() + ", " + result.getScore());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
