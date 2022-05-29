/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** define card value and suits
 * 
 *
 * @author sivagamasrinivasan
 * modifier: Harnoor Kaur (Student ID: 991662978)
 * Date modified: May 29, 2022
 */
public class Card 
{
    private int value;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = {"diamonds","clubs","spades","hearts"};
    


    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
        
        
   //number
    private int selectRandomCardNumber()   {
        int cardNumber = (int) (Math.random() * 13);
        return cardNumber;
        }
        
    
    //method for suits
     private String selectRandomCardSuit() {
        String cardSuit;
        int s = (int) (Math.random() * 4);
        switch (s) {
        case 1:
            cardSuit = "Clubs";
            break;
        case 2:
            cardSuit = "Diamonds";
            break;
        case 3:
            cardSuit = "Hearts";
            break;
        case 4 :
            cardSuit = "Spades";
            break;
        default :
            cardSuit = "Enter a valid number";
            break;
        
        
        }
        return cardSuit;
     }
}
