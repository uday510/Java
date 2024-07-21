package Threads;

//class A implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 5; ++i) {
//            System.out.println("hi");
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//
//class B extends Thread {
//    public void run() {
//        for (int i = 1; i <= 5; ++i) {
//            System.out.println("hello");
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

class Counter {
    int count; // make count volatile to avoid caching of the variable by the threads

    public synchronized void increment() {
        ++count;
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
//        A obj1 = new A();
//        B obj2 = new B();
//
//        obj2.setPriority(Thread.MAX_PRIORITY);

//        System.out.println(obj1.getPriority());
//        System.out.println(obj2.getPriority());

//        System.exit(0);


//        Runnable obj1 = new A();
//        Thread obj2 = new B();
//
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
//
//        t1.start();
//        t2.start();

        Counter counter = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; ++i) {
                counter.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; ++i) {
               counter.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}

