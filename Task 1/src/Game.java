import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.println("Guess the number(1-100) : ");
            userNumber = sc.nextInt();
            if (userNumber == myNumber) {
                System.out.println("Woohoo....CORRECT NUMBER!!!");
            }

            else if (userNumber > myNumber) {
                System.out.println("oops... too high.. try again");
            } else {
                System.out.println("oops.. tow low, try again");
            }

        } while (userNumber >= 0);
        System.out.println("My Number was : ");
        System.out.println(myNumber);
        sc.close();

    }
}