package ITSCLab11;

import javax.lang.model.util.ElementScanner6;

public class Card 
{
    private int value;
    private String suit;

    public Card(int value, String suit)
    {
        this.value = value;
        this.suit = suit;

    }

    public String getSuit()
    {
        return suit;
    }

    public String declareCard()
    {
        if(this.value == 11)
        {
            return "this Jack of " + suit;
        }
        else if(this.value == 12)
        {
            return "this Queen of " + suit;
        }
        else if(this.value == 13)
        {
            return "this King of " + suit;
        }
        else if(this.value == 1)
        {
            return "this Ace of " + suit;
        }
        else
        {
            return "the " + value + " of " + suit;
        }
    }
    
    public int getValue()
    {
        return value;
    }

    public int getValue(boolean isBlackjack)
    {
        if(!isBlackjack)
        {
            return value;  
        }
        else
        {
            if(value ==1)
            {
                return 11;
            }
            else if(value > 10)
            {
                return 10;
            }
            else
            {
                return value;
            }
        }

    }

}
