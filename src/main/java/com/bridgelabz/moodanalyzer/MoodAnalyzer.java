package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer() {
        this.message = "";
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    // Analyze mood based on instance message
    public String analyseMood() throws MoodAnalysisException {
        validateMood(this.message);
        if (this.message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    // Analyze mood based on a passed message
    public String analyseMood(String message) throws MoodAnalysisException {
        validateMood(message);
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    // Helper method to validate mood and throw exceptions
    private void validateMood(String mood) throws MoodAnalysisException {
        if (mood == null) {
            throw new MoodAnalysisException("Mood cannot be null", MoodAnalysisErrorType.NULL_MOOD);
        }
        if (mood.trim().isEmpty()) {
            throw new MoodAnalysisException("Mood cannot be empty", MoodAnalysisErrorType.EMPTY_MOOD);
        }
    }

    public static void main(String[] args) {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
            System.out.println("Mood: " + moodAnalyzer.analyseMood());

            moodAnalyzer = new MoodAnalyzer("");
            System.out.println("Mood: " + moodAnalyzer.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("Error: " + e.getMessage() + " (" + e.getErrorType() + ")");
        }
    }
}
