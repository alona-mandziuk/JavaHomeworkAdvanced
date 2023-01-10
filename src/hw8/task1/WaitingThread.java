package hw8.task1;

class WaitingThread {
    public static void main(String[] args) {
        Thread first = new Thread(new FirstThread());
        Thread second = new Thread(new SecondThread());
        Thread third = new Thread(new ThirdThread());
        first.start();
        second.start();
        third.start();
    }

    static class FirstThread extends Thread {
        @Override
        public void run() {
            setPriority(10);
            try {
                join();
                System.out.println("1st Thread is finished.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class SecondThread extends Thread {
        @Override
        public void run() {
            setPriority(5);
            try {
                join();
                System.out.println("2nd Thread is finished.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ThirdThread extends Thread {
        @Override
        public void run() {
            setPriority(1);
            try {
                join();
                System.out.println("3d Thread is finished.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
