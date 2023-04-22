package lecture13;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.HashMap;
import java.util.HashSet;

public class TopicHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>Employee=new HashMap<>();
        Employee.put(23,"Sona");
        Employee.put(34,"Riva");
        Employee.put(22,"Kirti");
        Employee.put(23,"Mira");  // if there are same key then last one is valid
        Employee.put(20,"Jenny");
        Employee.put(25,"Riva");
        System.out.println(Employee);
        Employee.remove(25);
        System.out.println(Employee);
        System.out.println("lenght of Employee"+Employee.size());
        HashSet<Integer> Key=new HashSet<>();
        HashSet<String> value=new HashSet<>();
        for(int i:Employee.keySet()){
            Key.add(i);

        }
        for (String s:Employee.values()){
            value.add(s);


        }
        System.out.println(Key);
        System.out.println(value);

    }
}
