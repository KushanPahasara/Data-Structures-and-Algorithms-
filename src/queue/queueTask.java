package queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueTask {
    public static void main(String[] args){

        Queue<String> queue = new LinkedList<>();

        queue.offer("tarindu");
        queue.offer("thilina");
        queue.offer("imesh");
        queue.offer("dineth");

        queue.poll();
        

        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("kamal"));
        System.out.println(queue.contains("dineth"));
        System.out.println(queue.peek());
    }

}
