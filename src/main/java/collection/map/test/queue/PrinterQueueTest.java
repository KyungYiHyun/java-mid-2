package collection.map.test.queue;


import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {
    public static void main(String[] args) {
        Queue<String> printQueue = new ArrayDeque<>();
        // 코드 작성
        printQueue.offer("doc1");
        printQueue.offer("doc2");
        printQueue.offer("doc3");

        System.out.println("printQueue.poll() = " + printQueue.poll());
        System.out.println("printQueue.poll() = " + printQueue.poll());
        System.out.println("printQueue.poll() = " + printQueue.poll());
    }
}