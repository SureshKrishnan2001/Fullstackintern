package synchronization;

public class JoinMethodCheck implements Runnable{
    public void task(){
        System.out.println("Thread 1");
        System.out.println("Thread 2");
        System.out.println("Thread 3");
    }

    @Override
    public void run() {
        task();
    }
}
class Checker{
    public static void main(String[] args) {
        JoinMethodCheck jm=new JoinMethodCheck();
        Thread t1=new Thread(jm);
        Thread t2=new Thread(jm);
        Thread t3=new Thread(jm);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
        } catch (InterruptedException e) {

        }
        try {
            t2.join();
        } catch (InterruptedException e) {

        }
    }
}
