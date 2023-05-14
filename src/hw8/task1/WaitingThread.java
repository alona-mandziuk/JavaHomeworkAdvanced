package hw8.task1;

class WaitingThread {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(new FirstThread());
        Thread second = new Thread(new SecondThread());
        Thread third = new Thread(new ThirdThread());
        first.start();
        first.join(2000);
        second.start();
        second.join(30000);
        third.start();
        third.join(70000);
        System.out.println("-----------------------------");
        if (!first.isAlive()) {
            System.out.println("1 is out.");
        }
        if (!second.isAlive()) {
            System.out.println("2 is out..");
        }
        if (!third.isAlive()) {
            System.out.println("3 is out...");
        }
        System.out.println("---------FINISH--------------");
    }

    static class FirstThread extends Thread {
        @Override
        public void run() {
            System.out.println("1st thread is running.");
        }
    }

    static class SecondThread extends Thread {
        @Override
        public void run() {
            System.out.println("2nd thread is running..");
        }
    }

    static class ThirdThread extends Thread {
        @Override
        public void run() {
            System.out.println("3d thread is running...");
        }
    }
}
