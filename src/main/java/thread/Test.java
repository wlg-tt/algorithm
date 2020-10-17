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
        System.out.println(-20>>>2);
        Runnable thread = () -> System.out.println("333");
        thread.run();
        Thread thread1 = new Thread(() -> System.out.println("444"));
        thread1.start();
        System.out.println("222");
    }
}

