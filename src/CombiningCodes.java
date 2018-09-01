import java.util.*;
public class CombiningCodes {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("If player one equals");
        String playerOne = input.next();
        System.out.println("and player Two equals");
        String playerTwo = input.next();
        if(playerOne.equals("rock")&& (playerTwo.equals("scissors"))) {
            System.out.println("Player One wins");
        }else if(playerOne.equals("scissors")&& (playerTwo.equals("rock"))){
            System.out.println("Player One wins");
        }else if(playerOne.equals("paper")&& (playerTwo.equals("rock"))) {
            System.out.println("Player One wins");
        }else if(playerOne.equals("rock")&& (playerTwo.equals("paper"))) {
            System.out.println("Player Two wins");
        }else if(playerOne.equals("scissors")&& (playerTwo.equals("paper"))) {
            System.out.println("Player Two wins");

        }else{
            System.out.println("It's a tie");
        }
    }
}
