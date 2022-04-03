package calculate;

import java.util.ArrayList;

//Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.
public class Programme4 {
    int a[] =new int [5];

    public static void main(String[] args) {
        // Array list
     ArrayList<String> list=new ArrayList<>();
     list.add("Red");// we can use list to colour name
     list.add("White ");
     list.add("Black ");
     list.add("Golden ");
     list.add("Blue ");
     list.add("Yellow");

   for( int i=0; i< list.size();i++){
       System.out.println(list.get(i));
   }





    }

}
