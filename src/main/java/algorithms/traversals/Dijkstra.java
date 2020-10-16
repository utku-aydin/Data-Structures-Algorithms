package algorithms.traversals;

import data_structures.Graph;
import data_structures.Tuple;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;

public class Dijkstra {

    public void dijkstraSolution(Graph<String> subject, String current, String end) {
        PriorityQueue<Tuple<Integer, String>> store = new PriorityQueue<>((n1, n2) -> n1.getVal1() - n2.getVal1());
        List<Tuple<Integer, String>> destinations;
        Tuple<Integer, String> currentTuple;
        int currentWeight = 0;
        while (!current.equals(end)) {
            System.out.println("Current: " + current);
            destinations = subject.getDestinationsWithWeights(current);
            for (Tuple<Integer, String> d :
                 destinations) {
                d.setVal1(d.getVal1() + currentWeight);
                store.add(d);
            }

            currentTuple = store.poll();
            assert currentTuple != null;
            current = currentTuple.getVal2();
            currentWeight = currentTuple.getVal1();
        }

        System.out.printf("Reached end: %s", end);
    }

}
