public class Consumer implements Runnable {

    private final Store store;

    Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {

            for (;;) {
                synchronized (store) {
                    if (!store.getItems().isEmpty()) {
                        store.removeItem();;
                    }
                }
            }
    }
}
