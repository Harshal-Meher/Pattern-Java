import java.util.Scanner;

public class LeedCode
{
    public static void main(String[] args) {

        System.out.println("Hello..");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();


        //square
        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1 ; j <= n ; j ++)
            {
                System.out.print(" *");
            }
            System.out.println(" ");
        }


            //Trangle
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= i * 1 ; j++)
                {
                    System.out.print(" *");
                }

                for (int j = 1; j <= n - i; j++)
                {
                    System.out.print(" ");
                }

                System.out.println(" ");
            }

         // half diamond
        for (int i = 1 ; i < n ; i++)
        {
            for (int j = 1 ; j <= n - i ; j ++)
            {
                System.out.print(" ");
            }
            for (int j =1 ; j <= 2 * i - 1 ; j ++){
                System.out.print("*");
            }
            System.out.println("");
        }


        //Diamond

        //space formula : n-i
        //* :- 2 or 1 * i - 1

        //up
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //down
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        //space formula : 2 * (n - i) [Butterfly]
        //up
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //down
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}