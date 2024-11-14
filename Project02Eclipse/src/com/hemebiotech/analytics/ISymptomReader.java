package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.Map;


/**
 * interface for reading symptoms in a file
 * 
 */
public interface ISymptomReader {
    /**
     * Reads symptoms data and returns a map of each symptom and their occurrences
     * *
     * * @return a map of symptoms
     * * @throws IOException when an output or input error occurs
     */
    Map<String, Integer> readSymptoms() throws IOException;

}

