package basics.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class AddingQueueElements {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");

        System.out.println(queue);

    }
}