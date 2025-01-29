package collectionFrameworks.queueInterface;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args){
        Queue<Integer> pq = new java.util.PriorityQueue<>();
        pq.offer(40);
        pq.offer(30);
        pq.offer(20);
        pq.offer(10);
        System.out.println(pq.peek());
    }
}
