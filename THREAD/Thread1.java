class EvenThread extends Thread {
    public void run() {
        try {
            for (int i = 2; i <= 200; i += 2) {
                System.out.println("Even Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class OddThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 199; i += 2) {
                System.out.println("Odd Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        try {
            EvenThread evenThread = new EvenThread();
            OddThread oddThread = new OddThread();

            evenThread.start();
            oddThread.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}