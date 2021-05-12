package com.mentormate.report.util;

import com.google.gson.Gson;
import com.mentormate.report.exception.InvalidFilePathException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {

    private static final Gson GSON = new Gson();

    private FileUtils() {
        // the utils class should not be instantiatable
    }

    public static <T> T readJson(String path, Class<T> clazz) throws InvalidFilePathException {
        String content;
        try {
            content = Files.readString(Path.of(path));
        } catch (IOException e) {
            throw new InvalidFilePathException(path, e);
        }

        return GSON.fromJson(content, clazz);
    }

    public static void write(String path, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(content);
        } catch (IOException e) {
            throw new InvalidFilePathException(path, e);
        }
    }

    public static File touchFile(String filePath) {
        try {
            File file = new File(filePath);
            file.createNewFile();

            return file;
        } catch (IOException e) {
            throw new InvalidFilePathException(filePath, e);
        }
    }
}
