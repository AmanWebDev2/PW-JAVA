
public class ThreadDemo1 {
    public static void main(String[] args) {
        
        System.out.println("name: "+Thread.currentThread().getName());
        System.out.println("priority "+ Thread.currentThread().getPriority());

        // creating custom thread

        Thread customThread = new Thread();
        customThread.setName("myThread");
        customThread.setPriority(1);
        System.out.println(customThread.getName());
        System.out.println(customThread.getPriority());
    }
}
