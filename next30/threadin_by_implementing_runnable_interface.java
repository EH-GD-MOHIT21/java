import java.lang.Thread;

class MyThread implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }
}

public class threadin_by_implementing_runnable_interface {
    public static void main(String args[]) {
        MyThread m1 = new MyThread();
        Thread t1 = new Thread(m1); // Using the constructor Thread(Runnable r)
        t1.start();
    }
}
