/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myapp1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class diagnosis_jav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Map that maps diseases to lists of drugs
        Map<String, String[]> drugMap = new HashMap<>();
        drugMap.put("cold", new String[]{"acetaminophen", "ibuprofen", "aspirin"});
        drugMap.put("flu", new String[]{"oseltamivir", "zanamivir", "rimantadine"});
        drugMap.put("allergy", new String[]{"loratadine", "cetirizine", "fexofenadine"});
        drugMap.put("malaria", new String[]{"artesunate–amodiaquine (AA)", "artemether–lumefantrine (AL)", "dihydroartemisinin-piperaquine (DHAP)"});
        drugMap.put("measles", new String[]{"Fever reducers such as acetaminophen (Tylenol, others), ibuprofen (Advil, Motrin IB, Children's Motrin, others) or naproxen sodium (Aleve)", "Antibiotics", "Vitamin A"});
       
        
        
        // Prompt the user to enter a disease
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a disease: ");
        String disease = scanner.nextLine().toLowerCase();
        
        // Check if the entered disease is in the drugMap
        if (drugMap.containsKey(disease)) {
            // Get the list of drugs for the entered disease and print them out
            String[] drugs = drugMap.get(disease);
            System.out.println("The drugs for " + disease + " are:");
            for (String drug : drugs) {
                System.out.println(drug);
            }
        } else {
            // If the entered disease is not in the drugMap, print an error message
            System.out.println("Sorry, we don't have information about drugs for " + disease);
        }
    }
}
