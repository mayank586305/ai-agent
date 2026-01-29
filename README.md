# Java Multi-Agent Assistant

A simple multi-agent research assistant written in Java.

Agents:
- QueryPlannerAgent: decides how many documents to fetch
- RankingAgent: scores documents against the query
- RetrieverAgent: selects the most relevant documents
- SummarizerAgent: combines retrieved documents into a concise answer
- ResponseFormatterAgent: formats the final output
- AgentOrchestrator: coordinates the full pipeline

Use case

Automates question answering over a local document store. Instead of manually searching documents, the system retrieves and summarizes relevant information in real time.

Extent of help

The agent pipeline splits the task into planning, retrieval, ranking, and summarization steps. This modular design makes it easy to extend with embeddings, vector search, or LLM-based summarization, and reduces manual lookup time to instant responses.

## Build and run locally

Requirements:
- Java 11+
- Maven 3.8+

Build the runnable JAR:

```bash
mvn clean package
