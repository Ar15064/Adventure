import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Rucksack {
    public static void main(String[] args ) {
        // all the rucksacks have two parts and to find it divided by half and that will give you the first and second
        // find what they have in common in both rucksacks

        // Lowercase item types a through z have priorities 1 through 26. // alphabet
        // a is 1 b is 2...
        // Uppercase item types A through Z have priorities 27 through 52.

        //Find the item type that appears in both compartments
        // of each rucksack. What is the sum of the priorities of those item types?
        String path = "res/rucksack.txt";
        ArrayList<Character> letters = new ArrayList<Character>();
        File file = new File(path);
        Scanner scr;

        try {
            scr = new Scanner(file);

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        }


        while (!path.isEmpty()) {
            System.out.println("In the loop");
            String why = scr.nextLine(); // divided it in two
            // why.charAt(why.length/2 - 1) // will give you half of the rucksack
            for (int i = 0; i < why.length()/ 2 -1; i++) {
                // take the first character then find if it is the same in the seconds part of the rucksack
                for (int j = why.length() / 2 - 1; j < why.length() - 1; j++) {
                    System.out.println(j);
                    if(why.charAt(i) == why.charAt(j)) {
                        letters.add(why.charAt(i));
                        System.out.println("found a common pair");
                    }

                    else {
                        System.out.println("Nope");
                    }
                }
            }
//
        }

        System.out.println("letter size " + letters.size());
        for (int i = 0; i < letters.size(); i++) {
            System.out.println("Inside the loop of letters");
            System.out.println(letters.get(i));
        }




    }
}
