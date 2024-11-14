package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {


    /**
     * @param fileName the name of output file
     * @param symptoms the map contain the symptoms and their occurrences
     * @throw IOException if an output or input error occurs
     */

    void writeSymptoms(String fileName, Map<String, Integer> symptoms) throws IOException;

}
