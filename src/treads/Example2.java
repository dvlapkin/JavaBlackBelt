package treads;

public class Example2 extends Thread{
    public void run() {
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        Example2 thread2 = new Example2();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("END");
    }
}

class MyRunnable implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
