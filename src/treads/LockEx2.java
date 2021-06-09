package treads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx2 {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Dima",lock);
        new Employee("Katya",lock);
        new Employee("Seva",lock);
        Thread.sleep(5000);
        new Employee("Luda",lock);
        new Employee("Vova",lock);
        new Employee("Nata",lock);
    }
}

class Employee extends Thread{
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
                //System.out.println(name + " waiting");
               // lock.lock();
                System.out.println(name + " using");
                Thread.sleep(2000);
                System.out.println(name + " done!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else{
            System.out.println(name+" not waiting");
        }
    }
}
