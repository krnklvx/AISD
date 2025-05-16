package BFOpt;

import java.util.*;

public class Graph {
    private int vertices;
    private ArrayList<Edge> edges;
    private long executionTime;
    private int iterations;
    private boolean hasNegativeCycle;

    public Graph(int vertices){
        this.vertices = vertices;
        this.edges = new ArrayList<>();
    }

    public void addEdge(int source, int destination, int weight){
        edges.add(new Edge(source, destination, weight));
    }

    public int getVertices() {
        return vertices;
    }

    public int getEdges() {
        return edges.size();
    }

    public long getExecutionTime() {
        return executionTime;
    }

    public int getIterations() {
        return iterations;
    }

    public boolean getHasNegativeCycle() {
        return hasNegativeCycle;
    }

    public void bellmanFord(int src){
        long startTime = System.nanoTime();

        double[] dist = new double[vertices];
        Arrays.fill(dist, Double.POSITIVE_INFINITY);
        dist[src] = 0;
        iterations = 0;
        boolean update;

        for (int i = 1; i < vertices; i++){
            update = false;
            iterations++;
            for (Edge edge: edges){
                if (dist[edge.source] != Double.POSITIVE_INFINITY &&
                    dist[edge.source] + edge.weight < dist[edge.destination]){
                    dist[edge.destination] = dist[edge.source] + edge.weight;
                    update = true;
                }
            }
            if (!update){
                break;
            }
            executionTime = System.nanoTime() - startTime;
        }

        boolean hasNegativeCycle = false;
        for (Edge edge : edges) {
            if (dist[edge.source] != Double.POSITIVE_INFINITY &&
                dist[edge.source] + edge.weight < dist[edge.destination]) {
                hasNegativeCycle = true;
                break;
            }
        }
        executionTime = System.nanoTime() - startTime;
    }
}
