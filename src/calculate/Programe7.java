package calculate;

import java.util.ArrayList;

//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names
public class Programe7 {

    public static void main(String[] args) {
        ArrayList<String> tubename = new ArrayList();
        tubename.add("Piccadelly line ");
        tubename.add("Circle line");
        tubename.add("District  line");
        tubename.add("Metropolitan  line ");
        tubename.add("Jubli line");
        System.out.println(tubename);
        if (tubename.isEmpty()) {
            System.out.println("Given Array list is empty");
        } else {
            System.out.println("Given Array list is not empty");
        }


    }


}
