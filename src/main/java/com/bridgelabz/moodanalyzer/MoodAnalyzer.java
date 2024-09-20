// to check mood is HAPPPY or SAD

package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    private String message;

    // Default constructor
    public MoodAnalyzer() {
    }

    // Constructor with message parameter
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    // without constructor
    public String analyseMood(String message) {

        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }

    // Using exception
    public String analyseMood() throws MoodAnalysisException {
        try {
            if (this.message == null) {
                throw new MoodAnalysisException("Invalid Mood: NULL message provided");
            }

            if (this.message.contains("Sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Invalid Mood: NULL message provided");
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();

        String message = "I am in any mood";
        String mood = moodAnalyser.analyseMood(message);

        System.out.println("Mood: " + mood);

        try {
            MoodAnalyzer moodAnalyserWithMessage = new MoodAnalyzer(null);  // Invalid input (null)
            String m = moodAnalyserWithMessage.analyseMood();
            System.out.println("Mood: " + m);
        } catch (MoodAnalysisException e) {
            System.out.println(e.getMessage());
        }

    }
}
