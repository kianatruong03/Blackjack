package ITSCLab11;

import java.util.Scanner;

public class Blackjack 
{
    public static void main(String [] args) throws InterruptedException
    {
        Deck deck = new Deck();
        Scanner aScanner = new Scanner(System.in);
    
        int houseTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
        int playerTotal = deck.drawCard().getValue(true)+ deck.drawCard().getValue(true);

        System.out.println("The House is showing: " + houseTotal);
    
        while (playerTotal < 22)
        {
            Thread.sleep(500);
            System.out.println("Players total is: " + playerTotal);
            System.out.println("Would you like to hit or stand \n\tEnter 1 for hit or 0 for stand");
            int choice = aScanner.nextInt();

            if(choice == 0)
            {
                break;
            }
            else if (choice == 1)
            {
                Card nextCard = deck.drawCard();

                System.out.println("The player has been delt the " + nextCard.declareCard());
                playerTotal+= nextCard.getValue(true);
            }
            else
            {
                System.out.println("Invalid option, try again.");
            }

            if(playerTotal > 22)
            {
                System.out.print("The player has busted! You lose :(");
            }
            else
            {
                System.out.println("\nThe player stands with " + playerTotal);

                System.out.println("The House will play next.\n");
            }


        }

        while (houseTotal < 17)
        {
            System.out.println("House total is: " + houseTotal);
            System.out.println("The House hits");
            Card houseCard = deck.drawCard();
            System.out.println("House was delt " + houseCard.declareCard());
            houseTotal += houseCard.getValue(true);
        }

        if(houseTotal > 22)
        {
            System.out.println("The house has busted! They lose :(");
            System.out.println("The player wins");
        }
        else
        {
            System.out.println("House stands");
        }

        
            /////////////////////////////////////////////////////
        if(houseTotal < 22 && playerTotal > 22)
        {
            System.out.println("The House Wins");
        }
        else if(playerTotal < 22 && houseTotal >22)
        {
            System.out.println("The Player Wins");
        }
        else
        {
            System.out.println("It's a tie!");
        }

    }


    
}
