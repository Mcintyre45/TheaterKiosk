import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;

        System.out.print("Enter your age: ");
        if (in.hasNextInt());
        {
            age = in.nextInt();
            in.nextLine();
            if (age >= 21)
            {
                System.out.println("You get a free paper wrist band");
            }
        }
    }
}