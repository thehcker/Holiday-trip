import java.util.*;
public class OddsandEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.print("Hi " + userName);
        System.out.print(" which do you choose? (O)dds or (E)vens?");
        String answerOne = input.next();
        if (answerOne.equalsIgnoreCase("O")) {
            System.out.println(userName + " has picked Odds! \nThe computer will be Even ");
        } else {
            System.out.println(userName + " has picked Even \nThe computer will be Odd");
            System.out.println("---------------------------------------");
        }


        System.out.println("How many fingers do you put out?");
        int playerNumber = input.nextInt();
        System.out.println("The computer plays ");
        int computer = rand.nextInt(6);
        System.out.print(computer);
        System.out.println(" Fingers");
        System.out.println("-----------------------------------------");

   int totalFingers =  playerNumber + computer;
        System.out.println(playerNumber +" + " + computer+ " = "+totalFingers);
        if((totalFingers % 2)== 1) {
            System.out.println(totalFingers+" is ...odd|!");
        } else {
            System.out.println(totalFingers+" is...even!");
        }
        if ((answerOne.equals("O"))&& ((totalFingers %2))== 1){
    System.out.println(userName+" wins");
        }
        else if ((answerOne.equals("E"))&& ((totalFingers %2)== 0)){
            System.out.println(userName + " wins");
        } else{
            System.out.println("Computer wins");
            System.out.println("---------------------------------------");
        }

        }
}
