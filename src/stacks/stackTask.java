package stacks;

import java.util.Stack;

public class stackTask {
    public static void main(String[] args) {
        Stack<String> stakSys = new Stack<>();

        stakSys.push("nimal");
        stakSys.push("kmal");
        stakSys.push("roshan");
        stakSys.pop();


        System.out.println(stakSys.empty());
        System.out.println(stakSys);



    }

}
