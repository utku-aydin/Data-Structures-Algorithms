package algorithms.backtobackswe.dynamicprogramming;

/* Find the least amount of eggs (worst case) you'd need to
 * drop to undoubtedly ascertain the pivotal (egg cracking) floor.*/
public class EggDropper {

    public void SolveEggDrop(int eggCount, int floorCount, int pivotalFloor) {
        System.out.printf("Result: %d", dynamicSolve(eggCount, 0, floorCount, pivotalFloor));
    }

    private int dynamicSolve(int eggCount, int currentFloor, int floorCount, int pivotalFloor) {
        System.out.printf("Values, egg count: %d, current floor: %d\n", eggCount, currentFloor);
        if (eggCount == 1)
            return floorCount - currentFloor;
        if (currentFloor == floorCount)
            return 0;
        if (currentFloor == pivotalFloor) {
            return 0;
        }
        if (currentFloor > pivotalFloor) {
            if (eggCount > 2)
                return 1 + dynamicSolve(eggCount - 1, currentFloor - currentFloor / 2, floorCount, pivotalFloor);
            return 1 + dynamicSolve(eggCount - 1, currentFloor - (floorCount - currentFloor), floorCount, pivotalFloor);
        } else {
            return 1 + dynamicSolve(eggCount, floorCount - (floorCount - currentFloor) / 2, floorCount, pivotalFloor);
        }
    }

}
