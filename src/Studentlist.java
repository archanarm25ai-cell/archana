import java.util.LinkedList;
public class Studentlist {

        static void process(LinkedList<String> list) {
            System.out.println("Removed : " + list.removeFirst());
        }
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("\n101 - Archana - 85");
            list.add("\n102 - Surya- 92");
            list.add("\n103 - Tharun - 90");
            list.add("\n104 - Sanjay - 88");
            list.add("\n105 - Sarvesh- 75");

            System.out.println("Student List:");
            System.out.println(list);
            list.add("106 - Chandru- 92");
            System.out.println("\nAfter Adding:");
            System.out.println(list);
            process(list);

            System.out.println("\nAfter Removing:");
            System.out.println(list);
            list.set(2, "104 - Suba- 95");

            System.out.println("\nAfter Updating:");
            System.out.println(list);
        }
    }


