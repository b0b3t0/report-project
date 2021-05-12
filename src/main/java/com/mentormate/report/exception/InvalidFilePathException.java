package com.mentormate.report.exception;

public class InvalidFilePathException extends RuntimeException {

    private final String filePath;

    public InvalidFilePathException(String filePath, Throwable cause) {
        super("Could not read file at path " + filePath, cause);
        this.filePath = filePath;
    }
}
