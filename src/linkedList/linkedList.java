package linkedList;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args){

        LinkedList<String> linkedList = new LinkedList<>();

        //LinkedList As a Stack
        linkedList.push("roshan");
        linkedList.push("namal");
        linkedList.push("thilak");
        linkedList.push("buddika");

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
