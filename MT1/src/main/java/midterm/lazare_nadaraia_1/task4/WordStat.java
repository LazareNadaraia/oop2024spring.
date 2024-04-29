package midterm.lazare_nadaraia_1.task4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);

        System.out.println("Set of unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        Map<Integer, Integer> wordLengthMap = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthMap.put(length, wordLengthMap.getOrDefault(length, 0) + 1);
        }

        System.out.println("\nMap of word lengths and occurrences:");
        for (Map.Entry<Integer, Integer> entry : wordLengthMap.entrySet()) {
            System.out.println("Length " + entry.getKey() + ": " + entry.getValue() + " words");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("task4.txt", true))) {
            writer.newLine();
            writer.newLine();
            writer.write("Set of unique words:\n");
            for (String word : uniqueWords) {
                writer.write(word + "\n");
            }
            writer.newLine();
            writer.write("Map of word lengths and occurrences:\n");
            for (Map.Entry<Integer, Integer> entry : wordLengthMap.entrySet()) {
                writer.write("Length " + entry.getKey() + ": " + entry.getValue() + " words\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
