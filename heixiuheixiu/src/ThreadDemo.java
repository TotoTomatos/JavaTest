public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }
}

class MyThread implements Runnable {
    private int x = 0;                            // 对象中的数据由线程共享
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            x++;
        }
        System.out.println("final x: " + x);     // 最后输出的数据不一定为 20000

    }
}
