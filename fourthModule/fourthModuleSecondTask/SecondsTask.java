package fourthModuleSecondTask;

public class SecondsTask {
    public static void main(String[] args) {
        SharedObject shared = new SharedObject();

        Thread thread1 = new Thread(() -> {
            try {
                while (true) {
                    shared.printOne();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread 1 interrupted: " + e.getMessage());
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                while (true) {
                    shared.printTwo();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread 2 interrupted: " + e.getMessage());
            }
        });

        thread1.start();
        thread2.start();
    }
}

class SharedObject {
    private boolean turn = true; // true - thread 2, false - thread 1

    public synchronized void printOne() throws InterruptedException {
        while (!turn) {
            wait();
        }
        System.out.print("1\n");
        turn = false;
        notify();
    }

    public synchronized void printTwo() throws InterruptedException {
        while (turn) {
            wait();
        }
        System.out.print("2\n");
        turn = true;
        notify();
    }
}
