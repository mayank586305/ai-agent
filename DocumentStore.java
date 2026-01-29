import java.util.ArrayList;
import java.util.List;

public class DocumentStore {
    private List<String> documents = new ArrayList<>();

    public DocumentStore() {
        documents.add("Spring Boot is a Java framework for building production-ready applications.");
        documents.add("Agents can collaborate by dividing tasks such as retrieval and summarization.");
        documents.add("Multi-agent systems can improve modularity and reasoning in complex workflows.");
        documents.add("Retrieval augmented generation combines search with text generation.");
        documents.add("Java streams and collections help build expressive data pipelines.");
    }

    public List<String> getAll() {
        return documents;
    }

    public void addDocument(String doc) {
        documents.add(doc);
    }
}
