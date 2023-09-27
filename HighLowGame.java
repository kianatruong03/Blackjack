/**
 * ITSC1212 - 006 - von Briesen
 * @author Truong, Kiana
 * @version 1.0
 * @since 11/10/2021 3:49pm
 * 
 * Knockout Turkey - King of Clubs
 * 
 * Lab 11: Creating a card game
 * 
 */

package ITSCLab11;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class HighLowGame
{
    public static void main (String[] args) 
    {
        Deck deck = new Deck();
        Scanner aScanner = new Scanner(System.in);

        Card card1 = deck.drawCard();
        System.out.println("The first card is " + card1.declareCard());
        System.out.println("Will the next card be higher or lower?");
        System.out.println("Enter 1 for lower, 2 for higher.");
        
        int choice = aScanner.nextInt();

        Card card2 = deck.drawCard();
        System.out.println("The next card is " + card2.declareCard());

        boolean higher = card2.getValue() >card1.getValue();
        if(card1.getValue() == card2.getValue())
        {
            System.out.println("Card values were the same, no winner or loser this round.");
        }
        else if((higher && choice == 2) || (!higher && choice == 1))
        {
            System.out.println("Winner!");
        }
        else
        {
            System.out.println("Sorry, your guess was incorrect.");
        }

    }
}