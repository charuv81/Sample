package SampleClass;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        System.out.println("Select the operation to be performed.\n1. Addition\n2. Subtraction");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();

        System.out.println("Enter the two numbers one after the other.\nEnter the first number.");
        int a = scanner.nextInt();
        System.out.println("Enter the second number.");
        int b = scanner.nextInt();

        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

        switch (operation)
        {
            case 1:
                arithmeticOperations.add(a,b);
                break;
            case 2:
                arithmeticOperations.subtract(a,b);
                break;
            case 3:
                arithmeticOperations.multiply(a,b);
                break;
            case 4:
                arithmeticOperations.division(a,b);
                break;
        }

    }


    public int add(int A, int B)
    {
        int temp = A + B;
        System.out.println("Result of adding " + A +  " and " + B + " is " + temp);
        return temp;
    }

    // Subtraction

    public int subtract(int A,int B) {
        int temp = A - B;
        System.out.println("Result of subtracting " + A + "and " + B + "is " + temp);
        return temp;

    }



    // Multiplication

    public int  multiply (int A, int B)
    {
        int temp =  A  * B;
        System.out.println("Result of multiplyng " + A +  "and " + B + " is " + temp);
        return temp;

    }



    //Division

    public int division (int A, int B)
    {
        int temp =  A / B;
        System.out.println("Result of dividing " + A +  "and " + B + " is " + temp);
        return temp;

    }

            //Modulus


    // Percentage

}
