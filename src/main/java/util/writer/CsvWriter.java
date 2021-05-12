package util.writer;

import data.SellerResult;
import util.FileUtils;
import java.util.List;

public class CsvWriter {

    private static final String COLUMN_NAME = "Name";
    private static final String COLUMN_SCORE = "Score";
    private static final String SEPARATOR = ",";


    public static void writeResultIntoFile(String path, List<SellerResult> results) {

        StringBuilder csvContent = new StringBuilder();
        // add csv header
        csvContent.append(COLUMN_NAME).append(SEPARATOR).append(COLUMN_SCORE)
                .append(System.lineSeparator());

        for (SellerResult result : results) {
            csvContent.append(result.getName()).append(SEPARATOR).append(result.getScore())
                    .append(System.lineSeparator());
        }

        FileUtils.write(path, csvContent.toString());

    }
}
