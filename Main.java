/************************************
 Creator: Vidash Khelawan
 Purpose: To Accept 2 integers from the user and compute it
****************************************/


import java.util.Scanner; //importing the method to take in user input.

//This is a super class for Multiply class
class Divide
{
   int ans; //This value will be inherited by the Multiply class
    void Divide(int x, int y)
   {
       ans = (x/y);
       System.out.printf("The answer is : %d \n",ans);
   }

}

//Main class (extends to the Divide class
public class Main extends Divide {

     private void Multiply(int x, int y)
     {
         //This is inherited from the super class.
        ans = (x*y);
        System.out.printf("The answer is : %d \n",ans);
    }

    public static void main (String[] args) {

         //instantiating the method that's called Scanner
        Scanner input = new Scanner(System.in);

        //instantiating the method that's called main
        Main opp_0 = new Main();

        //instantiating the class that's Add_sub1
        Add_sub1 opp_1 = new Add_sub1();

        //Continuous while loop

        while (true) {

            //taking in the first value from the user
            System.out.print("Enter the first number \n");
            int value = input.nextInt();
            //Giving the user the choose between the different options
            System.out.print("Enter the user Choice \n");
            System.out.print("1: Add \t 2:Subtract \t 3:Multiply \t 4:Divide \n");
            int user_choice = input.nextInt();
            //Taking the second value from  the user
            System.out.print("Enter the Second number \n");
            int value1 = input.nextInt();

            //Switch statue that's handling the user choice
            switch (user_choice) {
                case 1: {

                    //using the different instantiated name to called for the classes
                    opp_1.add(value, value1);
                    break;
                }
                case 2: {

                    //using the different instantiated name to called for the classes
                    opp_1.subtract(value, value1);
                    break;
                }
                case 3: {

                    //using the different instantiated name to called for the classes
                    opp_0.Multiply(value, value1);
                    break;
                }
                case 4: {

                    //using the different instantiated name to called for the classes
                    opp_0.Divide(value, value1);
                    break;
                }
                //Default print statement
                default:
                    System.out.print("Error: Try Again \n");
            }

        }
    }
}
