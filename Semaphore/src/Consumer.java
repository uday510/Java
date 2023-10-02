import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private final Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {

        for (;;) {

            try {
                consumerSemaphore.acquire();
                this.store.removeItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            producerSemaphore.release();
        }
    }
}
