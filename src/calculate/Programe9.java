package calculate;

import java.util.HashMap;
import java.util.Map;

//Create a HashMap object called people that will store String keys and Integer
//        values: And use for each loop to iterate the value from Map
public class Programe9 {
    public static void main(String[] args) {

        Map<String, Integer> peopleName = new HashMap();
        peopleName.put("Shruti ", 1);
        peopleName.put("Surbhi ", 2);
        peopleName.put("Vrunda ", 3);
        peopleName.put("KalpeshBhai ", 4);
        peopleName.put("Harsh ", 5);
        peopleName.put("Saurabhbhai ", 6);
        peopleName.put("Purviben ", 7);

        for (Map.Entry<String, Integer> peopleName1 : peopleName.entrySet()) {
            System.out.println(peopleName1.getKey()+peopleName1.getValue());//

        }


    }

}
