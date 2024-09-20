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
    public String analyseMood() {
        try {
            if (this.message.contains("Sad")) {
                return "Sad";
            } else {
                return "Happy"; // Return Happy for any other message including "Happy"
            }
        } catch (NullPointerException e) {
            // Handle null scenario by returning Happy
            return "Happy";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();

        String message = "I am in any mood";
        String mood = moodAnalyser.analyseMood(message);

        System.out.println("Mood: " + mood);

        MoodAnalyzer moodAnalyzerWithNull = new MoodAnalyzer(null);  // Invalid input (null)
        String m = moodAnalyzerWithNull.analyseMood();
        System.out.println("Mood: " + m);

    }
}
