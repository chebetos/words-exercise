package com.assia.exercises.words;

import java.util.Map;

public interface WordStatisticsResults {

    Map<String, Integer> getWordCount();

    /**
     * After sorting all the words, identify the one in the middle.
     * If there are an odd number of words, just ignore the last word.
     */
    String getMedianWord();

    /**
     * Return the most frequent word in the received text.
     */
    String getModeWord();
}
