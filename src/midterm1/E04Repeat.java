package midterm1;

import java.util.LinkedList;
import java.util.Queue;

public class E04Repeat {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        repeat(q);
        System.out.println(q);
    }

    /*
     * Write a function that accepts a queue of integers and replaces
     * every element with two copies of itself. For example {1, 2, 3}
     * becomes {1, 1, 2, 2, 3, 3}
     * 
     * If you iterate over an object while changing it, consider saving
     * the size before the loop!
     */
    public static void repeat(Queue<Integer> q) {
        int queueSize = q.size();
        for (int i = 0; i < queueSize; i++) {
            q.add(q.peek());
            q.add(q.remove());
        }
    }

}
