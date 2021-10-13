package com.assia.exercises.words;

public interface WordStatistics {

    /**
     * Calculate some statistics about the received text.
     * Ignore punctuation marks and whitespace characters.
     *
     * @param text
     * @return statistics.
     */
    public WordStatisticsResults calculateWordStatistics(String text);
}
