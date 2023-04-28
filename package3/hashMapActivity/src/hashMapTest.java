import java.util.HashMap;
import java.util.Map;

public class hashMapTest {
    HashMap<Integer, Integer> HashMap = new HashMap<Integer, Integer>();

    public void addKV(int key, int value){
        HashMap.put(key, value);
    }

    public void removeKV(int key){
        HashMap.remove(key);
    }

    public void getKV(int key){
        System.out.println(key + " = " + HashMap.get(key));
    }

    public void getALL(){
        System.out.println("All:");
        for (Map.Entry<Integer, Integer> set : HashMap.entrySet()) {
            System.out.println(set.getKey() + " = " + set.getValue());
        }
    }
}
