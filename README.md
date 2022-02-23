# Finding-the-first-non-repeated-character

    import java.util.Scanner;
    public class FindingTheFirstNonRepeatedCharacterv2 {

    public static void main(String[] args) {
        
        //get input from the user
        //System.out.println("Input string:");
        //Scanner in = new Scanner(System.in);
        //String input = in.nextLine();
        
        //given input
        String input = "HELLO";
        
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
