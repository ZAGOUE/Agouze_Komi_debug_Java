package com.hemebiotech.analytics;



import java.util.Map;
import java.util.TreeMap;


public class AnalyticsCounter {

	private final Map<String, Integer> symptoms;

	/**
	 * @param symptoms, a map contain the symptoms and their occurrences
	 */

	public AnalyticsCounter(Map<String, Integer> symptoms) {
		this.symptoms = symptoms;

	}

	/**
	 * @return a TreeMap sorted with symptoms and their occurrences
	 */

	public Map<String, Integer> getSymptomsSortedAlphabetically() {

		return new TreeMap<>(symptoms);
	}

}
