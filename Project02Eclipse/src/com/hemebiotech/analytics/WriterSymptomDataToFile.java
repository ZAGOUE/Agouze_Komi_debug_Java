package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriterSymptomDataToFile implements ISymptomWriter {


    /**
     * write symptoms and their occurrences in output file.
     * @param fileName the name of output file
     * @param symptoms the map contain the symptoms and their occurrences
     * @throw IOException if an output or input error occurs
     */

    @Override
    public void writeSymptoms(String fileName, Map<String, Integer> symptoms) throws IOException {
        System.out.println("Start writing Symptoms to " + fileName);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("result.out"));

            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                String line = entry.getKey() + " " + entry.getValue();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                System.out.println("Write to file : " + line);
            }
            bufferedWriter.close();
            System.out.println("Write completed for file : " + fileName);

        }
        catch (IOException e) {
            System.err.println("Error writing to file : " + e.getMessage());
            throw e;
        }
    }
}
