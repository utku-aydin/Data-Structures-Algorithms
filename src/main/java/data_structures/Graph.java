package data_structures;

import java.util.*;
import java.util.stream.Collectors;

public class Graph<T> {

    private final HashMap<T, GraphNode<T>> vertexes = new HashMap<>();

    public boolean addVertex(T value) {
        GraphNode<T> added = new GraphNode<T>(value);
        if (vertexes.containsKey(value))
            return false;

        vertexes.put(value, added);
        return true;
    }

    public boolean addEdge(int weight, T source, T destination) {
        GraphEdge<T> sourceEdge = new GraphEdge<T>(weight, vertexes.get(destination));
        GraphEdge<T> destinationEdge = new GraphEdge<T>(weight, vertexes.get(source));

        return vertexes.get(destination).addEdge(destinationEdge) && vertexes.get(source).addEdge(sourceEdge);
    }

    public GraphNode<T> getVertex(T value) {
        return vertexes.get(value);
    }

    public Set<T> getVertexes() {
        return vertexes.keySet();
    }

    public List<T> getDestinations(T vertexValue) {
        List<T> destinations;
        HashSet<GraphEdge<T>> edges = vertexes.get(vertexValue).getEdges();
        destinations = edges.stream().map((e) -> e.getDestination().getValue()).collect(Collectors.toList());

        return destinations;
    }

    public List<Tuple<Integer, T>> getDestinationsWithWeights(T vertexValue) {
        List<Tuple<Integer, T>> destinationsWithWeights;
        HashSet<GraphEdge<T>> edges = vertexes.get(vertexValue).getEdges();
        destinationsWithWeights = edges.stream().map((e) -> new Tuple<>(e.weight, e.getDestination().getValue())).collect(Collectors.toList());

        return destinationsWithWeights;
    }

    private class GraphNode<t> {
        private t value;
        private HashSet<GraphEdge<t>> edges = new HashSet<>();

        private GraphNode(t value) {
            this.value = value;
        }

        public boolean addEdge(GraphEdge<t> edge) {
            return edges.add(edge);
        }

        public t getValue() {
            return value;
        }

        public HashSet<GraphEdge<t>> getEdges() {
            return edges;
        }
    }

    private class GraphEdge<t> {
        private int weight;
        private GraphNode<t> destination;

        public GraphEdge(int weight, GraphNode<t> destination) {
            this.weight = weight;
            this.destination = destination;
        }

        public int getWeight() {
            return weight;
        }

        public GraphNode<t> getDestination() {
            return destination;
        }
    }

}
