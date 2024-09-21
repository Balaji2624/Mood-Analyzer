package com.bridgelabz.moodanalyzer;

public class MoodAnalysisException extends Exception {
    private MoodAnalysisErrorType errorType;

    public MoodAnalysisException(String message, MoodAnalysisErrorType errorType) {
        super(message);
        this.errorType = errorType;
    }

    public MoodAnalysisErrorType getErrorType() {
        return errorType;
    }
}
