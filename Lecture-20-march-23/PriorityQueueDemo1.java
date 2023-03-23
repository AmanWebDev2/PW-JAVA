import java.util.PriorityQueue;
/*
 * index based operations are not allowed
 * order of data are not retained
 * it follows min heap data structure
 * homogenous
 */
public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        System.out.println(pq);
    }
}
