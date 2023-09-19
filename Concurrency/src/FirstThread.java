public class FirstThread extends Thread {
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + "First Thread " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException interruptedException) {
            System.out.println(ThreadColor.ANSI_BLUE + interruptedException);
            return;
        }

        System.out.println(ThreadColor.ANSI_BLUE + "Thread awake");
    }
}
