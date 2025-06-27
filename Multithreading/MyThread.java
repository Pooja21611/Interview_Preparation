class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException interruptedException) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
