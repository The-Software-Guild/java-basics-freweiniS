import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        int tiecount = 0;
        int userWinCount = 0;
        int compWinCount = 0;
        String [] ran = {"rock", "paper", "scissors"};
        Random randomString = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("How many rounds you want to play? Please choose between 1 and 10");
        int round = s.nextInt();
        if (round <1 || round >10){
            System.out.println("please use numbers between 1 and 10");

        }
        for(int i =0; i<round; i++){
          int select = randomString.nextInt(ran.length);
            System.out.println("Please choose 1 for Rock, 2 for Paper, and 3 for Scissors");
            int userChoice = s.nextInt();
            if(userChoice == select){
                tiecount+=1;
                System.out.println("tie");
            }
            else if(userChoice ==1 & select==2 ) {
                userWinCount += 1;
            }
           else if(userChoice == 3 & select== 2) {
                userWinCount += 1;
            }
           else if(userChoice==1 & select==3){
                userWinCount+=1;
            }
            }
        System.out.println("Number of ties = " + tiecount  + "Number of computer Win = "+ "  "+ (round-(tiecount+userWinCount))  + "Number of User Win = "+ " "+ userWinCount);

        }

    }


