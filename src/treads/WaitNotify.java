package treads;

public class WaitNotify {
    public static void main(String[] args) {
            Market market = new Market();
            Producer producer = new Producer(market);
            Consumer consumer = new Consumer(market);
            Thread thread1 = new Thread(producer);
            Thread thread2 = new Thread(consumer);
            thread1.start();
            thread2.start();
     }
}

class Market{
    private int breakCount=0;

    public synchronized void getBread(){
        while(breakCount<1){
            try {
                System.out.println("Ждём поставку");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breakCount--;
        System.out.println("потребитель купил 1 хлеб, осталось:"+breakCount);
        notify();
    }

    public synchronized void putBread(){
        while (breakCount>=5){
            try {
                System.out.println("Ждём покупателей");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breakCount++;
        System.out.println("производитель добавил 1 хлеб, стало:"+breakCount);
        notify();
    }
}

class Producer implements Runnable{
    Market market;
    Producer(Market market){
        this.market=market;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
        market.putBread();
        }
    }
}

class Consumer implements Runnable{
    Market market;
    Consumer(Market market){
        this.market=market;
    }
    @Override
    public void run() {

        for(int i=0;i<10;i++){
            market.getBread();
        }
    }
}
