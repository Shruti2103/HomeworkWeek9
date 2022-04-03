package calculate;

import java.util.HashSet;
import java.util.Set;

//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
//and if else
public class Programe8 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(8);
        set.contains(4);
        for (int i = 0; i < 11; i++) {
            if (set.contains(i)) // set i to check value from 1 to 10
            {
                System.out.println(i + " The numbers are inside the set");
            }else{
                System.out.println(i + " The numbers are not  inside the set");


            }
        }


    }


}
