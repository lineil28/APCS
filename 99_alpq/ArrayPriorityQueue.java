/*
 * Team Green Smurfs: Neil Lin, Jomin Zhang, Eric
 * APCS pd7
 * HW95 -- Algorithm as Data Structure
 * 2022-05-10
 * time elapsed: 0.8 hrs
 *
 */
import java.util.ArrayList;
import javax.management.RuntimeErrorException;

public class ArrayPriorityQueue implements PriorityQueue {

    private ArrayList<Integer> priorityQueue;

    public ArrayPriorityQueue() {
        priorityQueue = new ArrayList<Integer>();
    }

    public void add(int x) {
        if (isEmpty()) {
            priorityQueue.add(x);
            return;
        }
        for (int i = 0; i < priorityQueue.size(); i++) {
            if (x <= priorityQueue.get(i)) {
                priorityQueue.add(i, x);
                return;
            }
        }
        priorityQueue.add(x);
    }

    public boolean isEmpty() {
        return priorityQueue.size() == 0;
    }

    public int peekMin() {
        if (isEmpty()) throw new RuntimeException("No elements");
        return priorityQueue.get(0);
    }

    public int removeMin() {
        if (isEmpty()) throw new RuntimeException("No elements");
        return priorityQueue.remove(0);
    }

    public String toString() {
        return priorityQueue.toString();
    }

    public static void main(String[] args) {
        ArrayPriorityQueue test = new ArrayPriorityQueue();
        omega.add(3);
        System.out.println(test);
        omega.add(2);
        omega.add(100);
        System.out.println(test);
    }
}
