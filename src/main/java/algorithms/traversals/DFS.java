package algorithms.traversals;

import data_structures.Graph;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class DFS {

    Graph<String> subject;

    public DFS(Graph<String> subject) {
        this.subject = subject;
    }

    public void searchDF(String start) {
        iterativeSolution(start);
    }

    private void iterativeSolution(String current) {
        Stack<String> searchStack = new Stack<>();
        HashSet<String> seenSet = new HashSet<>();
        List<String> destinations;

        seenSet.add(current);
        searchStack.add(current);
        while (!searchStack.empty()) {
            System.out.println("Current vertex: " + current);
            destinations = subject.getDestinations(current);
            for (String destination: destinations) {
                if (!seenSet.contains(destination))
                    searchStack.add(destination);
                seenSet.add(destination);
            }

            current = searchStack.pop();
        }
    }

}
