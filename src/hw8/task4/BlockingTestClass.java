package hw8.task4;

class BlockingTestClassOne extends Thread {
    Thread t1;

    public BlockingTestClassOne() {
        System.out.println("First Thread is created.");
    }

    @Override
    public void run() {
        System.out.println("First thread starts...");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("First thread is finished.");
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("....1 is finished....");
    }

    public void setT1(Thread t) {
        this.t1 = t;
    }

}

class BlockingTestClassTwo extends Thread {
    Thread t2;

    public BlockingTestClassTwo() {
        System.out.println("Second thread is created....");
    }

    @Override
    public void run() {
        System.out.println("Second thread is start....");
        try {
            System.out.println("Second thread is stoped..");
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("....2 is finished....");
    }

    public void setT2(Thread t) {
        this.t2 = t;
    }
}

class MainBlocking {
    public static void main(String[] args) {
        BlockingTestClassOne t1 = new BlockingTestClassOne();
        BlockingTestClassTwo t2 = new BlockingTestClassTwo();

        t1.setT1(t2);
        t2.setT2(t1);
        t1.start();
        t2.start();
    }

}