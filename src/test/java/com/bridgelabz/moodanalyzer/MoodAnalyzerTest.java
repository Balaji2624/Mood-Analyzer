package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    // TC 1.1 :
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String message = "I am in Sad Mood";

        String mood = moodAnalyzer.analyseMood(message);

        Assertions.assertEquals("Sad", mood);
    }

    // TC 1.2 :
    @Test
    public void givenAnyMoodMessage_ShouldReturnHappyMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String message = "I am in Any Mood";
        String mood = moodAnalyzer.analyseMood(message);
        Assertions.assertEquals("Happy", mood);
    }

    // TC 1.1- repeat-using constructor
    // Test case for message "I am in Sad Mood" passed in constructor
    @Test
    public void givenMessageInConstructor_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");

        String mood = moodAnalyzer.analyseMood();

        Assertions.assertEquals("Sad", mood);
    }

    // TC 1.2- repeat using constructor
    @Test
    public void givenMessageInConstructor_WhenHappy_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");

        String mood = moodAnalyzer.analyseMood();

        Assertions.assertEquals("Happy", mood);
    }

    // TC 2.1 : using exception
    // Test case for null message in constructor, should return Happy
    @Test
    public void givenNullMessageInConstructor_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);

        String mood = moodAnalyzer.analyseMood();

        Assertions.assertEquals("Happy", mood);
    }
}



