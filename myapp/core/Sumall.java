package myapp.core;

public class Sumall {

    public static void main (String[]args){

        int num = 0;
        int result = 0;
        //Get access to all the numbers
        for(int xyz = 0; xyz< args.length; xyz++){
            num = Integer.parseInt(args[xyz]);}
            result = result + num;

            System.out.printf("The sum is ", result);
   
    }
}
