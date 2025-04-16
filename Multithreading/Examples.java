package Multithreading;

// Example 1 (Chat App Simulation)
public class Examples {
    public static void main(String[] args) {
        Thread sender = new Thread(new SendMessage());
        Thread receiver = new Thread(new ReceivedMessage());

        sender.start();
        receiver.start();

        Thread download = new Thread(new ProgessBar());
        Thread progress = new Thread(new FileDownLoad());

        download.start();
        progress.start();
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

// Example 2 (File Download Simulation + UI Progress Bar)

class FileDownLoad implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Downloading file part " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class ProgessBar implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Showing Progess : " + (i * 20) + "%");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
