package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * implementation of ISymptomReader for read symptoms data in the file
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private final String fileName;


    /**
     * @param fileName the file who contain the list of symptoms
     */


    public ReadSymptomDataFromFile(String fileName) {

		this.fileName = "symptoms.txt";

    }


	/**
	 *
	 * @return a map contain the symptoms and their occurrences
	 * @throws IOException when an input / output error occurs while reading
	 */

	@Override
	public Map<String, Integer> readSymptoms() throws IOException {
		Map<String, Integer> counterSymptoms = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

			String line;
			while ((line = bufferedReader.readLine()) != null) {

				String symptom = line.trim();

					counterSymptoms.put(symptom, counterSymptoms.getOrDefault(symptom, 0) + 1);

				}

			return counterSymptoms;
		}


    }

}

