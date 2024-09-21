package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoodAnalyzerTest {

    @Test
    public void givenSadMoodMessage_ShouldReturnSadMood() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        assertEquals("SAD", mood);
    }

    @Test
    public void givenHappyMoodMessage_ShouldReturnHappyMood() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyzer.analyseMood();
        assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMood_ShouldThrowNullMoodException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, moodAnalyzer::analyseMood);
        assertEquals(MoodAnalysisErrorType.NULL_MOOD, exception.getErrorType());
    }

    @Test
    public void givenEmptyMood_ShouldThrowEmptyMoodException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        MoodAnalysisException exception = assertThrows(MoodAnalysisException.class, moodAnalyzer::analyseMood);
        assertEquals(MoodAnalysisErrorType.EMPTY_MOOD, exception.getErrorType());
    }
}
