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
    // using constructor message passed
    public String analyseMood() {

        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }
    // without constructor
    public String analyseMood(String message) {

        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();

        String message = "I am in any mood";
        String mood = moodAnalyser.analyseMood(message);

        System.out.println("Mood: " + mood);

        MoodAnalyzer moodAnalyserWithMessage = new MoodAnalyzer("I am feeling so happy today!");
        String m = moodAnalyserWithMessage.analyseMood();
        System.out.println("Mood: " + m);

    }
}
