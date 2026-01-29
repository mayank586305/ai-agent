public class ResponseFormatterAgent {

    public String format(String query, String summary, int usedDocs) {
        return "Query: " + query + "\n"
             + "Documents used: " + usedDocs + "\n"
             + "Answer: " + summary;
    }
}
