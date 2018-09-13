import java.util.Scanner;


public class Exercise4 {
    public static void main(String[] args) {
        int total = 0, i = 0;
        String num;
        int numAsInt;

        Scanner input = new Scanner(System.in);

        System.out.print("Q to Quit\nPlease enter a number: ");
        num = input.nextLine();


        while (!num.equals("q"))
        {
            numAsInt = Integer.parseInt(num);

            System.out.print("Please enter a number: ");
            num = input.nextLine();

            total += numAsInt;
            i++;
        }

        System.out.print("\n\n\nTotal: " + total + "\nEntries: " +i);
    }
}
