import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgentOrchestrator orchestrator = new AgentOrchestrator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ask something (or 'exit'): ");
            String query = scanner.nextLine();
            if ("exit".equalsIgnoreCase(query)) {
                break;
            }

            String response = orchestrator.handleQuery(query);
            System.out.println(response);
            System.out.println();
        }

        scanner.close();
    }
}
