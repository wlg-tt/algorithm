package thread;

/**
 * description: xxx
 * date: 2020/10/12 23:52
 * auditor: wangliugang
 */
public class Test {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        Runnable thread = new Runnable() {
            public void run() {
                System.out.println("333");
            }
        };
        thread.run();
        Thread thread1 = new Thread(){
            public void run(){
                System.out.println("444");
            }
        };
        thread1.start();
        System.out.println("222");
    }
}

