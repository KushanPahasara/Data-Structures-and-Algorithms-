package linkedList;

import java.util.LinkedList;

public class linkedList2 {

    public static void main(String[] args){

        LinkedList<String> linkedList = new LinkedList<>();

        //LinkedList As a Queue
        
        linkedList.offer("rajitha");
        linkedList.offer("maheesh");
        linkedList.offer("wanidu");
        linkedList.offer("dimuth");

        System.out.println(linkedList);


       linkedList.add(4,"roy");
       linkedList.add(2,"roy2");
       linkedList.remove("roy2");
       linkedList.addFirst("welcome");
       linkedList.addLast("finish");
       linkedList.removeFirst();
       linkedList.removeLast();
        System.out.println(linkedList);

    }
}
