import java.util.LinkedList;
public class Day10 {
    static void process(LinkedList<String> queue) {
        System.out.println("Removed:" + queue.removeFirst());
    }

    static void main() {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");

        while (queue.size() > 1) {
            process(queue);
        }
    }
}
    static void process(LinkedList<String>List) {
        System.out.println("removed:" + List.removeFirst());
    }
    static void main() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        while (list.size() > 1) {
            process(list);
        }
    }



