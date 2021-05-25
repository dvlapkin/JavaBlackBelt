package treads;

public class TwoTreads {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("1");
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("2");
            }
        };

        t2.start();
        t1.start();
}}
