import java.util.*;
import java.util.stream.Collectors;

class RetrieverAgent {
    private List<String> documents;

    public RetrieverAgent(List<String> documents) {
        this.documents = documents;
    }

    public List<String> retrieve(String query, int k) {
        String[] words = query.toLowerCase().split("\\s+");

        List<Map.Entry<Integer, String>> scored = new ArrayList<>();

        for (String doc : documents) {
            int score = 0;
            String lowerDoc = doc.toLowerCase();
            for (String w : words) {
                if (lowerDoc.contains(w)) {
                    score++;
                }
            }
            if (score > 0) {
                scored.add(new AbstractMap.SimpleEntry<>(score, doc));
            }
        }

        scored.sort((a, b) -> Integer.compare(b.getKey(), a.getKey()));

        return scored.stream()
                .limit(k)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }
}

class SummarizerAgent {
    public String summarize(List<String> chunks) {
        if (chunks.isEmpty()) {
            return "No relevant information found.";
        }
        return String.join(" ", chunks);
    }
}

public class MultiAgentApp {

    public static void main(String[] args) {
        List<String> documents = Arrays.asList(
            "Spring Boot is a Java framework for building production-ready applications.",
            "Agents can collaborate by dividing tasks such as retrieval and summarization.",
            "Multi-agent systems can improve modularity and reasoning in complex workflows.",
            "Retrieval augmented generation combines search with text generation."
        );

        RetrieverAgent retriever = new RetrieverAgent(documents);
        SummarizerAgent summarizer = new SummarizerAgent();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ask something (or 'exit'): ");
            String query = scanner.nextLine();
            if ("exit".equalsIgnoreCase(query)) {
                break;
            }

            List<String> retrieved = retriever.retrieve(query, 2);
            String answer = summarizer.summarize(retrieved);

            System.out.println("Answer: " + answer);
            System.out.println();
        }

        scanner.close();
    }
}
