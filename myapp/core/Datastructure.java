package myapp.core;

//import the collection framywork
import java.util.*;


public class Datastructure {

    public static void main(String[]args){

        //Create a list of Integer 
        //Concept of the list. <> means its a list of Integer
        List<Integer> intList = new LinkedList<Integer>();
        intList.add(Integer.parseInt("42"));
        intList.add(10);
        intList.add(50);
        intList.add(2, 10);

        System.out.println(intList);

        for (int i = 0; i <intList.size(); i++){
            System.out.printf("%d = %d\n", i, intList.get(i));
        }

        


    }
    
}
