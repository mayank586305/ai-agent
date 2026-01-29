import java.util.List;

public class AgentOrchestrator {

    private DocumentStore store;
    private QueryPlannerAgent planner;
    private RetrieverAgent retriever;
    private SummarizerAgent summarizer;
    private ResponseFormatterAgent formatter;

    public AgentOrchestrator() {
        this.store = new DocumentStore();
        this.planner = new QueryPlannerAgent();
        RankingAgent rankingAgent = new RankingAgent();
        this.retriever = new RetrieverAgent(rankingAgent);
        this.summarizer = new SummarizerAgent();
        this.formatter = new ResponseFormatterAgent();
    }

    public String handleQuery(String query) {
        int k = planner.decideTopK(query);
        List<String> docs = retriever.retrieve(query, store.getAll(), k);
        String summary = summarizer.summarize(docs);
        return formatter.format(query, summary, docs.size());
    }
}
