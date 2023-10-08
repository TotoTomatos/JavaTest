import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class run {
    static ReentrantLock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();

    public static void main(String[] args) throws InterruptedException {
        lock.lock();
        new Thread(new MyThread()).start();
        System.out.println("主线程等待通知");
        try {
            condition.await();
        } finally {
            lock.unlock();
        }
        System.out.println("主线程恢复运行");
    }

    static class MyThread implements Runnable {
        @Override
        public void run() {
            lock.lock();
            try {
                condition.signal();
                System.out.println("子线程通知");
            } finally {
                lock.unlock();
            }
        }
    }

}
