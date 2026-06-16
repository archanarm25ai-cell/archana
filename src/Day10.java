import java.util.ArrayList;
public class Day10 {
    public static void main(){
        ArrayList<String> students = new ArrayList<>();
        students.add("Archana");
        students.add("Surya");
        students.add("Suba");
        students.add("Ram");
        students.add("Mugundhan");
        System.out.println("Student List:");
        for (String s : students) {
            System.out.println(s);
        }
        students.remove("Ram");
        System.out.println("\nAfter Removing Ram:");
        for (String s : students) {
            System.out.println(s);
        }
    }
}
