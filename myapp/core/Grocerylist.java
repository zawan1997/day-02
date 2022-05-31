package myapp.core;

import java.io.Console;
import java.util.*;

public class Grocerylist{

    public static void main(String[]args){


        Console cons = System.console();
        String input = "";
        input= cons.readLine("Welcome to your shopping cart");

        ArrayList<String> cart = new ArrayList<String>();

        String arr[]= input.split(" ", 10);

        if (arr[0].matches("add"))
        for (int i = 1; i <arr.length; i++)
        cart.add (arr[i]);
        
        {int counter=1;
        System.out.println(cart);
        counter++;
    }

    }
}
