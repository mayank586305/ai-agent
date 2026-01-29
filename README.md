# Java Multi-Agent Research Assistant

This project demonstrates a simple multi-agent system in Java:

- RetrieverAgent: selects relevant documents from a small knowledge base
- SummarizerAgent: combines the retrieved documents into a concise answer

Use case:
Automates basic research and question answering over a local document set instead of manually searching documents.

Extent of help:
The agent separation (retrieval + summarization) makes the workflow modular and easy to extend with embeddings, vector search, or LLMs. Queries return instant answers rather than requiring manual lookup.

Run:
javac MultiAgentApp.java
java MultiAgentApp
