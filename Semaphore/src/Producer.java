import java.util.concurrent.Semaphore;
public class Producer implements Runnable {
    private final Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Producer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {

        for (;;) {

            try {
                producerSemaphore.acquire();
                this.store.addItem();
                consumerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}






