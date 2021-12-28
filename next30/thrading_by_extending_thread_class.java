import java.lang.Thread;

class thrading_by_extending_thread_class extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        thrading_by_extending_thread_class t1 = new thrading_by_extending_thread_class();
        t1.start();
    }
}
