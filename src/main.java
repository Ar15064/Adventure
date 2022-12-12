import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class main {


    public static void main(String[] args) {
        String path = "res/elfcalories.txt";
        File file = new File(path);

        Scanner scr;
        ArrayList<Integer> elves = new ArrayList<Integer>();
        StringBuffer s;
        int storge = 0;
        int blah = 0;
        int counter = 0;
        int[] addingA = new int[239];



        try {

            scr = new Scanner(file);

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        }


        while (scr.hasNextLine()) {
            String why = scr.nextLine();
            System.out.println(why);

            if (why != "") {

                // store the total of the elf
                blah = Integer.parseInt(why);
                storge = storge + blah;
                // 239 spaces = 239 elves



            } else {
                System.out.println("Found a space");
                for (int i = 0; i < 239; i++) {

                }


            }

            System.out.println(addingA[0]);


        }


    }





//        while(scr.nextLine() != "") {
//            elves.add(scr.nextLine());
//            for (int i = 0; i < elves.size(); i++) {
//                System.out.println(elves.get(i));
//            }
//        }







    // going to make al list of all the elves
    // its gonna be a String
    // the way we are going to find different elfs with spaces
    // we are going to add each elf and store its calories and compare





}