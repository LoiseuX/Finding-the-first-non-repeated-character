/*
 * Finding the first non repeated character in a string
 */
package finding.the.first.non.repeated.characterv2;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class FindingTheFirstNonRepeatedCharacterv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //get input from the user
        //System.out.println("Input string:");
        //Scanner in = new Scanner(System.in);
        //String input = in.nextLine();
        
        //given input
        String input = "Hello";
        
        for(int a = 0; a <input.length(); a++){
            boolean unique = true;
            
            for(int x = 0; x <input.length(); x++){
                if (a != x && input.charAt(a) == input.charAt(x)){
                unique =  false;
            }
            }
            if (unique){
                
                System.out.println("The first non-repeated character in this string is: " +input.charAt(a));
                break;
            }
        }
       
    }
    
}
