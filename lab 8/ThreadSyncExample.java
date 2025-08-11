class PrintWords {
    synchronized void print(String threadName) {
        String[] words = { "I", "Love", "Java", "Very", "Much" };
        for (String word : words) {
            System.out.println(threadName + ": " + word);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class WordThread extends Thread {
    PrintWords printer;
    String threadName;

    WordThread(PrintWords printer, String threadName) {
        this.printer = printer;
        this.threadName = threadName;
    }

    public void run() {
        printer.print(threadName);
    }
}

public class ThreadSyncExample {
    public static void main(String[] args) {
        PrintWords printer = new PrintWords();

        WordThread t1 = new WordThread(printer, "Thread 1");
        WordThread t2 = new WordThread(printer, "Thread 2");

        t1.start();
        t2.start();
    }
}
