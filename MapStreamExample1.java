import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamExample1{
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 80);
        studentScores.put("Bob", 65);
        studentScores.put("Charlie", 90);
        studentScores.put("David", 75);

        int threshold = 70;

        // Using Stream API to filter entries based on score
        Map<String, Integer> highScorers = studentScores.entrySet().stream()
                .filter(entry -> entry.getValue() > threshold)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Students with scores above " + threshold + ": " + highScorers);
    }
}
