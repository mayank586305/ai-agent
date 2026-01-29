public class QueryPlannerAgent {

    public int decideTopK(String query) {
        int length = query.split("\\s+").length;
        if (length <= 2) return 1;
        if (length <= 5) return 2;
        return 3;
    }
}
