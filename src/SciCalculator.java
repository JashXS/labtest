import java.text.DecimalFormat;
import java.util.Scanner;//Jash Patel and Sathyam Patel Lab 03

public class SciCalculator

{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        double Current = 0.0;//identifying the variables
        int counter = 0;
        double totResult = 0.0;
        int menu = 0;
        String in1;
        String in2;
        double ave = 0.0;
        double input1 = 0.0;
        double input2 = 0.0;

        while (true)//so that the code keeps repeating on a loop
        {
            System.out.println("Current Result: " + Current);

            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation ");
            System.out.println("6. Logarithm ");
            System.out.println("7. Display Average");
            System.out.println();
            System.out.print("Enter Menu Selection: ");

            menu = input.nextInt();

            if (menu < 0 || menu > 7)//what to do if a invalid option is selected
            {
                System.out.println("Error: Invalid selection!");
                System.out.print("Enter Menu Selection: ");
                menu = input.nextInt();
            }
            if (menu == 7)//setting up the average calculator
            {
                if (counter == 0)
                {
                    System.out.println("Error: No calculations yet to average!");
                    System.out.print("Enter Menu Selection: ");
                    menu = input.nextInt();
                } else if (counter > 0)
                {
                    ave=(totResult / counter);
                    DecimalFormat numbfat = new DecimalFormat("#0.00");
                    System.out.println("Sum of calculations: " + numbfat.format(totResult));
                    System.out.println("Number of calculations: " + counter);
                    System.out.println("Average of calculations: " + numbfat.format(ave));
                    System.out.print("Enter Menu Selection: ");
                    menu = input.nextInt();
                }
            }
            if (menu == 0)//to exit the program

            {
                System.out.println("Thanks for using this calculator. Goodbye!");
                break;
            }

            if (menu >= 1 && menu <= 6)//if bracketing for the operations
            {


                System.out.print("Enter first operand: ");
                in1= input.next();//register as a string first
                if(in1.equals("RESULT"))//if it finds a result then it will make it equal to current
                    {in1=String.valueOf(Current);}
                    input1= Double.parseDouble(in1);//then switches the string to a double


                System.out.print("Enter second operand: ");
                in2= input.next();
                if(in2.equals("RESULT"))
                {in2=String.valueOf(Current);}
                input2= Double.parseDouble(in2);



                    if (menu == 1)
                    {
                        Current = input1 + input2;

                    } else if (menu == 2)
                    {
                        Current = input1 - input2;

                    } else if (menu == 3)
                    {
                        Current = input1 * input2;

                    } else if (menu == 4)
                    {
                        Current = input1 / input2;

                    } else if (menu == 5)
                    {
                        Current = Math.pow(input1, input2);
                    } else if (menu == 6)
                    {

                        Current = (Math.log(input2) / Math.log(input1));
                    }
                    counter = counter + 1;//adds one to the counter for the ave sum
                    totResult = totResult + Current;//for ave sum


                }

            }

        }
    }

