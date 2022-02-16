import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	    Scanner userIn = new Scanner(System.in);
        boolean again = false;
        String playerOne;
        String playerTwo;

        while(!again)
        {
            System.out.println("Player one enter your choice(R,P,S): ");
            playerOne = userIn.nextLine();

            System.out.println("Player two enter your choice(R,P,S): ");
            playerTwo = userIn.nextLine();

            switch(playerOne)
            {
                case "R":
                    switch (playerTwo)
                    {
                        case "R":
                            System.out.println("It's a draw!");
                            break;
                        case "P":
                            System.out.println("Player Two wins!");
                            break;
                        case "S":
                            System.out.println("Player One Wins!");
                            break;
                        default:
                            System.out.println("Error, not correct.");
                            break;
                    }
            }
            switch (playerOne)
            {
                case "P":
                    switch (playerTwo)
                    {
                        case "R":
                            System.out.println("Player One Wins!");
                            break;
                        case "P":
                            System.out.println("It's a draw!");
                            break;
                        case "S":
                            System.out.println("Player Two Wins!");
                            break;
                        default:
                            System.out.println("Error, not correct.");
                            break;
                    }
            }
            switch (playerOne)
            {
                case "S":
                    switch (playerTwo)
                    {
                        case "P":
                            System.out.println("Player One Wins!");
                            break;
                        case "S":
                            System.out.println("It's a draw!");
                            break;
                        case "R":
                            System.out.println("Player Two Wins!");
                            break;
                        default :
                            System.out.println("Error, not correct.");
                            break;
                    }
            }
            switch (playerOne)
            {
                case "":
                    switch (playerTwo)
                    {
                        case "":
                            System.out.println("Error, move not found.");
                            break;
                    }
            }
            System.out.println("Would you like to play again?(yes,no) ");
            String run = userIn.nextLine();
            if(run.equals("no"))
            {
                again = true;
            }
        }
    }
}
