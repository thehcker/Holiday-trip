import java.util.Scanner;
public class TripPlanner {
    public static void main(String[]args){
       Greeting();
        Budget();
        TimeDifference();
        CountryArea();
    }
    public static void Greeting(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to vacation planner");
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name);
        System.out.println(" Where are you travelling to?");
        String destination = input.nextLine();
        System.out.print("Great! " + destination + " sounds like a great trip");
        System.out.println ("********************");
        System.out.println ();
    }
    public static void Budget () {

        System.out.print("How many days are you going to spend travelling? ");

        Scanner input= new Scanner (System.in);

        int day = input.nextInt();

        System.out.print("How much money (in USD) are you planning to spend? ");

        double usd = input.nextDouble();

        System.out.print("What is the 3 letter of currency symbol of your destination? ");

        String KESinCurrency = input.next();

        System.out.print("How many " + KESinCurrency + " are there in 1 USD? ");

        double currencyToUsd = input.nextDouble();

        System.out.print ("If you are travelling for " + day + " days that means ");

        System.out.print ( (day*24) + " hours or ");

        System.out.print ( 24*60*day + " minutes or " );

        System.out.print ( 24*60*60*day + " seconds, " );

        System.out.print ("and your budget is " + usd + " in USD, or " );

        double formatOne= currencyToUsd * usd * 100;

        int formatTwo= (int)formatOne;

        double formatThree= formatTwo/100.0;

        System.out.print (formatThree + " " + KESinCurrency );

        double formatFour= formatThree/day * 100;

        int formatFive= (int)formatFour;

        double formatSix= formatFive/100.0;

        System.out.println (" so you can spend " + formatSix + " " + KESinCurrency + " per day.");

        System.out.println ("********************");

        System.out.println ();

    }

    public static void TimeDifference () {

        System.out.print("What is the time difference between your home and your destination? ");

        Scanner input= new Scanner (System.in);

        int TimeDifference = input.nextInt();

        System.out.print("When it is midnight at your home, the time at your destination is ");

        System.out.println( (24 + TimeDifference)%24 + ":00");

        System.out.print("When it is noon at your home, the time at your destination is ");

        System.out.println( (12 + TimeDifference)%24 + ":00");

        System.out.println ("********************");

        System.out.println ();

    }

    public static void CountryArea () {

        System.out.print("What is the square area of your destination country in Km^2? ");

        Scanner input = new Scanner(System.in);

        int areaKm = input.nextInt();

        double formatOne = areaKm * 0.62137 * 0.62137 * 100;

        int formatTwo = (int) formatOne;

        double formatThree = formatTwo / 100.0;

        System.out.print("The square area of your destination country in Mile^2 is ");

        System.out.println(formatThree);

        System.out.println("********************");

        System.out.println();
    }
}
