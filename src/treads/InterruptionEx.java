package treads;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main start");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        Thread.sleep(1000);
        interruptedThread.interrupt();
        interruptedThread.join();

        System.out.println("Main end");
    }
}
class InterruptedThread extends Thread{
    double sqrtSum=0;
    @Override
    public void run() {
        for(int i=1;i<=1000000000;i++){
            if(isInterrupted()){
                System.out.println("Interrupt request");
                return;
            }
            sqrtSum+=Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}
