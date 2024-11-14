package com.hemebiotech.analytics;




import java.util.Map;



public class Main {

    public static void main(String[] args) {

        String fileOutput = "result.out";


        try {
            ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
            Map<String, Integer> symptoms = reader.readSymptoms();


            AnalyticsCounter analyticsCounter = new AnalyticsCounter(symptoms);
            Map<String, Integer> symptomsSort = analyticsCounter.getSymptomsSortedAlphabetically();

            ISymptomWriter writer = new WriterSymptomDataToFile();
            writer.writeSymptoms(fileOutput, symptomsSort);


        } catch (Exception e) {
            System.err.println("Error in the process : " + e.getMessage());
            System.exit(1);
        }

    }

}

