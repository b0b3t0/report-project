package util;

import java.io.File;
import java.io.IOException;

public class FileCreator {

    public static File createFile(String filePath) {

        File file = new File(filePath);
        boolean result;
        try {
            result = file.createNewFile();
            if (result) {
                System.out.println("File created " + file.getName() + "\n" + " at location: " + file.getCanonicalPath());
            } else {
                System.out.println("File " + file.getName() + " already exist at location: " + file.getCanonicalPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }
}
