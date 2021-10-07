import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {

        //set variables
        String sN;
        double s1;
        double c;
        double gN;
        String trash;




        //create scanner to read file
        Scanner s = new Scanner(System.in);


        //store the numbers into their variables
        trash = s.next();
        s1 = s.nextDouble();
        trash = s.next();
        c = s.nextDouble();
        trash = s.next();
        gN = s.nextDouble();


        //close scanner
        s.close();






        //find the equation S(n) *** to print ***
        sN = "S(n) = " + c + "^(n-1) * " + s1 + " + sigma(" + c + "^(n-i) * " + gN + ")";



        //print out equation
        System.out.println("S(n): " + sN);



        //complete first 10 calculations using above equation and print
        for(int n=1; n<=10; n++)
        {
            //store first part of equation in answer variable
            double answer = (Math.pow(c,(n-1)) * s1);

            //sigma for loop
            for(int i=2; i<=n; i++)
            {
                //add the sigma part to the answer
                answer += (Math.pow(c,(n-i)) * gN);
            }

            //print out the answer
            System.out.println("S(" + n + ") = " + answer);
        }

    }
}
