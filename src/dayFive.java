import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class dayFive {


    public static void main(String[] args ) {

        String path = "res/day5.txt";
        File file = new File(path);
        Scanner scr;

        try {

            scr = new Scanner(file);

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        }


        Stack[] stacks = new Stack[9];
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<Character>();
        }

        while(scr.hasNextLine()) {
            // the length of the input will be 8
            // we will add the input to the corresponding stack


            String temperaly = scr.nextLine();
            if(!temperaly.isEmpty()) {

                for (int i = 0; i < 9*3; i++) {
                    stacks[0].push(temperaly.charAt(i));
                    System.out.println("Added");

                }


            }





        }



        // initial all the stacks

        // put the characters on the correct stacks

        // once all stacks are populated

        // read the line

        // read  a line of input

        // perform the line of input

        // output the top of each stack

    }
}
