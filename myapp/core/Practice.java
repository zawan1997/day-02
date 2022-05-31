package myapp.core;

public class Practice{

    public static void main(String[]args){

        //Instantiate the array
        System.out.println("Hello WORLD");

        //Assign some values to the array
        String[]todos = new String[5];
        todos[0] = "learn Java";
        todos [1] = "learn Javo";
        todos [2] = "learn Javi";

        System.out.printf("Index; %d: value = %s\n", 0, todos[0]);
        System.out.printf("Index; %d: value = %s\n", 5, todos[1]);
        System.out.printf("Index; %d: value = %s\n", 0, todos[2]);

        //Every array has a property called length
        System.out.printf("Size of todos: %d\n", todos.length);
        System.out.printf("Size of args: %d\n", args.length);
        System.out.printf("Index; %d: value = %s\n", 0, args[0]);
        System.out.printf("Index; %d: value = %s\n", 0, args[0]);

        //Size of args 
        
    }
}


