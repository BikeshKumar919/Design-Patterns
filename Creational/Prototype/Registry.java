import java.util.HashMap;

public class Registry {
    HashMap <String,Student> map = new HashMap<String,Student>(); 
    void create(String key ,Student s){
        map.put(key,s);
    }
    Student get(String key){
        return map.get(key);
    }
}
