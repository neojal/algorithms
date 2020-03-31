package search;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {

    static final String input = "unordered-integers.txt";
    static List<String> lines;

    @BeforeAll
    static void initialize() throws IOException {

        File inputFile = new File(input);
        ClassLoader classLoader = BubbleSortTest.class.getClassLoader();
        lines = Files.readAllLines(Paths.get(classLoader.getResource(input).getFile()));

    }

    @Test
    @DisplayName("Bubble sort!")
    void bubbleSort() {

        for(String line: lines) {
            int arr[] = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(Arrays.toString(arr));
        }

    }
}
