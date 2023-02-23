import java.util.*;
import java.util.Random;


class Game{
    public int number;
    public int UserInputNumber;
    public int No_of_Attempts;

    public int getNo_of_Attempts() {
        return No_of_Attempts;
    }

    public void setNo_of_Attempts(int no_of_Attempts) {
       this.No_of_Attempts = no_of_Attempts;
    }

    public Game() {
        Random random = new Random();
        this.number=random.nextInt(100);

    }
    void userInput(){
        System.out.println("Guess The Number: ");
        Scanner sc = new Scanner(System.in);
        UserInputNumber=sc.nextInt();

    }
    boolean isCorrect(){
        No_of_Attempts++;
        if (UserInputNumber==number){
            System.out.format("great You Guessed it Right , It was %d\n You guessed it in %d Attempts",number,No_of_Attempts);
            System.out.println();
            return true;
        } else if(UserInputNumber>number) {
            System.out.println("Your Guessed Number Is Too High Try Again...");

        } else if (UserInputNumber < number) {
            System.out.println("Your Guessed Number is Too Low Try Again...");

        }
        return false;
    }
}


public class NumbersGame {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        while (!b){
            g.userInput();
            b=g.isCorrect();
            System.out.println(b);

        }

    }
}
