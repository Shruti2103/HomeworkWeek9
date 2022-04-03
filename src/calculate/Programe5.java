package calculate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

//Write a Java program to iterate through all elements in an array list using
//Iterator
public class Programe5 {
    public static void main(String[] args) {
        ArrayList<String> coloutList=new ArrayList<>();
        coloutList.add("Orange");
        coloutList.add("Black");
        coloutList.add("white ");
        coloutList.add("Red");
        coloutList.add("Blue");
        coloutList.add("Golden ");
        // iterate function
        Iterator itr= coloutList.iterator();
      while (itr.hasNext()){
          System.out.println(itr.next());
      }


    }




}











