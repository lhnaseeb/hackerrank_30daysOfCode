/* HOW TO PLAY

1. Computer picks random # 
2. User Guesses
3. Computer gives clues
4. We guess until we get it 
*/

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber{

    int theNUMBER;
    int max;
    Scanner scanner = new Scanner(System.in);


    //constructor
    public GuessTheNumber(){
        Random rand = new Random();
        max = 100;
        theNUMBER = Math.abs(rand.nextInt()) % (max + 1);
    }

    public void play(){
        while(true){
            int move = scanner.nextInt();
            if (move > theNUMBER){
                System.out.println("Your number is too big.");
            }
            else if (move < theNUMBER){
                System.out.println("Your number is too small.");
            }
            else {
                System.out.println("You got it!");
                break;
            }
        }
    }

    public static void howBigIsMyNumber(int x){
        if (x >= 0 && x<=10){
            System.out.println("Our number is pretty small.");
        }
        else if (x>=11 && x<=100){
            System.out.println("Our number is pretty big.");
        }
        else{
            System.out.println("Number is out of range.");
        }
       
    }
    public static void main(String[] args) {
        
        GuessTheNumber game = new GuessTheNumber();
        System.out.println("Try and guess my number! It's between 0 and "+game.max+". Type a number and hit enter to get started.");
        game.play();
        
        
        /*howBigIsMyNumber(0);
        howBigIsMyNumber(10);
        howBigIsMyNumber(11);

        howBigIsMyNumber(100);
        howBigIsMyNumber(5);
        howBigIsMyNumber(75);
        howBigIsMyNumber(-1);
        howBigIsMyNumber(105);*/






    }
}