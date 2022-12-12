import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class rockPaper {

        public static void main(String[] args ) {

            String path = "res/RPC.txt";
            File file = new File(path);
            ArrayList<Character> compare = new ArrayList<Character>();
            ArrayList<Character> compare1 = new ArrayList<Character>();
            Scanner scr;

            try {
                scr = new Scanner(file);

            } catch (FileNotFoundException e) {

                throw new RuntimeException(e);

            }


            int reving = 0;
            int score = 0;
            int up = 0;
            while (scr.hasNextLine()) {
                String why = scr.nextLine();
                // 1250 is where the elves input stops
                // the rest is us
                // we are going to store the values then compare them
                // there is a space between so charAt(3) will give you us

                // Rock gives you a score of 1
                // Paper gives you a score of 2
                // Scissors gives you a score of 3

                // we will add this plus the outcome

                // if you lose you get 0
                // if draw 3 points
                // if you win 6 points


                // change us to X: means you lose. Y : means you need to end the round in a draw. Z means you need to win
                // we need to

                if (!why.isEmpty()) {
                    compare.add(why.charAt(0));
                    compare1.add(why.charAt(2));

                    // make if's for A  B  C that should be really easy

                    if (compare.get(up) == 'A') { // A is rock
                        // X - rock, Y - paper, Z - scissors
                        // 1         2          3
                        // X - lose  Y - draw   Z - Win
                        if (compare1.get(up) == 'X') {
                            // we need to lose so we will play scissors
                            score += 3;
                            score += 0;
                            up++;
                            System.out.println(score);
                        }

                        else if (compare1.get(up) == 'Y') {
                            // we need to draw so we play rock

                            score += 1;
                            score += 3;
                            up++;
                            System.out.println(score);

                        }

                        else if (compare1.get(up) == 'Z') {
                            // win so we play paper

                            score += 2;
                            score += 6;
                            up++;
                            System.out.println(score);


                        }
                    } else if (compare.get(up) == 'B') { // B is Paper

                        if (compare1.get(up) == 'X') {
                            // we need to lose so we need to play rock
                            score += 1;
                            score += 0;
                            up++;
                            System.out.println(score);
                        }

                        else if (compare1.get(up) == 'Y') {
                            // we need to Draw so we play paper
                            score += 2;
                            score += 3;
                            up++;
                            System.out.println(score);
                        }

                        else if (compare1.get(up) == 'Z') {
                            // we need to win so we play scissors
                            score += 3;
                            score += 6;
                            up++;
                            System.out.println(score);
                        }

                    } else if (compare.get(up) == 'C') { // C is scissors

                        if (compare1.get(up) == 'X') {
                            // we need to lose so we need to paper
                            score += 2;
                            score += 0;
                            up++;
                            System.out.println(score);
                        }

                        else if (compare1.get(up) == 'Y') {
                            // we need to Draw so we play scissors
                            score += 3;
                            score += 3;
                            up++;
                            System.out.println(score);
                        }

                        else if (compare1.get(up) == 'Z') {
                            // we need to win so we play rock
                            score += 1;
                            score += 6;
                            up++;
                            System.out.println(score);
                        } else {
                            System.out.println("NONE");
                        }


                    }

                }


            }
        }


}
