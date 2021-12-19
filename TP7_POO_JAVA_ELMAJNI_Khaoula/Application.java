package TP7;

public class Application {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Talkative(0));
        Thread thread2 = new Thread(new Talkative(1));
        Thread thread3 = new Thread(new Talkative(2));
        Thread thread4 = new Thread(new Talkative(3));
        Thread thread5 = new Thread(new Talkative(4));
        Thread thread6 = new Thread(new Talkative(5));
        Thread thread7 = new Thread(new Talkative(6));
        Thread thread8 = new Thread(new Talkative(7));
        Thread thread9 = new Thread(new Talkative(8));
        Thread thread10 = new Thread(new Talkative(9));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();

    }
}
