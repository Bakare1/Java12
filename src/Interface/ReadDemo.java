package Interface;

public class ReadDemo{

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        runnable.run();
    }
}
