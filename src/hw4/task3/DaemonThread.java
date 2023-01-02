package hw4.task3;

class DaemonThread extends Thread {
    public void run (){
       if (Thread.currentThread().isDaemon()){
           System.out.println("It`s daemon thread.");
       }else {
           System.out.println("It`s user thread.");
       }
    }

    public static void main(String[] args) {
        DaemonThread thread1 = new DaemonThread();
        DaemonThread thread2 = new DaemonThread();
        thread1.setDaemon(true);
        thread2.setDaemon(false);
        System.out.println("---------------------------");
        System.out.println("The first thread: ");
        thread1.start();
        System.out.println("Get Name: " + thread1.getName());
        System.out.println("Is Daemon? " + thread1.isDaemon());
        System.out.println("Get id: " + thread1.getId());
        System.out.println("Get priority: " + thread1.getPriority());
        System.out.println("Get thread group: " + thread1.getThreadGroup());
        System.out.println("Is alive: " + thread1.isAlive());
        System.out.println("Get class: " + thread1.getClass());
        System.out.println("---------------------------");
        System.out.println("The second thread: ");
        thread2.start();
        System.out.println("Get Name: " + thread2.getName());
        System.out.println("Is Daemon? " + thread2.isDaemon());
        System.out.println("Get id: " + thread2.getId());
        System.out.println("Get priority: " + thread2.getPriority());
        System.out.println("Get thread group: " + thread2.getThreadGroup());
        System.out.println("Is alive: " + thread2.isAlive());
        System.out.println("Get class: " + thread2.getClass());
        System.out.println("---------------------------");

    }
}
