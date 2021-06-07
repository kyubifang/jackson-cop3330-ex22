/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jamar Jackson
 */

package base;

import java.util.Scanner;

/*
Exercise 22 - Comparing Numbers

Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.
Example Output

Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint

    Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges

    Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
    Modify the program so that it asks for ten numbers instead of three.
    Modify the program so that it asks for an unlimited number of numbers.

 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int one = myApp.first();
        int two = myApp.second();
        int three = myApp.third();
        int compare = myApp.findLargest(one, two, three);
        String outputString = myApp.generateOutputString(compare);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public int first() {
        System.out.println("Enter the first number: ");
        return in.nextInt();
    }

    public int second() {
        System.out.println("Enter the second number: ");
        return in.nextInt();
    }

    public int third() {
        System.out.println("Enter the third number: ");
        return in.nextInt();
    }

    public int findLargest(int one, int two, int three) {
        int large = one;
        if(two > one) {
            if(two > three) {
                large = two;
            }else{
                large = three;
            }
        }else if(three > one){
            large = three;
        }
        return large;
    }

    public String generateOutputString(int compare) {
        return "The largest number is " + compare + ".";
    }
}
