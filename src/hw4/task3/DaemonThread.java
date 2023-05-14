package hw4.task3;

class DaemonThread extends Thread {
    public void run (){
       if (Thread.currentThread().isDaemon()){
           System.out.println("It`s daemon thread.");
       }else {
           System.out.println("It`s user thread.");
       }
    }
    static void daemonThreadInfo (Thread thread){
        System.out.println("---------------------------");
        System.out.println("Get Name: " + thread.getName());
        System.out.println("Is Daemon? " + thread.isDaemon());
        System.out.println("Get id: " + thread.getId());
        System.out.println("Get priority: " + thread.getPriority());
        System.out.println("Get thread group: " + thread.getThreadGroup());
        System.out.println("Is alive: " + thread.isAlive());
        System.out.println("Get class: " + thread.getClass());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Thread thread1 = new DaemonThread();
        Thread thread2 = new DaemonThread();
        thread1.setDaemon(true);
        thread2.setDaemon(false);
        System.out.println("---------------------------");
        System.out.println("The first thread: ");
        thread1.start();
        daemonThreadInfo(thread1);
        System.out.println("The second thread: ");
        thread2.start();
        daemonThreadInfo(thread2);

    }
}
