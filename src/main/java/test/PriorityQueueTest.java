package test;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(4);
        pq.offer(1);
        pq.offer(0);
        pq.offer(2);
        pq.offer(5);
        pq.offer(3);
        while(pq.size()!=0)
            System.out.println(pq.remove());
    }
}
