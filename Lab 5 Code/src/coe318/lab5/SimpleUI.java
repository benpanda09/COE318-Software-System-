package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("House holds:\n" + this.game.getHouseCards().toString() + "\n======"); 
        System.out.println("You hold:\n" + this.game.getYourCards().toString() + "\n======");
//FIX THIS
    }

  @Override
    public boolean hitMe() {
        System.out.println("Would you like a hit? (yes/no)");
        String userChoice = user.nextLine();
        while (!userChoice.equals("yes") && !userChoice.equals("no")){
            System.out.println("Invalid: you must type either 'yes' or 'no'.");
            System.out.println("Would you like a hit? (yes/no)");
            userChoice = user.nextLine();
        }
        if (userChoice.equals("yes")){
            return true;
        }
        else{
            return false; 
        }
    }
  @Override
    public void gameOver() {
        this.display();
        
        int userScore = game.score(game.getYourCards()); 
        int houseScore = game.score(game.getHouseCards());
        
        System.out.println("Your score: " + userScore + "\n");
        System.out.println("House score: " + houseScore + "\n");
        
        if((userScore <= 21) && (userScore > houseScore || houseScore > 21)){
            System.out.println("You wins!");    
        }
        else {
            System.out.println("House wins!");
        }
            System.out.println("Game Over!");
        //FIX THIS
    }

}