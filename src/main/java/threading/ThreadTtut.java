package threading;

public class ThreadTtut extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread at: " + i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
