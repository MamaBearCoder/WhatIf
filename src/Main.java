import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1, num2;
        int snum, pnum, anum;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        snum = num1 + num2;
        pnum = num1 * num2;
        anum = snum/2;

        if (snum > 200)
        {
        System.out.println("The sum is" + " " + snum + "*");
        }
        else {
            System.out.println("The sum is" + " " + snum);
        }

        System.out.println("The product is" + " " + pnum);
        System.out.println("The average is" + " " + anum);
        }


    }

