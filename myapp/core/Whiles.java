package myapp.core;

import java.io.Console;

public class Whiles {
    public static void main(String[]args) {

        Console cons = System.console();

        String input = "ABC";

        int sum = 0;

        while (input.length() > 0) {
            input = cons.readLine("Pkease enter a number. Blank to end");
            if (input.length()>0)
            sum+= Integer.parseInt(input);

            {System.out.printf(">>> %s\n", input.toUpperCase());}
        }
    }
}    
        
    
    

    
    


  