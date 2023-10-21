public class Raph {
    public static void main(String[] args) {
        int input = 11;
        if (input % 2 == 0) {
            System.out.println("Even Number => " + input);
        } else {
            System.out.println("Odd Number => " + input);

        }

        char character = 'a';
        if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U'
                || character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("Vowel Word => (" + character + ")");
        } else {
            System.out.println("Consonant Word => " + character);
        }

        // conditional operator
        int num1 = 10;
        int num2 = 50;
        int large = (num1 > num2) ? num1 : num2;
        System.out.println(large + " Is large number of => " + num1 + "," + num2);

        System.out.println(Math.min(num1, num2) + " Is Minmum number of => " + num1 + "," + num2);
        System.out.println(Math.max(num1, num2) + " Is Maximum number of => " + num1 + "," + num2);
        double round = 12.5;
        System.out.println(Math.round(round) + " Is round number of => " + round);

        // namta
        System.out.println("Namta");
        int num = 12;
        for (int i = 1; i <= 10; i++) {
            if (i == 1 && num < 10) {
                System.out.println(num + " x " + i + " = " + "0" + num * i);
                continue;
            } else if (i == 10) {
                System.out.println(num + " x " + i + " =" + num * i);
                continue;
            }
            System.out.println(num + " x " + i + " = " + num * i);

        }

        int start = 5, end = 10;

        for (int i = start; i <= end; i++) {
            System.out.println("\n" + i + " Er Namta " + System.lineSeparator());

            for (int sb = 1; sb <= 10; sb++) {
                System.out.println(i + " X " + sb + " = " + i * sb);
            }

        } ///

        // Prime number
        int prime = 21;
        int primeNum = 0;
        for (int i = 2; i <= prime; i++) {
            if (i % prime == 0) {
                primeNum++;
            }
        }
        if (primeNum == 0) {
            System.out.println(prime + " => Is Prime Number");
        } else {
            System.out.println(prime + " => Is Not Prime Number \n");
        }

        int first = 2, last = 30, prResult = 0, totalPrime = 0;
        for (int i = first; i <= last; i++) {
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    prResult++;
                    break;
                }
            }
            if (prResult == 0) {
                System.out.println(i + " Prime Number");
                totalPrime++;
            }
            prResult = 0;
        }
        System.out.println("Total Prime Number => " + totalPrime);

        /// Fibonacci series
        int firstNum = 0, secondNum = 1, fibo = 0, need = 8, n = 6;
        System.out.print(firstNum + " + " + secondNum);
        int h = 0;
        for (int i = 3; i <= need; i++) {
            fibo = firstNum + secondNum;
            if (i == need) {
                System.out.println(" => " + fibo);
                continue;
            }
            System.out.print(" + " + fibo);
            firstNum = secondNum;
            secondNum = fibo;
            if (i == n) {
                h = fibo;
            }

        }
        System.out.println(n + " Number position is => (" + h + ")"+"\n");

       
        

    }//////

}
