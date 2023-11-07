package queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args){

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(20.6);
        queue.offer(40.0);
        queue.offer(30.6);
        queue.offer(60.0);
        queue.offer(30.5);

        System.out.println(queue);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }


    }
}
