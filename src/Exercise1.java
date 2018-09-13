import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        String Name, Class;
        int NoSnacks;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name:");
        Name = input.nextLine();

        System.out.print("please enter your class name:");
        Class = input.nextLine();

        System.out.print("Please enter the amount of snacks you want:");
        NoSnacks = input.nextInt();

        System.out.print("\n\nName: " + Name +"\nClass: " + Class + "\nNumber " +
                "Of Snacks: " + NoSnacks + "\nThe Price Is: €" + NoSnacks*2);


    }
}
