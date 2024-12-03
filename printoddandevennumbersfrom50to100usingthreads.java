class OddThread extends Thread {
    public void run() {
        for (int i = 50; i <= 100; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 50; i <= 100; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

public class OddEvenThreads {
    public static void main(String[] args) {
        // Create and start threads
        new OddThread().start();
        new EvenThread().start();
    }
}
