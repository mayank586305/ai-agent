import java.util.List;

public class SummarizerAgent {

    public String summarize(List<String> chunks) {
        if (chunks.isEmpty()) {
            return "No relevant information found.";
        }

        StringBuilder sb = new StringBuilder();
        for (String c : chunks) {
            sb.append(c).append(" ");
        }
        return sb.toString().trim();
    }
}
