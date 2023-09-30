
public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_GREEN + "START Main Thread");

        Thread firstThread = new FirstThread();
        firstThread.setName("== Another Thread ==");
        firstThread.start();
//        firstThread.run(); -- DO NOT CALL --

        new Thread(() -> System.out.println(ThreadColor.ANSI_RED + "Anonymous Thread")).start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
//                super.run();
                System.out.println(ThreadColor.ANSI_RED + "Anonymous Implementation of run()");

                try {
                    firstThread.join(5000);
                    System.out.println(ThreadColor.ANSI_RED + "Thread Terminated or timed out.");
                } catch (InterruptedException exception) {
                    System.out.println(ThreadColor.ANSI_RED + exception);
                }
            }
        });

        myRunnableThread.start();
        firstThread.interrupt();

        System.out.println(ThreadColor.ANSI_PURPLE + "END Main Thread");
    }
}