import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args){
        Scanner myScaner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = myScaner.nextInt();
        int maxHeartRate = 220 - age;
        int targetHeartRate = 50- (maxHeartRate * 85/100);
        System.out.println("Your maximum heart rate should be:" + " " + maxHeartRate);
        System.out.println(" And your target HR Zone is:" + " "+ targetHeartRate);
    }
}
