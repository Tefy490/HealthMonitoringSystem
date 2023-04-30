/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myapp1;

import java.util.*;
//import java.awt.List;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author macbookair
 */
public class Pressss {
    public static void main(String[] args) {
        // Create a list of 50 diseases along with their symptoms
        HashMap<String, List<String>> diseases = new HashMap<>();
        diseases.put("Stroke", Arrays.asList("Sudden numbness", "Weakness in the face", "Weakness in arm", "Weakness in leg", "Weakness on one side of the body", "CoughLoss of balance", "Sudden confusion", "Dizziness"));
        // Add remaining diseases and their symptoms to the map
        diseases.put("Malaria", Arrays.asList("Fever", "Flu", "Shaking chills", "Headache", "Muscle aches", "Tiredness", "Nausea", "Vomiting", "Diarrhea"));
        diseases.put("HIV/AIDS", Arrays.asList("Fever", "Chills", "Rash", "Night sweats", "Muscle aches", "Sore throat", "Fatigue", "Swollen lymph nodes"));
        diseases.put("Chronic-Disease", Arrays.asList("Depressed mood", "Loss of interest", "Loss of pleasure in daily activities", "Weight loss", "Weight gain", "Sleep disturbances", "Sleeping too much", "Problems with concentration", "Apathy", "Feelings of worthlessness or guilt", "Fatigue", "Thoughts of death or suicide"));
        diseases.put("Measles", Arrays.asList("High fever", "Cough", "Runny nose", "Watery eyes", "Rash"));
        diseases.put("Tuberculosis", Arrays.asList("Cough", "Coughing up blood or mucus", "Chest pain", "Pain with breathing or coughing", "Fever", "Chills", "Night sweats", "Weight loss"));
        diseases.put("Diarrheal diseases", Arrays.asList("Frequent loose", "Watery stools", "Abdominal cramps", "Abdominal pain", "Fever", "Bleeding", "Lightheadedness", "Dizziness"));
        diseases.put("Cholera", Arrays.asList("Watery diarrhea", "Vomiting", "Leg cramps", "Rapid loss of body fluids leads to dehydration", "Shock"));
        
        







        // Take input from the user regarding their symptoms
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your symptoms separated by commas: ");
        String input = scanner.nextLine();
        List<String> inputSymptoms = Arrays.asList(input.split(","));
        
        // Match the input symptoms with the symptoms of each disease in the list
        Map<String, Integer> scores = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : diseases.entrySet()) {
            int score = 0;
            for (String symptom : inputSymptoms) {
                if (entry.getValue().contains(symptom)) {
                    score++;
                }
            }
            scores.put(entry.getKey(), score);
        }
        
        // Rank the diseases in descending order based on their scores
        List<Map.Entry<String, Integer>> sortedScores = new ArrayList<>(scores.entrySet());
        Collections.sort(sortedScores, (a, b) -> b.getValue().compareTo(a.getValue()));
        
        // Display the top 3-5 diseases with their scores to the user
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedScores) {
            if (count >= 3) {
                break;
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
        }
    }
}
