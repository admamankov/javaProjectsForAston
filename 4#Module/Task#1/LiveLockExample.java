package fourthModuleFirstTask;

public class LiveLockExample {
    private static volatile boolean wantsToWork1 = false;
    private static volatile boolean wantsToWork2 = false;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                wantsToWork1 = true;

                while (wantsToWork2) {
                    System.out.println("Thread 1: Thread 2 wants to work. I'm stepping back.");
                    wantsToWork1 = false;

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }

                    wantsToWork1 = true;
                }

                System.out.println("Thread 1: Working");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                wantsToWork1 = false;
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                wantsToWork2 = true;

                while (wantsToWork1) {
                    System.out.println("Thread 2: Thread 1 wants to work. I'm stepping back.");
                    wantsToWork2 = false;

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }

                    wantsToWork2 = true;
                }

                System.out.println("Thread 2: Working");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                wantsToWork2 = false;
            }
        });

        thread1.start();
        thread2.start();
    }
}