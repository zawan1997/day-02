package myapp.core;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;
//kkk
public class Grocerylistans {

    public static void main (String[]args){

       List<String>cart = new LinkedList<String>();
        Console cons= System.console();
        boolean stop = false;
        String input;
        int delIndex;

        while (!stop){
            input = cons.readLine("> ");
            // add <list of space separated items>
            //list
            //del
            //end

            String[]terms = input.split(" ");

            System.out.printf("READ: %s\n", input);

            switch (terms[0]) {
                case "add":
                
                break;

                case "list":
                if(cart.size()> 0) {
                    for(int i =0; i< cart.size(); i++){
                        System.out.printf("%d. %s\n", (i + 1), cart.get(i));
                    }}
                    
                    else {
                    System.out.println("Your cart is empty");
                }
                break;

                case "del":
                if (terms.length< 2){
                    System.err.println("Please provide an index to delete");}
                    else {
                        delIndex = Integer.parseInt(terms[1]) - 1;
                        if (delIndex <cart.size())
                        cart.remove(delIndex);
                        System.out.println("Deleted");
                    }
                

                case "end":
                break;

                default:

            }
        }
        

}
    }





    

