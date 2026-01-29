import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Tokenizer {
    public static Set<String> tokenize(String text) {
        String cleaned = text.toLowerCase().replaceAll("[^a-z0-9 ]", " ");
        return new HashSet<>(Arrays.asList(cleaned.split("\\s+")));
    }
}
