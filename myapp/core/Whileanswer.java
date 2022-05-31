package myapp.core;

import java.io.Console;

public class Whileanswer {
    
    public static void main(String[]args){

        //Get the console
        Console cons = System.console();
        //Variable to holf the result 
        int result = 0;
        int opnd = 0;
        String input = "";

        //Controls the loop

        boolean stop = false;
        while (!stop) {
            input = cons.readLine("Enter a number; return to end");
            if (input.length()> 0){
                opnd = Integer.parseInt(input);
                result += opnd;

            } else
            stop = true;
        }
    }
    
}
