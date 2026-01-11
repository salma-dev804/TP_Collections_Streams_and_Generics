package ma.enset.collections;

import java.util.*;

public class GradeManager {
    public static void main(String[] args) {
        Map<String, Double> studentGrades = new HashMap<>();

        // 1
        studentGrades.put("Amine", 15.5);
        studentGrades.put("Yasmine", 18.0);
        studentGrades.put("Omar", 12.0);

        // 2
        studentGrades.replace("Omar", studentGrades.get("Omar") + 2.0);

        // 4
        studentGrades.remove("Amine");

        // 6
        double average = studentGrades.values().stream().mapToDouble(d -> d).average().orElse(0);
        double maxGrade = studentGrades.values().stream().mapToDouble(d -> d).max().orElse(0);
        
        System.out.println("Moyenne de la classe: " + average);
        System.out.println("Note Max: " + maxGrade);

        System.out.println("Liste des étudiants et leurs notes :");
        studentGrades.forEach((name, grade) -> System.out.println("- " + name + " : " + grade));
    }
}