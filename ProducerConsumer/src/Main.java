import java.util.*;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();

    }
}
class Reader implements Runnable {
    private final Message message;
    public Reader(Message message) {
        this.message = message;
    }
    public void run() {
        Random random = new Random();
        for (String latestMessage = message.read(); !latestMessage.equals("Finished");
             latestMessage = message.read()) {
            System.out.println(latestMessage);
        }
        try {
            Thread.sleep(random.nextInt(2000));
        } catch (InterruptedException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

    }
}
class Message {
    private String message;
    private boolean empty = true;

    // producer
    public synchronized String read() {
        while (empty) {
            
        }
        empty = true;
        return message;
    }
    // consumer
    public synchronized void write(String message) {
        while (!empty) {
        }
        empty = false;
        this.message = message;
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String[] messages = {
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again"
        };
        Random random = new Random();

        for (String s : messages) {
            message.write(s);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (Exception e) {
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }
        message.write("Finished");
    }
}
