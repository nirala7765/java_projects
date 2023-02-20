import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class paper_rock_scissors_game {
    public static void main(String[] args) {
        //0.Rock
        //1.paper
        //2.Scissors
        Scanner Ui = new Scanner(System.in);
        System.out.println("Select your Choice :\n0-Rock\n1-Paper\n2-Scissors");
        int UserInput = Ui.nextInt();
        Random random = new Random();
      int computerInput = random.nextInt(3);
        if (UserInput==computerInput){
            System.out.println("Match Tie");
        }
        else if (UserInput==0 && computerInput==2 || UserInput==1 && computerInput==0
                     || UserInput==2 &&  computerInput==1   ) {
            System.out.println("You Win!");

        }
        else {
            System.out.println("Computer Win!");
        }
        System.out.println("Computer Choice: "+computerInput);

    }
}
