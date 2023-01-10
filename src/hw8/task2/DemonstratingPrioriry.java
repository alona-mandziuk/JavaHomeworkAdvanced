package hw8.task2;

class DemonstratingPrioriry extends Thread {
    @Override
    public void run() {
        setPriority(MIN_PRIORITY);
        System.out.println("MIN priority Thread is running");
    }

    static class PriorityRunner extends Thread {
        @Override
        public void run() {
            setPriority(NORM_PRIORITY);
            System.out.println("NORM priority Thread is running");
            for (int i = 1; i <= 50; i++) {
                System.out.println(i + " | NORM priority Thread ");
            }
        }
    }

    static class PrirityThread extends Thread {
        @Override
        public void run() {
            setPriority(MAX_PRIORITY);
            System.out.println("MAX priority Thread is running");
            for (int i = 1; i <= 50; i++) {
                System.out.println(i + " | MAX priority Thread ");
            }
        }
    }

    public static void main(String[] args) {
        Thread min = new Thread(new DemonstratingPrioriry());
        Thread norm = new Thread(new PriorityRunner());
        Thread max = new Thread(new PrirityThread());
        min.start();
        norm.start();
        max.start();

    }
}
