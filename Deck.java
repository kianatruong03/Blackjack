package ITSCLab11;

import javax.lang.model.util.ElementScanner6;

public class Deck 
{
    public Card drawCard()
    {
        int value = (int) (((Math.random() * 13) + 1));
        int suitValue = (int) (((Math.random() * 4) + 1));

        String suit;
        if(suitValue == 1)
        {
            suit = "Spades";
        }
        else if(suitValue == 2)
        {
            suit = "Clubs";
        }
        else if(suitValue == 3)
        {
            suit = "Hearts";
        }
        else
        {
            suit = "Diamonds";
        }
        return new Card(value, suit);
    }
}
