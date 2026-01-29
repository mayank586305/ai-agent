import java.util.*;

public class RankingAgent {

    public Map<String, Integer> scoreDocuments(String query, List<String> docs) {
        Set<String> queryTokens = Tokenizer.tokenize(query);
        Map<String, Integer> scores = new HashMap<>();

        for (String doc : docs) {
            Set<String> docTokens = Tokenizer.tokenize(doc);
            int score = 0;
            for (String token : queryTokens) {
                if (docTokens.contains(token)) {
                    score++;
                }
            }
            if (score > 0) {
                scores.put(doc, score);
            }
        }
        return scores;
    }
}
