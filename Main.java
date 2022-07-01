import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       

        System.out.println("Please enter the diameter of your circle");
        int diameter = getInt(scanner);

        GUI gui = new GUI(diameter);

    }

    public static int getInt(Scanner scanner) {
        int retval = 0;
        boolean good = false;
        while (!good) {
            if (scanner.hasNextInt()) {
                retval = scanner.nextInt();
                good = true;
            } else {
                System.out.println("ERROR: input must be integer");
                good = false;
            }
        }
        return retval;
    }

}
