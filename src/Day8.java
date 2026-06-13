public class Day8 {
    record CourseRecord(String name,String department){

    }
    static void main() {
        CourseRecord courseRecord = new CourseRecord("programming","artificial intelligence");
        System.out.println(courseRecord.name());
        System.out.println(courseRecord.department());
    }

}
