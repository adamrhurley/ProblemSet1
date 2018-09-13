import java.util.Scanner;


public class Exercise2 {
    public static void main(String[] args) {
        String fName,initials, lName;
        int dist ;
        double cost;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        fName = input.nextLine();

        System.out.print("Please enter Your Initials: ");
        initials = input.nextLine();

        System.out.print("Please enter your last name: ");
        lName = input.nextLine();

        System.out.print("Please enter the distance you traveled: ");
        dist = input.nextInt();

        if(dist>10)
            cost = (10*0.07) + ((dist-10) * 0.10);

        else
            cost = dist * 0.07;

        System.out.print("\n\n\nFirst Name: " + fName + "\nInitials: " + initials + "\nLast " +
                "name: " + lName + "\nDistance Traveled: " + dist + "km" + "\nAmount Due: €" + cost);

    }
}
