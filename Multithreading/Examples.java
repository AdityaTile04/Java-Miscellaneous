package Multithreading;

public class Examples {
    public static void main(String[] args) {
        Thread sender = new Thread(new SendMessage());
        Thread receiver = new Thread(new ReceivedMessage());

        sender.start();
        receiver.start();
    }
}

class SendMessage implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Sending Message " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class ReceivedMessage implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Received Message " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}