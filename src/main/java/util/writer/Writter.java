package util.writer;

import data.SellerResult;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writter {

    public static void writeResultIntoFile(File file, List<SellerResult> results) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Result");
            writer.newLine();
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
