import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // take input from user, S,P,R
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your move S,P or R. ");
        char UserMove = input.next().charAt(0);
        System.out.println("User entered: "+UserMove);

        // make computer to make there move
        char[] arr= {'S','P','R'};
        // to generate random number
        Random random= new Random();
        int guessNumber =random.nextInt(3);
        char ComputerMove= arr[guessNumber];
        System.out.println("Computer entered: "+ComputerMove);

        if(UserMove==ComputerMove){
            System.out.println("Draw");
        }
        else if (UserMove=='S' && ComputerMove== 'P') {
            System.out.println("User won the game");
        }
        else if (UserMove=='R'&& ComputerMove=='S') {
            System.out.println("User won the game");
        }
        else if (UserMove=='P'&& ComputerMove=='R') {
            System.out.println("User won the game");
        }
        else if (ComputerMove=='R'&& UserMove=='S') {
            System.out.println("Computer won the game");
        }
        else if (ComputerMove=='P'&& UserMove=='R') {
            System.out.println("Computer won the game");
        }
        else if (ComputerMove=='S'&& UserMove=='P') {
            System.out.println("Computer won the game");
        }
        else{
            System.out.println("Please enter P,S or R and try again");
        }
    }
}

