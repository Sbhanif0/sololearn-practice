/*
    Java Topics
Basic Concepts
    1.Getting started with java
    2.Multiple statements
    3.Program Structure  
    4.Variables
    5.Variable types
    6.Doing math
    7.Java comments
    8.Module 1 quiz
Control Flow
    9.Taking user input
    10.Conditionals
    11.The switch statement
    12.Multiple conditions
    13.While loops
    14.For loops 
    15.Mudule 2 quiz
Arrays
    16.Arrays
    17.Looping over arrays
    18.Multidimentional arrays
    19.Module 3 quiz 
Methods
    20.Methods
    21.Method parameters
    22.Returning from methods
    23.Module 3 quiz
   
 */
// Created : Sunday, August 6, 2023, 4:38:55 PM
import java.util.Scanner;

public class Introduction {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //Basic Concepts
        basicConcepts();

        //Control Flow
        controlFlow();

        //Arrays
        Arrays();

        // Methods
        methods();

        System.out.println("\n"+"Java Introduction End"+"\n");

    }// main method

    static void methods() {
        System.out.println("\n"+"Methods <^>"+"\n");

        /*
         * 20.Methods
         * 
         * A method is a block of code designed to perform a particular task.
         * For example, our app can have methods like login(), logout(), convert(), etc.
         * The println() that we use for output is also a method.
         * The purpose of a method is to create it once and call it
         * Methods can take multiple parameters. For that,
         * we simply need to separate them using commas,
         * 
         */
        // The values passed as parameters are called arguments.
        mParameter("sbhanif", 20);
        calcu(6.5, 10);
        inchToFeet(126);
        feetToInch(10.5);
        double myRes = returnValue(50, 50, "Abu Hanif");
        System.out.println(myRes+" is sum return");

        int mInt = 20;
        if (checking(mInt) == true) {
            System.out.println("Congrats");
        } else {
            System.out.println("False");
        }

        double f = 32;
        System.out.println(fahr(f) + " Forenheight");

    }

    static void Arrays() {
        System.out.println("\n"+"Arrays <^>"+"\n");

        /*
         * 16.Arrays
         * An array stores multiple values in a single variable.
         * An array needs to be declared, just like a variable,
         * with the type of the items it will hold. 'int[ ] ages;'
         * The items in an array are accessed using their position, also called their
         * index.
         * Array start 'index' from 0;
         */
        int[] fisrtArray;
        fisrtArray = new int[5];
        fisrtArray[1] = 40;
        System.out.println(fisrtArray[1] + " = Array syntax");
        // Creating an array of 5 integers in one line
        int[] firstArray = new int[5];
        firstArray[0] = 20; // 0 is 1;
        System.out.println(firstArray[0]);
        // instead of assigning them one by one, you can use the following syntax:
        char[] charArray = { 'A', 'B', 'U', 'H', 'N' };
        System.out.println(charArray[0] + " = Array output");

        // Vending Machine
        String[] drinks = { "Modhu", "Water", "Honey" };
        int choice = 2;
        if (choice < 0 || choice > 2) {
            System.out.println("Invalid");
        } else {
            System.out.println(drinks[choice]);
        }

        // 17.Looping over arrays
        System.out.println("Bellow item are looping over array");
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i]);
        }

        int[] sumArray = { 5, 6, 7, 8, 9 };
        int sum = 0;
        for (int i = 0; i < sumArray.length; i++) {
            sum += sumArray[i];
            System.out.println(sum);
        }
        System.out.println("Total sum of array values for loop = " + sum);

        // for-each loop
        for (int i : sumArray) {
            System.out.println(i + " = Fetching array value with for-each loop");
        }
        sum = 0;
        for (int i : sumArray) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println("Total sum of array values with for-each loop = " + sum);

        /*
         * 18.Multidimentional arrays
         * Arrays can have multiple dimensions (or number of indices).
         * 
         * For example, imagine a ticketing program that is storing seat numbers in a
         * stadium, which have a row and column number.
         * 
         * Or a chess board, where each square has 2 coordinates: a letter and a number
         * 
         * To access an element in the two-dimensional array, provide two indexes, one
         * for the array, and another for the element inside that array.
         * 
         */

        /*
         * The following example accesses the first element in the second array of
         * sample:
         * The array's two indexes are called row index and column index.
         * Here is how we can visualize it:
         */
        int[][] rowCol = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        int d = rowCol[1][0];
        System.out.println(d + " it's sample two dimen array output");

        for (int array = 0; array < rowCol.length; array++) {
            for (int arrValue = 0; arrValue < rowCol[array].length; arrValue++) {
                System.out.println(rowCol[array][arrValue] + " sb");
            }
        }
        // Movie ticketing
        int[][] seats = {
                { 0, 1, 1, 0, 1, },
                { 1, 0, 1, 1, 0, },
                { 0, 1, 0, 1, 1, },
                { 0, 0, 1, 0, 1, },
        }; // theatre row is 4 and column is 5
        int row, column;
        row = 3;
        column = 4;

        if (seats[row][column] == 0) {
            System.out.println("Seat is Free");
        } else {
            System.out.println("Seat is Sold"+"\n");
        }


            // My Videos
            String[] myVideoString = new String[10];
            myVideoString[0] = "1 Video Title";
            myVideoString[1] = "2 Video Title";
            myVideoString[2] = "3 Video Title";
            myVideoString[3] = "4 Video Title";
            myVideoString[4] = "5 Video Title";
            myVideoString[5] = "6 Video Title";
            myVideoString[6] = "7 Video Title";
            myVideoString[7] = "8 Video Title";
            myVideoString[8] = "9 Video Title";
            myVideoString[9] = "10 Video Title";
            // Looping Over Array
            for (int x = 0; x < myVideoString.length; x += 1) {
                System.out.println(myVideoString[x]);
            }
            System.out.println(); // For Space
    
            // Public Videos
            String[] pVideoStrings = new String[10];
            pVideoStrings[0] = "Monir Hosen";
            pVideoStrings[1] = "Saiful Islam";
            pVideoStrings[2] = "Kabir Hosen";
            pVideoStrings[3] = "Dibol Hosen";
            pVideoStrings[4] = "Amir Hosen";
            pVideoStrings[5] = "kadir Hosen";
            pVideoStrings[6] = "Anar Hosen";
            pVideoStrings[7] = "jakir Hosen";
            pVideoStrings[8] = "rakib Hosen";
            pVideoStrings[9] = "Ali Hosen";
    
            for (int i = 0; i < pVideoStrings.length; i++) { // Fetch all videos
                System.out.println(pVideoStrings[i]);
    
                for (int x = 0; x < myVideoString.length; x += 4) { // This for loop is skip 4 videos
    
                    if (i == x) {
                        System.out.println("\n" + myVideoString[x] + "\n");
                    }
    
                }
            }






    }

    static void basicConcepts() {
        System.out.println("\n"+"Basic Concepts <^>"+"\n");

        /*
         * 1.Getting started with java
         * Welcome to Java!
         * Java is one of the most popular programming languages.
         * Java's slogan is "Write once, run anywhere".
         * Java programs can run on different platforms,
         * including mobile, desktop, and other portable systems.
         * You can use Java to build apps, games, banking applications,
         * web apps, and much more!
         */
        // Java Output System
        System.out.println("Hello, Hanif! This is java output system");

        /*
         * 2.Multiple statements
         * Statement
         * A line of code is called a statement. A statement
         * performs a specific task.
         * The output command is an example of a statement.
         * System.out.println("Write once, run anywhere!");
         * 
         * //Multiple statements
         * System.out.println("Write once, run anywhere!");
         * System.out.println("Write once, run anywhere!");
         * 
         * Each statement needs to end with a semicolon ;.
         * When you give the computer many statements,
         * the instructions will be executed line by line,
         * from top to bottom.
         * 
         * Computers treat text and numbers differently.
         * When printing text outputs,
         * you need to enclose the text in double quotes.
         * You don't need quotes when outputting numbers.
         * System.out.println("Points:");
         * System.out.println(500);
         */

        /*
         * 3.Program Structure
         * Every java program need a main medthod for identically indentify.
         */

        /*
         * 4.Variables
         * Every program works with values.
         * A variable lets you store a value by assigning it to a name.
         * The name can be used to refer to the value later in the program.
         * Every variable has a type, which defines the type of the value it holds.
         * 
         */
        // Variable Declaration
        String myName;
        myName = "Sb HaniF";
        System.out.println(myName);

        String changeVar = "it's hanif";
        changeVar = "Variable Changed";
        System.out.println(changeVar);

        // 5.Variable Types (Data Types), String, int, double, float, char, boolean,
        // re: data type koto prokar?

        // Integer Numbers
        int itIsInteger = 50;
        System.out.println(itIsInteger + " It's Integer");

        // Decimals number
        double itIsDecimal = 50.30;
        System.out.println(itIsDecimal + " = it's double");

        // Another Decimals float is less storage is memory.
        float itIsFloat = 40.45f;
        System.out.println(itIsFloat + " " + " = it's float");
        // re: double vs float

        // Characters
        char itIsChar = 'H';
        System.out.println(itIsChar + " = it's char");

        // Boolean value is ony true or false
        boolean itIsBoolean = true;
        System.out.println(itIsBoolean + " = it's boolean");

        /*
         * 6.Doing math
         * + is addition
         * - is subtraction
         * / is division
         * % finds the remainder of a division.
         */
        int stBalance = 1002;
        System.out.println(stBalance + " = straight balance");

        int sumSt = stBalance + 98;
        System.out.println(sumSt + " = sum Straight balance");

        int stOne = 200;
        int stTwo = 100;
        int stSum = stOne + stTwo;
        System.out.println(stSum + " = stSum"); // mminus - is same with sum

        // multiplication
        int itemMulti = 1200;
        System.out.println(itemMulti * 0.2 + " = multiplication, 20% of 1200");

        // division
        int itemPerMan = 100;
        int man = 50;
        int pies = itemPerMan / man;
        System.out.println(pies + " = 100 item divided for 50 man");

        // The modulo % (or remainder) math operation returns the remainder of a
        // division.
        int div = 53;
        int div2 = 5;
        int divRes = div / div2;
        int divModulo = div % div2;
        System.out.println(divRes + " = division result and " + divModulo + " = division modulo.");

        // String with plus + operator
        String firstName = "Abu ";
        String lastName = "Hanif";
        String concatenationString = firstName + lastName;
        System.out.println(concatenationString + " = String Concatenation");

        int wins = 54;
        int runners = 54;
        double winRes = wins + 0.5 * runners;
        double runnerRes = wins * 0.5;
        System.out.println(winRes + " = Wining price And " + runnerRes + " = Runner price");

        // 7.Java comments
        // is single line comments
        /* is multiline comments */
        // 8. Modulo 1 quiz
        System.out.println("Modulo 1 Quiz");

    }// basic concepts

    static void controlFlow() {
        System.out.println("\n"+"Control Flow <^>"+"\n");

        // 9.Taking user input
        takingUserInout();
        /*
         * 10.Conditionals
         * Conditional statements are used to perform different
         * actions based on different conditions.
         * 
         * Any of the following comparison operators may be used to form the condition:
         * < less than
         * > greater than
         * != not equal to
         * == equal to
         * <= less than or equal to
         * >= greater than or equal to
         */
        int myAge = 20;
        if (myAge > 18) {
            System.out.println("> Welcome");
        }
        if (myAge == 20) { // one = sign is assign operator, test equality with == equal sign
            System.out.println("== Testing equality");
        }

        if (myAge < 18) {
            System.out.println("< Our app is not for you");
        } else {
            System.out.println("<18 else Welcome to our app");
        }
        // nested if else statement
        if (myAge >= 12) {
            System.out.println("U12 >= Some Feature is not available");
            // Nested if else
            if (myAge >= 18) {
                System.out.println(">=18 All Feature is available");
            } else { // Optional
                System.out.println("Some Feature is not available. Cause, You too young");
            }
        } else {
            System.out.println("Age Error");
        }
        // else if statements, line by line execute
        if (myAge != 0) {
            System.out.println("Not Equal to 0 zero");
        } else if (myAge == 20) {
            System.out.println("Age is 20");
        } else if (myAge < 21) {
            System.out.println("Age is less than 21");
        } else if (myAge > 17) {
            System.out.println("Age is greater than 17");
        } else {
            System.out.println("Age is Equal to 0 error ");
        } // Cannot use else if outside of else

        /*
         * 11.The switch statement
         * Instead of many if else statements, which become hard to read, we can use a
         * switch statement.
         * A switch statement tests a variable for equality against a list of values.
         */
        int switchTest = 20;
        switch (switchTest) {
            case 220: // Each case is followed by the comparison value and a colon.
                System.out.println("imt");
                break; // need a break for stop executing
            /*
             * It is important to have a break statement for each case.
             * If no break appears,
             * the program will continue to execute the next case in the switch,
             * even if the value does not match the variable that is switched on.
             */
            case 2:
                System.out.println("right");
                break;
            default:
                System.out.println("It's default case");
                /*
                 * A switch statement can have an optional default case.
                 * The default case can be used for performing a task when
                 * none of the cases is matched.
                 * No break is needed in the default case,
                 * as it is always the last statement in the switch.
                 */
        }
        String switchString = "my number";
        switch (switchString) {
            case "My number":
                System.out.println("+" + 880 + " BGD");
                break;
            default:
                System.out.println("+" + 880 + " BGD CODE");
                break;
        }

        /*
         * 12.Multiple conditions
         * In some cases we need to combine multiple conditions, for example, let's say
         * we want to check if the age value is greater than 18 and less than 50.
         * This can be done using the && operator.
         */
        // logical AND (&&) operator
        if (myAge > 17 && myAge < 50) {
            System.out.println("&& Operator Test = You are most welcome");
        }
        // OR (||) operator, The OR operator (||) checks if any one of the conditions is
        // true.
        int myHeight = 6;
        if (myAge > 17 || myHeight > 10) {
            System.out.println("OR || Operator Test Success");
        }
        /*
         * logical NOT (!) operator
         * The NOT (!) logical operator is used to reverse the condition.
         * If a condition is true,
         * the NOT logical operator will make it false, and vice versa.
         */
        if (!(myAge < 23)) { // !(age > 18) reads as "if age is NOT greater than 18".
            System.out.println("Too big");
        } else {
            System.out.println("NOT (!) operator test success");
        }
        // Chaining multiple condition using parentheses and the logical operator
        String country = "BD";
        if ((country == "BD" || country == "US") && (myAge > 17 && myAge < 60)) {
            System.out.println("Chaning success to multiple condition using parentheses");
        }

        /*
         * 13.While loops
         * Loops allow you to repeat a block of code multiple times.
         * A while loop statement repeatedly executes a target statement as long as a
         * given condition is true.
         */

        while (myAge > 17) {
            System.out.println(myAge + " While loop downgrade " + "(" + myAge + ")");
            myAge = myAge - 1;
        }
        while (myAge < 20) {
            System.out.println(myAge + " While loop upgrade " + "(" + myAge + ")");
            myAge++;
        }
        while (myAge <= 24) {
            System.out.println(myAge + " Even Numbers " + "(" + myAge + ")");
            myAge += 2;
        }
        /*
         * do while loop
         * The difference between while and do-while is that
         * do-while is guaranteed to run at least once, even with a false condition.
         */
        do {
            System.out.println(myAge + " do-while loop" + "(" + myAge + ")");
            myAge++;
            if (myAge == 28) {
                System.out.println("(" + myAge + ")" + " Keep It Mind");
            }
        } while (myAge <= 28);
        int sum = 0;
        while (myAge <= 34) { // looping 6 six times
            sum += myAge;
            System.out.println(myAge + " " + sum);
            myAge++;
        }
        int doLooping = 4;
        sum = 0;
        while (myAge <= 37) { // looping 6 six times
            sum += doLooping++;
            myAge++;
        }
        // Changing the variable value
        doLooping = 4;
        sum = 0;
        while (doLooping > 0) {

            sum += doLooping--; // First value is same 4 not decrease or increase.
            if (doLooping == 3) {
                System.out.println(sum + " Not changing the first round value of loops four 4");
            } else if (doLooping == 2) {
                System.out.println(sum + " Second round is increment three 3");
            } else if (doLooping == 1) {
                System.out.println(sum + " Third round is increase two 2");
            } else if (doLooping == 0) {
                System.out.println(sum + " Fourth round is increase one 1");
            } // break will be terminating the loop
        }
        System.out.println(sum + " = Sum of the 'doLooping' while loops, 4+3, 7+2, 9+1");

        /*
         * 14.For loops
         * The first part runs once when we enter the loop and initializes the variable.
         * The second part is the condition of the loop.
         * The third part runs every time the loop runs.
         * Notice the semicolons (;) after the parts of the loop.
         * The for loop is best when we know the number of times we need to run the
         * loop.
         * You can have any type of condition and any type of increment statements in
         * the for loop.
         * Remember the 'break' statement from the switch?
         * It can also be used to terminate loops.
         */
        for (int i = 1; i < 5; i++) {
            System.out.println(i + " for loops" + "(" + i + ")");
        }
        int i = 1;
        for (i = 2; i <= 4; i++) {
            System.out.println(i + " for loop's outside condition ");
        }
        for (i = 5; i > 3; i++) {
            System.out.println(i + " Focus in break;" + "(" + i + ")");
            if (i == 7) {
                break; // break is terminating loop
            }
        }
        for (i = 2; i <= 10; i += 2) {
            System.out.println(i + " Even number printing");
            if (i >= 6) {
                break;
            }
        }
        /*
         * Continue
         * Another control statement is continue.
         * It makes the loop skip the current iteration and go to the next one.
         * 
         * 
         */
        for (i = 10; i <= 20; i += 5) {
            if (i == 15) {
                continue; // 15 this iteration will be skip.
            }
            System.out.println("Try to use continue statement = " + i);
        }
        for (i = 0; i <= 5; i++) {
            if (i <= 3) {
                continue;
            }
            System.out.println(i + " Passanger");
        }
        int multi = 1;
        for (i = 1; i <= 5; i++) {
            multi *= i;
        }
        System.out.println("1*2*3*4*5 = " + multi);

    }////////

    private static void takingUserInout() {
        System.out.println("Type your name bellow : ");
        // Scanner userInput = new Scanner(System.in);
        String userName = userInput.nextLine(); 
        System.out.println("Name " + userName);

        System.out.println("Type your age bellow : ");
        int userPoint = userInput.nextInt(); // nextDouble, nextFloat, nextBoolean, is same.
        System.out.println("Points " + userPoint);
    }


    static void mParameter(String name, int age) { // Taking multiple parameter using comma,
        System.out.println("Name : " + name);
        System.out.println("Ages : " + age);
    }

    // 21.Method parameters 
    static void calcu(double fdouble, int sint) {
        double res = fdouble * sint / 10;
        System.out.println("Calcu Res is = " + res);
    }

    static void inchToFeet(double inch) {
        double res = inch / 12;
        System.out.println(inch + " Inch = " + res + " Foot");
    }

    static void feetToInch(double foot) {
        double res = foot * 12;
        System.out.println(foot + " Foot = " + res + " Inch");
    }

    /* 22.Returning from methods
     * The methods we have seen so far output their result.
     * In some cases we do not need to output the result,
     * but need to assign it to a variable, to work with it in our program.
     * In these cases, we need our method to return the result value.
     * void keyword is not return any value;
     * 
     * The return keyword stops the method from executing.
     * If there are any statements after return, they won't run.
     * 
     */
    static double returnValue(double fd, int fint, String name) {
        double res = fd + fint;
        double extra = res * 0.20;
        System.out.println("Business Reserve is : " + extra+"% of "+res);
        System.out.println("My Name : " + name);

        return res;
        // after the return statement, this code will be unreachable
    }

    static boolean checking(int iInt) {
        if (iInt >= 18) {
            return true;
        } else {
            return false;
        }
    }

    static double fahr(double c) {
        return c * 1.8 + 32;
    }





}// class
