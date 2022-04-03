package calculate;

import java.util.ArrayList;
import java.util.Scanner;

//Write a Java program to retrieve an element (at a specified index) from a given
//array list
public class programe6 {
    public static void main(String[] args) {
        ArrayList<String>vegetablelist=new ArrayList<>();
        vegetablelist.add("Tomatos");
        vegetablelist.add("LadyFinger");
        vegetablelist.add("Bringel");
        vegetablelist.add("Potato");
        vegetablelist.add("Onion");
        vegetablelist.add("carrot");
        System.out.println(vegetablelist);
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your index number ");
        int index=sc.nextInt();
        System.out.println(vegetablelist.get(index));









    }





}
