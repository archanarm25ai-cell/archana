import java.util.HashMap;
import java.util.Map;

public class Entryset {
    public static void main(String[] args){
        Map<String,Object> person = new HashMap<>();
        person.put("Ram",89);
        person.put("john",78);
        person.put("Aravindh",69);
        person.put("Ramesh",90);
        System.out.println(person.get("percent"));
        person.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }

}

