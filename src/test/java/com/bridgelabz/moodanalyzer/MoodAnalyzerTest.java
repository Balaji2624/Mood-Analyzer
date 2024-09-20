package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String message = "I am in Sad Mood";

        String mood = moodAnalyzer.analyseMood(message);

        Assertions.assertEquals("Sad", mood);
    }
}


