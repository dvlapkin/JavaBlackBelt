package treads;

public class Examlpe3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main begins");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState().toString());
        thread.start();
        System.out.println(thread.getState().toString());
        thread.join();

        System.out.println(thread.getState().toString());
        System.out.println("Main end");
    }
}

class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}
