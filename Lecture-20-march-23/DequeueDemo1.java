import java.util.ArrayDeque;

/*
 * It internally implements double ended queue
 * insertion and deletion only at rear and front end
 * can store heterogenous data
 * light weighted
 * no index based insertion
 */

public class DequeueDemo1 {
    public static void main(String[] args) {
        ArrayDeque adq = new ArrayDeque();
        adq.add(10);
        adq.add(true);
        adq.add("PW");

        System.out.println(adq);

        // offer may be reject ie. it might be possible that data cannot be added in dequeue
        adq.offer("offer");
        adq.offerFirst("offer first");
        adq.offerLast("offer last");

    }
}
