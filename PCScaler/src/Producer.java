public class Producer implements Runnable {
    private final Store store;

    Producer(Store store) {
        this.store = store;
    }
    @Override
    public void run() {

       for (;;) {
            synchronized (store) {
                if (store.getItems().size() < store.getMaxSize()) {
                    store.addItem();
                }
            }
        }
    }
}






