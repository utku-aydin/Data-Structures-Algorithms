package utilities;
import algorithms.interfaces.GeneralAlgorithm;

public class TimeUtil {

    public void runWithTimer(GeneralAlgorithm algorithm) {
        algorithm.handleInputs();
        long startTime = System.nanoTime();
        algorithm.executeAlgorithm();
        long totalTime = System.nanoTime() - startTime;

        System.out.printf("Total execution time (milliseconds): %d", totalTime);
    }

}
