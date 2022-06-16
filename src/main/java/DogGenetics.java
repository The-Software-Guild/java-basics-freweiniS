import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random randomPercentage = new Random();
        System.out.println("What is Your Dog's Name?");
        String dogName = s.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + " " +  dogName + ":");
        System.out.println(randomPercentage.nextInt(100) +"%" + "St. Bernard \n" + randomPercentage.nextInt(100) +"%" + "Chihuahua\n"
        + randomPercentage.nextInt(100) + "%" +  "Dramatic RedNosed Asian Pug\n");
    }
}
