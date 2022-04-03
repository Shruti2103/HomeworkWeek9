package calculate;

import java.util.Arrays;

// Write a Java program to reverse an array of integer values.
public class Programe3 {
    public static void main(String[] args) {
        int a []={10,20,30,40,50};

        System.out.println("Original array :"+ Arrays.toString(a));
        System.out.println("Reverse Array is : ");
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i]+ " ");


        }



    }


}
