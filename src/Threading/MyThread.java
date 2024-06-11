package Threading;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread{
    private String parameter;
    public MyThread(String parameter) {
        this.parameter = parameter;
    }
    public void run() {
        while(!"exit".equals(parameter)){
            System.out.println((isDaemon() ?
                    "daemon" : " user") + " thread " + this.getName() + "(id=" + this.getId() + ") parameter: " + parameter);
            pauseOneSecond();
        }
        System.out.println((isDaemon() ? "daemon" : "user") + " thread " + this.getName() + "(id=" + this.getId() + ") parameter: " +
        parameter);
    }
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }
    private static void pauseOneSecond(){
        try {
            TimeUnit.SECONDS.sleep(1);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread thr1 = new MyThread("One");
        thr1.start();
        MyThread thr2 = new MyThread("Two");
        thr2.setDaemon(true);
        thr2.start();
        pauseOneSecond();
        thr1.setParameter("exit");
        pauseOneSecond();
        System.out.println("Main thread exists");
    }
}

