
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Welcome to the Radius calculator press any Key to Start-------");




            for (int i = 1; i < 5; i++)
                for (int e = 5; e > 0; e--)
                {
                    {
                        System.out.println("-----------------------------");
                        System.out.println("Hey you can use this calcultor " + e + " more time(s) till yoh have to purchase our full version only 3.99");
                    }
                    System.out.println("Please enter your Radius");
                    Double num =sc.nextDouble();

                    System.out.println("Enter 1 if you would like to get the area");
                    System.out.println("Enter 2 if you would like to get the circumfrence");

                    int num1 = sc.nextInt();

                    if (num1 == 1) {
                        System.out.println("The area of the circle with the radius " + num + " is :" + (Math.PI) * (num * num));
                    } else if (num1 == 2) {
                        System.out.println("The circumfrence of the circle with the radius " + num + " is :" + (2) * (Math.PI) * (num));

                    } else {
                        System.out.println("No answer for you boss");
                        System.out.println("Try again!");
                    }
                    System.out.println("You have used this calculator effiently " + i + " time(s)");
                    System.out.println("-----------------------------");


                }


    }
}