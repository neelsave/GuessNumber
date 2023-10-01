import java.util.Scanner;
import java.util.Random;

public class GuessNumber{
    public static void main(String args[]){
        System.out.println("Welcome to Guess Number Version 1.0");
        System.out.println("Choose any number between 1 to 100");
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int randomNumber = rn.nextInt(100);
        int num = sc.nextInt();
        int attempt = 1;
        while(num != randomNumber){
            attempt += 1;
            if(num > randomNumber){
                System.out.println("Guess lower number");
            }
            else{
                System.out.println("Guess higher number");
            }
            num = sc.nextInt();
        }
        System.out.println("Congratulations you guessed correct number in " + attempt + " attempts.");

    }
}