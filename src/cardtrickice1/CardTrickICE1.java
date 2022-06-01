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
        
        
        
        for( int i=0; i<magicHand.length; i++)
        {
            Card c1 = new Card();
            
            c1.setValue(c1.selectRandomCardNumber()); //use a method to generate random *13
            c1.setSuits(c1.selectRandomCardSuit(args));//random method suit 
            
            magicHand[i] = c1;
        }
        //step 2:take input 
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the card!");
        System.out.println("---------------");
        System.out.println("Enter a card number between 1 - 13");
        int cardNumber = input.nextInt();
        System.out.println("Enter a number from 1 - 4 for selecting a suit" + 
                       "\n 1:- Diamonds \n2:- Clubs \n3:- Spades \n4:- Hearts");
        int suitNumber = input.nextInt();
        
        
        
        String cardSuit;
        
        switch (suitNumber) {
        case 1:
            cardSuit = "Clubs";
            break;
        case 2:
            cardSuit = "Diamonds";
            break;
        case 3:
            cardSuit = "Hearts";
            break;
        default:
            cardSuit = "Spades";
            break;
        }
        
        Card key = new Card();
        key.setValue(cardNumber);
        key.setSuits(cardSuit);
        
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
            System.out.println("Card is not found in the magic hand");
        }
            
        
    }
    
}
