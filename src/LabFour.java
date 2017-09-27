import java.util.Scanner;
public class LabFour {
    public static void main(String args[]) {
        int beforeBegin = 0;
        while (beforeBegin == 0) {
            int letsBegin = 0;
            while (letsBegin == 0) {
                System.out.println("Truth or dare");
                letsBegin = 1;
                Scanner myScanner = new Scanner(System.in);
                String megaGosh = myScanner.nextLine();
                System.out.println("You just said " + megaGosh);
                if (megaGosh == "dare" || megaGosh == "Dare") {
                    System.out.println("I dare you to jump off a cliff");
                }
                if (megaGosh == "truth" || megaGosh == "Truth") {
                    System.out.println("Are you in it for the money?");
                }
            }

        }

    }
}