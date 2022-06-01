/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Random;

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
    public  int selectRandomCardNumber()   {
        int cardNumber = (int) (Math.random() * 13);
        return cardNumber;
        }
    
    //method for suits
    public  String selectRandomCardSuit(String [] SUITS) {
        Random generator = new Random();
        int num = Math.abs(generator.nextInt(SUITS.length) + 1);
        return SUITS[num];
    }
     
    
     
     
}
