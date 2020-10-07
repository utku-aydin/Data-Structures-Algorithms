package algorithms;

import data_structures.Graph;

import java.util.*;

public class BFS {

    private PriorityQueue<String> searchQueue = new PriorityQueue<>();
    HashSet<String> seenSet = new HashSet<>();
    private Graph<String> subject;

    public BFS(Graph<String> subject) {
        this.subject = subject;
    }

    public void breadthFirstSearch(String start) {
        iterativeSolution(start);
    }

    private void recursiveSolution(String current) {
        seenSet.add(current);
        System.out.println("Current vertex: " + current);
        List<String> destinations = subject.getDestinations(current);

        for (String destination: destinations) {
            if (!seenSet.contains(destination)) {
                searchQueue.add(destination);
            }
        }

        if (!searchQueue.isEmpty()) {
            recursiveSolution(searchQueue.poll());
        }
    }

    private void iterativeSolution(String current) {
        PriorityQueue<String> searchQueue = new PriorityQueue<>();
        HashSet<String> seenSet = new HashSet<>();
        List<String> destinations;
        searchQueue.add(current);

        do {
            current = searchQueue.poll();
            System.out.println("Current vertex: " + current);

            destinations = subject.getDestinations(current);

            for (String destination: destinations) {
                if (!seenSet.contains(destination)) {
                    searchQueue.add(destination);
                    seenSet.add(destination);
                }
            }

        } while (!searchQueue.isEmpty());
    }
}
