/*
 * synchronized keyword
 * one resouce used by multiple threads
 * it solves race condition problem ( only priorty to utilize the cpu time and execute task )
 * 1. blocked
 * 2. method
 */

class Car implements Runnable {

    synchronized public void run() {
        try {
            String currentThreadName = Thread.currentThread().getName();
            System.out.println(currentThreadName+" has entered in a parking lot");
            Thread.sleep(2000);
            System.out.println(currentThreadName+" got into a car to drive");
            Thread.sleep(2000);
            System.out.println(currentThreadName+" started to drive the car");
            Thread.sleep(2000);
            System.out.println(currentThreadName+" came back and parked the car");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("something went wrong "+e);
        }
    }
}

class ThreadDemo10 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
