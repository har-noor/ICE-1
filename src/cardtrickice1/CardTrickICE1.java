/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.*;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 * modifier: Harnoor Kaur (Student ID: 991662978)
 * Date modified: May 29, 2022
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        
        Random intNum = new Random();//Random class
        System.out.println("CARDS IN THE MAGIC HAND:- ");
        
        for( int i=0; i<magicHand.length; i++)
        {
            Card c1 = new Card();
            
            c1.setValue(intNum.nextInt(13) + 1); //method to generate random number
            c1.setSuits(Card.SUITS[intNum.nextInt(4)]);//random method for suit 
            
            magicHand[i] = c1;
            
            System.out.println(c1);
        }
        //step 2:take input 
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the card!");
        System.out.println("---------------");
        System.out.println("Enter a card number between 1 - 13");
        int cardNumber = input.nextInt();
        System.out.println("Enter a suit from the following:- " + 
                       "\n1:- Diamonds \n2:- Clubs \n3:- Spades \n4:- Hearts");
        String cardSuit = input.next();
        
        Card key = new Card();
        key.setValue(cardNumber);
        key.setSuits(cardSuit);
        
        
        
        //printing user response
        System.out.println("Your card is " + cardNumber + " of " + cardSuit);
        
        //step 3: match with array
        
        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            
            if ((magicHand[i].getValue() == key.getValue()) && (magicHand[i].getSuits()== key.getSuits())){
                System.out.println("Card is found in magic hand.");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Sorry, no match");
        }
        
        //(hard-code) Card Object
        Card luckyCard = new Card();
        luckyCard.setValue(12);
        luckyCard.setSuits("spades");
            
        
    }
    
}
