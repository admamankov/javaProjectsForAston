package fourthModuleFirstTask;

public class DeadLockExample {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Acquired resource1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                synchronized (resource2) {
                    System.out.println("Thread 2: Acquired resource2");
                }
            }

        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Acquired resource2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                synchronized (resource1) {
                    System.out.println(("Thread 1: Acquired resource1"));
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
