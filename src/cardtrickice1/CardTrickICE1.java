/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

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
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(selectRandomCardNumber());//use a method to generate random *13
            c1.setSuits(selectRandomCardSuit());//random method suit 
        magicHand[i] = c1;
        }
        //step 2:take input 
        
        //step 3: match with array 
    }
    
}
